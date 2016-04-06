package AST.Statement.MultiStatement;

import AST.Statement.Statement;

public class IDListDef implements Statement {
    public Statement lhs, rhs;

    public IDListDef(Statement lhs, Statement rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void ASTprint() {
        lhs.ASTprint();
        rhs.ASTprint();
    }
}
