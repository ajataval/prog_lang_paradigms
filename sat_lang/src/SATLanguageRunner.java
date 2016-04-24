import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;




public class SATLanguageRunner {
	
	public static void main(String[] args) throws IOException {
		
		
		  ANTLRInputStream input = new ANTLRInputStream(System.in);
	      SATLanguageLexer lexer = new SATLanguageLexer(input);
	      CommonTokenStream tokens = new CommonTokenStream(lexer);
	      SATLanguageParser parser = new SATLanguageParser(tokens);    
	      ParseTree parseTree = parser.main();
	      ParseTreeWalker walker = new ParseTreeWalker();
	      SATLangWalker listener = new SATLangWalker();
	      walker.walk(listener, parseTree);
	        
	       
	       
	}
	
	 
      
      
      

}
