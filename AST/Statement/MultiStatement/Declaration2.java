package AST.Statement.MultiStatement;

import AST.Statement.Statement;
import AST.Statement.Type.Type;

public class Declaration2 implements Statement {
    public Type lhs;
    public Statement rhs;

    public Declaration2(Type lhs, Statement rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void ASTprint() {
        System.out.println("Decl");
        lhs.ASTprint();
        rhs.ASTprint();
    }
}
