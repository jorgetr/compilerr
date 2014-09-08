package compiler.parser;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import compiler.scanner.*;

import java.util.Stack;





public class CC4Parser  {
	String input;
	String output;
	int flagD=0;
	Decaf parser=null;
	Stack treeParse;
	Stack errorParse;
 static File f;
  static FileWriter w;
  static BufferedWriter bw ;
  static PrintWriter wr ;   
  
public CC4Parser (Scanner token,boolean debug) {
	input = token.nameFileInput;
	output = token.nameFileOutput;
	
		f = new File(output);

		try{

		   w = new FileWriter(f);
		   bw = new BufferedWriter(w);
		   wr = new PrintWriter(bw);  
		}
		catch(Exception e){
		      
		    }

		try{
			parser = new Decaf(new CommonTokenStream(new DecafLexer(new ANTLRFileStream(input))));
		}catch(Exception e){
			
		}
	}

public void runParse(boolean debug){	

ptrmsj("\nstage: parsing", output);

		String dato = "";
		String clase = "Parser";
	
		try{
			parser.programa();
			treeParse = parser.treeParse;
			errorParse= parser.stackErrorParse;
			

			while(!errorParse.isEmpty())
			{

				String aux =(String)errorParse.pop();
				System.out.println(aux);
				ptrmsj(aux, "LogErrorParse.txt");
		

			}



			while(!treeParse.isEmpty())
			{

			String aux =(String)treeParse.pop();
			ptrmsj(aux, output);
			  if (debug)
            DebugParse(aux,output,flagD);

			}

			
		}catch(Exception e){
			
		}
try{
    wr.close();
    bw.close();
}catch(Exception e){
      
    }
		
}	


  

public void DebugParse(String texto, String archivo, int flag){
	  if (flag==0){
   ptrmsj(" Debugging Parse", archivo);
flag=1;
}
    System.out.println("Debugging Parser >"+texto);
  }

static void  ptrmsj(String mensaje, String archivo)
  {

  
if (!archivo.contains("."))
  archivo=archivo+".s";

 
wr.append(mensaje+"\n"); //concatenamos en el archivo sin borrar lo existente  

    
    


  }

}
