package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class IterFor001 implements Statement {
    public Expression hs3;
    public Statement hs4;

    public IterFor001(Expression hs3, Statement hs4) {
        this.hs3 = hs3;
        this.hs4 = hs4;
    }

    public void ASTprint() {
        hs3.ASTprint();
        hs4.ASTprint();
    }
}
