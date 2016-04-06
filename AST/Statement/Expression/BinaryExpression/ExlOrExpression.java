package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class ExlOrExpression extends Expression {
    public Expression lhs, rhs;

    public ExlOrExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
