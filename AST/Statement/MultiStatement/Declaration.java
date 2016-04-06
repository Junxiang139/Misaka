package AST.Statement.MultiStatement;

import AST.Statement.Statement;
import AST.Statement.Type.Type;

public class Declaration implements Statement {
    public Type uhs;

    public Declaration(Type uhs) {
        this.uhs = uhs;
    }

    public void ASTprint() {
        System.out.println("Decl");
        uhs.ASTprint();
    }
}
