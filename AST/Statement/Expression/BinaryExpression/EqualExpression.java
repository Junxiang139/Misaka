package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class EqualExpression extends Expression {
    public Expression lhs, rhs;

    public EqualExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
