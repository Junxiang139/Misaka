package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class NewExpression extends Expression {
    public Expression lhs, rhs;

    public NewExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
