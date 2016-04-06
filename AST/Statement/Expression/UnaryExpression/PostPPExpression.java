package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;

public class PostPPExpression extends Expression {
    public Expression uhs;

    public PostPPExpression(Expression uhs) {
        this.uhs = uhs;
    }
}
