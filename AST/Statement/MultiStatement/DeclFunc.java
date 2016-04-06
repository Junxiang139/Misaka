package AST.Statement.MultiStatement;

import AST.Statement.Statement;

public class DeclFunc implements Statement {
    public Statement lhs, rhs;

    public DeclFunc(Statement lhs, Statement rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void ASTprint() {
        lhs.ASTprint();
        rhs.ASTprint();
    }
}
