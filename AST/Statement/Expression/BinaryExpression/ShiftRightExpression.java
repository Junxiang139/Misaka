package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class ShiftRightExpression extends Expression {
    public Expression lhs, rhs;

    public ShiftRightExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
