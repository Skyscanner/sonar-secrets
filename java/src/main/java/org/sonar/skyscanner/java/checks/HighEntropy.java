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
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;


@Rule(
    key = "sonar-secrets-java-02",
    name = "High Entropy String",
    description = "High entropy strings are likely cryptographic material. Review manually to ensure private/secret keys are not hardcoded.",
    priority = Priority.MAJOR,
    tags = {
        "security",
        "skyscanner",
        "vulnerability"
    }
)
public class HighEntropy extends IssuableSubscriptionVisitor {

    private static final double ENTROPY_THRESHOLD = 5.6; // Shannon Entropy higher than this will be reported

    private void validate(Tree tree, String variable, String value) {
        value = Utils.trimQuotes(value);
        
        if (Entropy.getShannonEntropy(value) >= ENTROPY_THRESHOLD) {
            reportIssue(tree, "High entropy strings are likely cryptographic material. Review manually to ensure private/secret keys are not hardcoded.");
        }
    }

    @Override
    public List<Kind> nodesToVisit() {
        return ImmutableList.of(
            Kind.ASSIGNMENT, 
            Kind.EQUAL_TO,
            Kind.VARIABLE
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

        }

        if (!value.isEmpty()) {
            validate(tree, variable, value);
        }
    }
}
