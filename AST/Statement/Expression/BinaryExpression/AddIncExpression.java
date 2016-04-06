package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class AddIncExpression extends Expression {
    public Expression lhs, rhs;

    public AddIncExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
