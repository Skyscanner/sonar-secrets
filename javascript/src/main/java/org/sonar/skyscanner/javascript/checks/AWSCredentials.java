/*
 * Copyright 2018 Skyscanner Limited.
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
package org.sonar.skyscanner.javascript.checks;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;
import java.util.Base64;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.javascript.api.tree.Tree;
import org.sonar.plugins.javascript.api.tree.Tree.Kind;
import org.sonar.plugins.javascript.api.tree.declaration.BindingElementTree;
import org.sonar.plugins.javascript.api.tree.declaration.InitializedBindingElementTree;
import org.sonar.plugins.javascript.api.tree.declaration.FieldDeclarationTree;
import org.sonar.plugins.javascript.api.tree.expression.IdentifierTree;
import org.sonar.plugins.javascript.api.tree.expression.BinaryExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.AssignmentExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.PairPropertyTree;
import org.sonar.plugins.javascript.api.tree.expression.ExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.CallExpressionTree;
import org.sonar.plugins.javascript.api.visitors.DoubleDispatchVisitorCheck;

@Rule(
    key = "sonar-secrets-javascript-03",
    name = "Hardcoded AWS Credentials",
    description = "Hardcoded AWS secrets can be abused to gain unauthorized access to the shared cluster and/or the VPC.",
    priority = Priority.BLOCKER,
    tags = {
        "security",
        "skyscanner",
        "vulnerability"
    }
)
public class AWSCredentials extends DoubleDispatchVisitorCheck {
    
    private static final Pattern AWS_ACCESS_KEY_ID = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]{20}");
    private static final Pattern AWS_SECRET_ACCESS_KEY = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9+/]{40}", Pattern.CASE_INSENSITIVE);
    private static final Pattern AWS_SESSION_TOKEN = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9+/]{270,290}", Pattern.CASE_INSENSITIVE);
    private static final Pattern AWS_ARN = Pattern.compile("arn:[\\w\\d\\-_]+:[\\w\\d\\-_]+:[\\w\\d\\-_]*:[\\w\\d\\-_]*:.+", Pattern.CASE_INSENSITIVE);

    private void validate(Tree tree, String variable, String value) {
        variable = Utils.trimQuotes(variable.toLowerCase());
        value = Utils.trimQuotes(value);

        if (value.length() > 0) {
            if (AWS_ACCESS_KEY_ID.matcher(value).matches() || AWS_SESSION_TOKEN.matcher(value).matches()) {
                addIssue(tree, "Hardcoded AWS secrets can be abused to gain unauthorized access to the shared cluster and/or the VPC.");
            } else if (AWS_SECRET_ACCESS_KEY.matcher(value).matches()) {
                if (Entropy.getShannonEntropy(value) > 4.5) {
                    addIssue(tree, "Hardcoded AWS secrets can be abused to gain unauthorized access to the shared cluster and/or the VPC.");
                }
            } else if (AWS_ARN.matcher(value).matches()) {
                addIssue(tree, "Hardcoded AWS secrets can be abused to gain unauthorized access to the shared cluster and/or the VPC.");
            }
        }
    }

    @Override
    public void visitInitializedBindingElement(InitializedBindingElementTree tree) {
        if (tree.right().is(Kind.STRING_LITERAL)) {
            String variable = tree.left().toString();
            String value = tree.right().toString();
            validate(tree, variable, value);
        }

        super.visitInitializedBindingElement(tree);
    }
    
    @Override
    public void visitAssignmentExpression(AssignmentExpressionTree tree) {
        if (tree.expression().is(Kind.STRING_LITERAL)) {
            String variable = tree.variable().toString();
            String value = tree.expression().toString();
            validate(tree, variable, value);
        }
        
        super.visitAssignmentExpression(tree);
    }

    @Override
    public void visitFieldDeclaration(FieldDeclarationTree tree) {
        try {
            if (tree.initializer().is(Kind.STRING_LITERAL)) {
                String variable = tree.propertyName().toString();
                String value = tree.initializer().toString();
                validate(tree, variable, value);
            }
        } catch (Exception e) {}

        super.visitFieldDeclaration(tree);
    }

    @Override
    public void visitBinaryExpression(BinaryExpressionTree tree) {
        String variable = "";
        String value = "";

        if (tree.leftOperand().is(Kind.IDENTIFIER_REFERENCE) && tree.rightOperand().is(Kind.STRING_LITERAL)) {
            variable = tree.leftOperand().toString();
            value = tree.rightOperand().toString();
        } else if (tree.rightOperand().is(Kind.IDENTIFIER_REFERENCE) && tree.leftOperand().is(Kind.STRING_LITERAL)) {
            variable = tree.rightOperand().toString();
            value = tree.leftOperand().toString();
        }

        validate(tree, variable, value);
        super.visitBinaryExpression(tree);
    }

    @Override
    public void visitPairProperty(PairPropertyTree tree) {
        if (tree.value().is(Kind.STRING_LITERAL)) {
            String variable = tree.key().toString();
            String value = tree.value().toString();
            validate(tree, variable, value);
        }

        super.visitPairProperty(tree);
    }

    @Override
    public void visitCallExpression(CallExpressionTree tree) {
        for (ExpressionTree argument : tree.argumentClause().arguments()) {
            if (argument.is(Kind.STRING_LITERAL)) {
                String value = argument.toString();
                validate(tree, "", value);
            }
        }

        super.visitCallExpression(tree);
    }
}
