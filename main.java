import org.antlr.v4.runtime.*;
import compiller.scanner.DecafLexer;
import compiller.parser.Decaf;

public class main {
  public static void main(String[] args) throws Exception {
    try {	    
	(new Decaf(new CommonTokenStream(new Decaf(new ANTLRFileStream(args[0]))))).start();
    } catch (ArrayIndexOutOfBoundsException aiobe) {
      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
      System.exit(1);
    } catch (Exception e) {
      System.err.println("usage: jaca Main <file>\nwhere file is the path to the filename with the tokens");
      System.exit(1);
    } 
  }
}