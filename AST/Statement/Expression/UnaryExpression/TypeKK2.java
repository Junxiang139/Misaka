package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;
import AST.Statement.Type.Type;

public class TypeKK2 extends Expression {
    public Type lhs;
    public Expression rhs;

    public TypeKK2(Type lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
