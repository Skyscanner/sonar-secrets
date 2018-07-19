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

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.javascript.api.tree.Tree;
import org.sonar.plugins.javascript.api.tree.Tree.Kind;
import org.sonar.plugins.javascript.api.tree.declaration.BindingElementTree;
import org.sonar.plugins.javascript.api.tree.declaration.InitializedBindingElementTree;
import org.sonar.plugins.javascript.api.tree.declaration.FieldDeclarationTree;
import org.sonar.plugins.javascript.api.tree.expression.BinaryExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.LiteralTree;
import org.sonar.plugins.javascript.api.tree.expression.AssignmentExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.PairPropertyTree;
import org.sonar.plugins.javascript.api.tree.expression.ExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.ArrayLiteralTree;
import org.sonar.plugins.javascript.api.visitors.DoubleDispatchVisitorCheck;


@Rule(
    key = "sonar-secrets-javascript-02",
    name = "High Entropy String",
    description = "High entropy strings are likely cryptographic material. Review manually to ensure private/secret keys are not hardcoded.",
    priority = Priority.MAJOR,
    tags = {
        "security",
        "skyscanner",
        "vulnerability"
    }
)
public class HighEntropy extends DoubleDispatchVisitorCheck {

    private static final double ENTROPY_THRESHOLD = 5.6; // Shannon Entropy higher than this will be reported

    private void validate(Tree tree, String variable, String value) {
        value = Utils.trimQuotes(value);
        
        if (Entropy.getShannonEntropy(value) >= ENTROPY_THRESHOLD) {
            addIssue(tree, "High entropy strings are likely cryptographic material. Review manually to ensure private/secret keys are not hardcoded.");
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

    public void visitArrayLiteral(ArrayLiteralTree tree) {
        for (ExpressionTree element : tree.elements()) {
            if (element.is(Kind.STRING_LITERAL)) {
                validate(tree, "", element.toString());
            }
        }

        super.visitArrayLiteral(tree);
    }
}
