package AST.Statement.Frag;

public class ID implements Frag {

    public ID() {

    }

    public String name;

    public ID(String name) {
        this.name = name;
    }

    public void ASTprint() {
        System.out.println(name);
    }
}
