package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class IterFor011 implements Statement {
    public Expression hs2;
    public Expression hs3;
    public Statement hs4;

    public IterFor011(Expression hs2, Expression hs3, Statement hs4) {
        this.hs2 = hs2;
        this.hs3 = hs3;
        this.hs4 = hs4;
    }

    public void ASTprint() {
        hs2.ASTprint();
        hs3.ASTprint();
        hs4.ASTprint();
    }
}
