/*
 * Copyright 2021 Skyscanner Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software  * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and  * limitations under the License.
 */
package org.sonar.skyscanner.java.checks;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.regex.Pattern;

import org.sonar.api.rules.RulePriority;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.api.rules.RuleType;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;
import org.sonar.plugins.java.api.tree.VariableTree;
import org.sonar.plugins.java.api.tree.LiteralTree;
import org.sonar.plugins.java.api.tree.ExpressionTree;
import org.sonar.plugins.java.api.tree.AssignmentExpressionTree;
import org.sonar.plugins.java.api.tree.BinaryExpressionTree;
import org.sonar.plugins.java.api.tree.MethodInvocationTree;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;


@Rule(
    key = "sonar-secrets-java-03",
    name = "Hardcoded AWS Credentials",
    description = "Hardcoded AWS secrets can be abused to gain unauthorized access to the shared cluster and/or the VPC.",
    priority = Priority.BLOCKER,
    tags = {
        "security",
        "skyscanner",
        "vulnerability"
    }
)
public class AWSCredentials extends IssuableSubscriptionVisitor {

    private static final Pattern AWS_ACCESS_KEY_ID = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]{20}");
    private static final Pattern AWS_SECRET_ACCESS_KEY = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9+/]{40}", Pattern.CASE_INSENSITIVE);
    private static final Pattern AWS_SESSION_TOKEN = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9+/]{270,290}", Pattern.CASE_INSENSITIVE);

    private void validate(Tree tree, String variable, String value) {
        variable = Utils.trimQuotes(variable.toLowerCase());
        value = Utils.trimQuotes(value);

        if (value.length() > 0) {
            if (AWS_ACCESS_KEY_ID.matcher(value).matches() || AWS_SESSION_TOKEN.matcher(value).matches()) {
                reportIssue(tree, "Hardcoded AWS secrets can be abused to gain unauthorized access to the shared cluster and/or the VPC.");
            } else if (AWS_SECRET_ACCESS_KEY.matcher(value).matches()) {
                if (Entropy.getShannonEntropy(value) > 4.5) {
                    reportIssue(tree, "Hardcoded AWS secrets can be abused to gain unauthorized access to the shared cluster and/or the VPC.");
                }
            }
        }
    }

    @Override
    public List<Kind> nodesToVisit() {
        return ImmutableList.of(
            Kind.ASSIGNMENT, 
            Kind.EQUAL_TO,
            Kind.VARIABLE,
            Kind.METHOD_INVOCATION
        );
    }

    @Override
    public void visitNode(Tree tree) {
        String variable = "";
        String value = "";

        if (tree.is(Kind.VARIABLE)) {
            VariableTree obj = (VariableTree)tree;

            if (obj.initializer() != null && obj.initializer().is(Kind.STRING_LITERAL)) {
                variable = obj.simpleName().toString();
                value = ((LiteralTree)obj.initializer()).value();
            }

        } else if (tree.is(Kind.ASSIGNMENT)) {
            AssignmentExpressionTree obj = (AssignmentExpressionTree)tree;

            if (obj.expression().is(Kind.STRING_LITERAL)) {
                variable = obj.variable().toString();
                value = ((LiteralTree)obj.expression()).value();
            }

        } else if (tree.is(Kind.EQUAL_TO)) {
            BinaryExpressionTree obj = (BinaryExpressionTree)tree;
            
            if (obj.leftOperand().is(Kind.IDENTIFIER) && obj.rightOperand().is(Kind.STRING_LITERAL)) {
                variable = obj.leftOperand().toString();
                value = ((LiteralTree)obj.rightOperand()).value();
            } else if (obj.rightOperand().is(Kind.IDENTIFIER) && obj.leftOperand().is(Kind.STRING_LITERAL)) {
                variable = obj.rightOperand().toString();
                value = ((LiteralTree)obj.leftOperand()).value();
            } 

        } else if (tree.is(Kind.METHOD_INVOCATION)) {
            MethodInvocationTree obj = (MethodInvocationTree)tree;

            for (ExpressionTree arg : obj.arguments()) {
                if (arg.is(Kind.STRING_LITERAL)) {
                    validate(tree, "", ((LiteralTree)arg).value());
                }
            }
        } 

        if (!value.isEmpty()) {
            validate(tree, variable, value);
        }
    }
}
