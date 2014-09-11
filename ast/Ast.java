package compiler.ast;
import compiler.parser.*;


public class Ast{
	
	private CC4Parser parser;
	private PrintWriter output;
	private Debug d;
	
	public Ast(CC4Parser p){
		parser = p;
		//output = parser.output();
		//d = new Debug(Constants.AST);
	}
	
	public void start() throws IOException{
		ParseTree tree = parser.parse();
		
		//d.p("debugging: ast");
		//output.println("stage: ast");
		
		AstVisitor visitor = new AstVisitor();
		Root root = (Root)visitor.visit(tree);
		
		root.print();
	}
	
	public PrintWriter output(){
		return output;
	}
}