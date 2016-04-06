package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class PostArrayExpression extends Expression {
    public Expression lhs, rhs;

    public PostArrayExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
