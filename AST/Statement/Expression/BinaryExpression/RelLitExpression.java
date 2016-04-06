package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class RelLitExpression extends Expression {
    public Expression lhs, rhs;

    public RelLitExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
