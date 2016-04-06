package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class IterFor000 implements Statement {
    public Statement uhs;

    public IterFor000(Statement uhs) {
        this.uhs = uhs;
    }

    public void ASTprint() {
        uhs.ASTprint();
    }
}
