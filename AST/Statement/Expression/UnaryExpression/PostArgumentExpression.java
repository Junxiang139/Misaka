package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class PostArgumentExpression extends Expression {
    public Expression uhs;

    public PostArgumentExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
