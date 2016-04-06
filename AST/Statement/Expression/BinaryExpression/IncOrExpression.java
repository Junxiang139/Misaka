package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class IncOrExpression extends Expression {
    public Expression lhs, rhs;

    public IncOrExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
