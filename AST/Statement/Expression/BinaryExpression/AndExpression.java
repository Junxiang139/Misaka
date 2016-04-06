package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class AndExpression extends Expression {
    public Expression lhs, rhs;

    public AndExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
