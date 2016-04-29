
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class SAT {
	public static void main( String[] args) throws Exception 
    {
		File filename = new File("./properties/InputProgram.sat");
		//String filename = new String("C:\\Anoop_Stuff\\ASU\\Spring 2016\\LPP\\Proj 2\\Code\\High Level Language\\FuncFactorial.sat");
		BufferedReader reader = new BufferedReader(new FileReader (filename));
        ANTLRInputStream input = new ANTLRInputStream(reader);
        
        SATLexer lexer = new SATLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SATParser parser = new SATParser(tokens);
        	
        ParseTree parsetree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        SATWalker listener = new SATWalker();
        walker.walk(listener, parsetree);
        
        //ParseTree tree = parser.main(); // begin parsing at rule 'r'
        //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
