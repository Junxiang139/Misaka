package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class MultiMulExpression extends Expression {
    public Expression lhs, rhs;

    public MultiMulExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
