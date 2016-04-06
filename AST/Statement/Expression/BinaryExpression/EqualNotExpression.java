package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class EqualNotExpression extends Expression {
    public Expression lhs, rhs;

    public EqualNotExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
