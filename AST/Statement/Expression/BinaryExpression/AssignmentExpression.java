package AST.Statement.Expression.BinaryExpression;

import AST.Statement.Expression.Expression;

public class AssignmentExpression extends Expression {
    public Expression lhs, rhs;

    public AssignmentExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
