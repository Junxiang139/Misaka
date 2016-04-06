package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class IterFor010 implements Statement {
    public Expression hs2;
    public Statement hs4;

    public IterFor010(Expression hs2, Statement hs4) {
        this.hs2 = hs2;
        this.hs4 = hs4;
    }

    public void ASTprint() {
        hs2.ASTprint();
        hs4.ASTprint();
    }
}
