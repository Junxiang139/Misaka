package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class PostMMExpression extends Expression {
    public Expression uhs;

    public PostMMExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
