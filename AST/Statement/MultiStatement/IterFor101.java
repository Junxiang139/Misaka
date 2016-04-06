package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class IterFor101 implements Statement {
    public Expression hs1;
    public Expression hs3;
    public Statement hs4;

    public IterFor101(Expression hs1, Expression hs3, Statement hs4) {
        this.hs1 = hs1;
        this.hs3 = hs3;
        this.hs4 = hs4;
    }

    public void ASTprint() {
        hs1.ASTprint();
        hs3.ASTprint();
        hs4.ASTprint();
    }
}
