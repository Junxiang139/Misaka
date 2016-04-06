package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class LogAndExpression extends Expression {
    public Expression lhs, rhs;

    public LogAndExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
