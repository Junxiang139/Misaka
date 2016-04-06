package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class AddDecExpression extends Expression {
    public Expression lhs, rhs;

    public AddDecExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
