package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class SelectDef2 implements Statement {
    public Expression hs1;
    public Statement hs2, hs3;

    public SelectDef2(Expression hs1, Statement hs2, Statement hs3) {
        this.hs1 = hs1;
        this.hs2 = hs2;
        this.hs3 = hs3;
    }

    public void ASTprint() {
        hs1.ASTprint();
        hs2.ASTprint();
        hs3.ASTprint();
    }
}


