
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class SAT {
	public static void main( String[] args) throws Exception 
    {

        ANTLRInputStream input = new ANTLRInputStream( System.in);
        SATLexer lexer = new SATLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SATParser parser = new SATParser(tokens);
        	
        ParseTree parsetree = parser.main();
        ParseTreeWalker walker = new ParseTreeWalker();
        SATWalker listener = new SATWalker();
        walker.walk(listener, parsetree);
        
        //ParseTree tree = parser.main(); // begin parsing at rule 'r'
        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
