package AST.Statement.Expression.UnaryExpression;

import AST.Statement.Expression.Expression;
import AST.Statement.Type.Type;

public class TypeKK extends Expression {
    public Type uhs;

    public TypeKK(Type uhs) {
        this.uhs = uhs;
    }
}
