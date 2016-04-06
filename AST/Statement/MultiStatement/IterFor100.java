package AST.Statement.MultiStatement;

import AST.Statement.Expression.Expression;
import AST.Statement.Statement;

public class IterFor100 implements Statement {
    public Expression hs1;
    public Statement hs4;

    public IterFor100(Expression hs1, Statement hs4) {
        this.hs1 = hs1;
        this.hs4 = hs4;
    }

    public void ASTprint() {
        hs1.ASTprint();
        hs4.ASTprint();
    }
}
