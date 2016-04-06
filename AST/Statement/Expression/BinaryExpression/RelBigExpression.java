package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class RelBigExpression extends Expression {
    public Expression lhs, rhs;

    public RelBigExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
