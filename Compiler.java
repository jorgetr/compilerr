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
		Scanner scan = new Scanner("test","output.txt");
		//CC4Parser parser = new CC4Parser(scan);
		
		option=1;
		//System.out.println("option O ");
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
	
		System.out.println("\n-o <outname> \t   Escribir el output a <outname>");

		System.out.println("\n-target <stage>    Donde <stage> es uno de: scan, parse, ast, semantic, \t\t   irt, codegen; la compilacion 						debe proceder hasta la");
		System.out.println("\t\t   etapa indicada.");
		System.out.println("\t\t   Por ejemplo, si <stage> es scan, una instancia de scan"); 
		System.out.println("\t\t   debe ser creada imprimiendo en el archivo de salida");
		System.out.println("\t\t   \"stage: scanning\".");
		System.out.println("\t\t   Si es parse una instancia de parser debe ser creada a"); 
		System.out.println("\t\t   partir de la instancia de scanner impimiendo"); 
		System.out.println("\t\t   \"stage: parsing\", ademas del mensaje de scanner y asi"); 
		System.out.println("\t\t   sucesivamente.");


		System.out.println("\n-opt <opt_stage>   <opt_stage> es uno de: constant, algebraic; la compilacion");
		System.out.println("\t\t   debe hacer solo la optimizacion que se le pida, y debe");
		System.out.println("\t\t   imprimir como en -target \"optimizing: constant folding\" o");
		System.out.println("\t\t   \"optimizing: algebraic simplification\".");
		
		System.out.println("\n-debug <stage>     Imprimir informacion de debugging. Debe haber un mensaje");
		System.out.println("\t\t   por cada etapa listada en <stage> de la forma");
		System.out.println("\t\t   \"Debugging <stage>\".");
		System.out.println("\t\t   <stage> tiene las mismas opciones de -target, con la");
		System.out.println("\t\t   diferencia que se pueden \"debuggear\" varias etapas,");
		System.out.println("\t\t   separandolas con ':' de la forma scan:parse:etc.");
		
		System.out.println("\n-h \t\t   Muestra esta ayuda.");

		break;
		

		default:
		
		System.out.println("\n-o <outname> \t   Escribir el output a <outname>");

		System.out.println("\n-target <stage>    Donde <stage> es uno de: scan, parse, ast, semantic, \t\t   irt, codegen; la compilacion 						debe proceder hasta la");
		System.out.println("\t\t   etapa indicada.");
		System.out.println("\t\t   Por ejemplo, si <stage> es scan, una instancia de scan"); 
		System.out.println("\t\t   debe ser creada imprimiendo en el archivo de salida");
		System.out.println("\t\t   \"stage: scanning\".");
		System.out.println("\t\t   Si es parse una instancia de parser debe ser creada a"); 
		System.out.println("\t\t   partir de la instancia de scanner impimiendo"); 
		System.out.println("\t\t   \"stage: parsing\", ademas del mensaje de scanner y asi"); 
		System.out.println("\t\t   sucesivamente.");


		System.out.println("\n-opt <opt_stage>   <opt_stage> es uno de: constant, algebraic; la compilacion");
		System.out.println("\t\t   debe hacer solo la optimizacion que se le pida, y debe");
		System.out.println("\t\t   imprimir como en -target \"optimizing: constant folding\" o");
		System.out.println("\t\t   \"optimizing: algebraic simplification\".");
		
		System.out.println("\n-debug <stage>     Imprimir informacion de debugging. Debe haber un mensaje");
		System.out.println("\t\t   por cada etapa listada en <stage> de la forma");
		System.out.println("\t\t   \"Debugging <stage>\".");
		System.out.println("\t\t   <stage> tiene las mismas opciones de -target, con la");
		System.out.println("\t\t   diferencia que se pueden \"debuggear\" varias etapas,");
		System.out.println("\t\t   separandolas con ':' de la forma scan:parse:etc.");
		
		System.out.println("\n-h \t\t   Muestra esta ayuda.");

		break;
	}



	}

}