package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class PostArgumentExpression2 extends Expression {
    public Expression lhs, rhs;

    public PostArgumentExpression2(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
