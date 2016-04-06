package AST.Statement.Frag;

public class Break implements Frag {

    public Break() {

    }

    public String name;

    public Break(String name) {
        this.name = name;
    }

    public void ASTprint() {
        System.out.println(name);
    }
}
