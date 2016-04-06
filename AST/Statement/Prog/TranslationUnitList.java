package AST.Statement.Prog;

import AST.Statement.Statement;

public class TranslationUnitList implements Statement {
    public Statement lhs, rhs;

    public TranslationUnitList(Statement lhs, Statement rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void ASTprint() {
        lhs.ASTprint();
        rhs.ASTprint();
    }
}
