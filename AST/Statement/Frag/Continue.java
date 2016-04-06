package AST.Statement.Frag;

public class Continue implements Frag {

    public Continue() {

    }

    public String name;

    public Continue(String name) {
        this.name = name;
    }

    public void ASTprint() {
        System.out.println(name);
    }
}
