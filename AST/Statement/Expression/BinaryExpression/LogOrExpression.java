package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class LogOrExpression extends Expression {
    public Expression lhs, rhs;

    public LogOrExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
