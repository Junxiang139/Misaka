package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class UnaryPPExpression extends Expression {
    public Expression uhs;

    public UnaryPPExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
