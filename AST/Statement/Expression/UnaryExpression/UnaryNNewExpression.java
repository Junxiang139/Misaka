package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class UnaryNNewExpression extends Expression {
    public Expression uhs;

    public UnaryNNewExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
