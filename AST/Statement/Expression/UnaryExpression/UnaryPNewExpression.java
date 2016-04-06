package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class UnaryPNewExpression extends Expression {
    public Expression uhs;

    public UnaryPNewExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
