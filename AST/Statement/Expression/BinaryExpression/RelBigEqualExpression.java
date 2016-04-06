package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class RelBigEqualExpression extends Expression {
    public Expression lhs, rhs;

    public RelBigEqualExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
