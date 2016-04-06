package AST.Statement.Frag;

public class Return implements Frag {

    public Return() {

    }

    public String name;

    public Return(String name) {
        this.name = name;
    }

    public void ASTprint() {
        System.out.println(name);
    }
}
