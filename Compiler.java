import compiler.*;
import compiler.ast.*;
import compiler.scanner.*;
import compiler.parser.CC4Parser;

public class Compiler {
	static int option=0;
	static String argumento;
	public static void main(String[] args) {
	 try {
	 argumento = args[0];
	 } catch (ArrayIndexOutOfBoundsException aiobe) {
      System.err.println("ERROR NO hay Argumentos");
      System.exit(1);
    } catch (Exception e) {
      System.err.println("ERROR  ");
      System.exit(1);
    }

	switch (argumento){
		case "-o":
		Scanner scan = new Scanner("hola");
		CC4Parser parser = new CC4Parser(scan);
		
		option=1;
		System.out.println("option O ");
		break;

		case "-target":
		option=2;
		System.out.println("option target ");
		break;


		case "-opt":
		option=3;
		System.out.println("option opt ");
		break;


		case "-debug":
		option=4;
		System.out.println("option debug ");
		break;

		case "-h":
			helptext();
		break;
		

		default:
		System.out.println("option ERROR ");
		 helptext();
		break;
	}



	}
	public static void helptext(){
	System.out.println(" -o <outname>		Escribir el output a un archivo de texto llamado <outname>. ");
	System.out.println(" 	-target <stage>		Donde <stage> es uno de: scan, parse, ast, semantic, irt, codegen; la compilación debe proceder hasta la etapa indicada. ");
	System.out.println(" ");
}

}