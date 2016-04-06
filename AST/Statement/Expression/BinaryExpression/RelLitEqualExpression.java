package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class RelLitEqualExpression extends Expression {
    public Expression lhs, rhs;

    public RelLitEqualExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
