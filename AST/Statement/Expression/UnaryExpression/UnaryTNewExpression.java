package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class UnaryTNewExpression extends Expression {
    public Expression uhs;

    public UnaryTNewExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
