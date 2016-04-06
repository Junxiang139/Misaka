package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class MultiModExpression extends Expression {
    public Expression lhs, rhs;

    public MultiModExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
