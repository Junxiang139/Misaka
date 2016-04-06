package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class UnaryMMExpression extends Expression {
    public Expression uhs;

    public UnaryMMExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
