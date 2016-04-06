package AST.Statement.UnaryStatement;

import AST.Statement.Statement;

public class CompoundStmt2 implements Statement {
    public Statement uhs;

    public CompoundStmt2(Statement uhs) {
        this.uhs = uhs;
    }

    public void ASTprint() {

    }
}
