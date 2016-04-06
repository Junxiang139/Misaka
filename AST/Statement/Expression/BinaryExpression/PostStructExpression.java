package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;
import AST.Statement.Frag.Frag;

public class PostStructExpression extends Expression {
    public Expression lhs;
    Frag rhs;

    public PostStructExpression(Expression lhs, Frag rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
