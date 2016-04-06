package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class IterWhile implements Statement {
    public Expression lhs;
    public Statement rhs;

    public IterWhile(Expression lhs, Statement rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void ASTprint() {
        lhs.ASTprint();
        rhs.ASTprint();
    }
}
