import Parser.ClassNameListener;
import Parser.MisakaLexer;
import Parser.MisakaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("input.c"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        MisakaLexer lexer = new MisakaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MisakaParser parser = new MisakaParser(tokens);
        ParseTree tree = parser.compilation_unit(); // compilation_unit is the starting rule of Misaka

        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        System.out.println();

        System.out.println("Listener:");
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ClassNameListener(), tree);
        //ClassNameListener.nodeProperty.get(tree).ASTprint();
    }
}
