package AST.Statement.MultiStatement;

import AST.Statement.Statement;

public class BlockItemList implements Statement {
    public Statement lhs, rhs;

    public BlockItemList(Statement lhs, Statement rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public void ASTprint() {

    }
}
