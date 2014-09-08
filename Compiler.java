import compiler.*;

import compiler.scanner.*;
import compiler.parser.*;
import compiler.ast.*;
import compiler.semantic.*;
import compiler.irt.*;
import compiler.codegen.*;

import java.io.*;

public class Compiler {
	static int option=0;
	static String argumento;

public static void help(){

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
}

public static void debug (int tag, String etapa, String file){
	
		Scanner scan;	
		CC4Parser parser;
		Ast ast;
		Semantic semantic;
		Irt irt;
		Codegen condegen;


	switch (tag){
		case 0:
			scan = new Scanner(file,etapa,false);
			parser = new CC4Parser(scan,false);
			parser.runParse(false);
			//Ast ast = new Ast(parser);
			//semantic = new Semantic(ast);
			//Irt irt = new Irt(semantic);
			//condegen = new Codegen(irt);
			break;
		case 1:
				if(etapa.contains("scan")){
					scan = new Scanner(file,"fileOut.s",false);
					scan.runScan(false);
				}
				if(etapa.contains("parse")){
					 scan = new Scanner(file,"fileOut.s",false);	
					 parser = new CC4Parser(scan,false);
					 parser.runParse(false);
				}
				if(etapa.contains("ast")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,false);
					ast =new Ast(parser);
				}
				if(etapa.contains("semantic")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,false);
					ast =new Ast(parser);
					semantic = new Semantic(ast);

				}
				if(etapa.contains("irt")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,false);
					ast =new Ast(parser);
					semantic = new Semantic(ast);
					irt = new Irt(semantic);

				}
				if(etapa.contains("codegen")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,false);
					ast =new Ast(parser);
					semantic = new Semantic(ast);
					irt = new Irt(semantic);
					condegen = new Codegen(irt);
				}


			break;

			case 2:
				String etapaAc="";
				int aux =0;

				aux = etapa.indexOf(":");
				if (aux !=-1){
				etapaAc=etapa.substring(0,aux);}

				if(!etapa.contains(":") && etapa.length()>0){
					aux = 0;
					etapaAc=etapa;
				}
				
				while (aux>=0){
				
				if(etapaAc.contains("scan")){
					scan = new Scanner(file,"fileOut.s",true);
					scan.runScan(true);
				}
				if(etapaAc.contains("parse")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,true);
					parser.runParse(true);
				}
				if(etapaAc.contains("ast")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,false);
					ast =new Ast(parser);
				}
				if(etapaAc.contains("semantic")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,false);
					ast =new Ast(parser);
					semantic = new Semantic(ast);

				}
				if(etapaAc.contains("irt")){
					scan = new Scanner(file,"fileOut.s",false);	
					parser = new CC4Parser(scan,false);
					ast =new Ast(parser);
					semantic = new Semantic(ast);
					irt = new Irt(semantic);

				}
				if(etapaAc.contains("codegen")){
					scan = new Scanner(file,"fileOut.s",true);	
					parser = new CC4Parser(scan,true);
					ast =new Ast(parser);
					semantic = new Semantic(ast);
					irt = new Irt(semantic);
					condegen = new Codegen(irt);
				}


				aux = etapa.indexOf(":",aux+1);
				if (aux !=-1)
				etapaAc=etapa.substring(0,aux);

			}

			break;

		default:
			help();
			break;
	}

}




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
		if (args[1].contains("."))
		debug(0,args[1],args[2]);

		break;

		case "-target":
		
		if (args[2].contains(".")){
			if (args[1].equals("scan")||args[1].equals("parse")||args[1].equals("ast")||args[1].equals("semantic")||args[1].equals("irt")||args[1].equals("codegen")){
				debug(1,args[1],args[2]);
			}
		}
		break;


		case "-opt":
		option=3;
		System.out.println("option opt ");
		break;


		case "-debug":
		
		if (args[2].contains(".")){
		
			if (args[1].contains("scan")||args[1].contains("parse")||args[1].contains("ast")||args[1].contains("semantic")||args[1].contains("irt")||args[1].contains("codegen")){
		
				debug(2,args[1],args[2]);
			}	
		}
		break;

		case "-h":
		help();

		break;
		

		default:
		if (args[0].contains(".") || !args[0].contains("-") ){
			String aux = args[0];
			String nameS = aux.substring(0,aux.indexOf(".")) + ".s";
				debug(0,nameS,args[0]);
		}

		break;
	}



	}

}