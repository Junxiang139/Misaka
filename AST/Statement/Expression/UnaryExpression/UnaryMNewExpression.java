package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class UnaryMNewExpression extends Expression {
    public Expression uhs;

    public UnaryMNewExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
