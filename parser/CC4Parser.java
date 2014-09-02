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

public CC4Parser (Scanner token,boolean debug) {
	String input = token.nameFileInput;
	String output = token.nameFileOutput;
	
	Decaf parser=null;

	Stack treeParse;
	Stack errorParse;
	ptrmsj("\nstage: parsing", output);
		try{
			parser = new Decaf(new CommonTokenStream(new DecafLexer(new ANTLRFileStream(input))));
		}catch(Exception e){
			
		}

		String dato = "";
		String clase = "Parser";
	
		try{
			parser.programa();
			treeParse = parser.treeParse;
			errorParse= parser.stackErrorParse;
			

			while(!errorParse.isEmpty())
			{

				String aux =(String)errorParse.pop();
			ptrmsj(aux, output);
		

			}



			while(!treeParse.isEmpty())
			{

				String aux =(String)treeParse.pop();
			ptrmsj(aux, output);
			  if (debug)
            DebugParse(aux);

			}

			
		}catch(Exception e){
			
		}
	


  }
public void DebugParse(String texto){
	ptrmsj(" Debugging Scan", outPutName);
    System.out.println("Debugging Parser >"+texto);
  }

  void  ptrmsj(String mensaje, String archivo)
  {

  File f;
if (!archivo.contains("."))
  archivo=archivo+".s";

  f = new File(archivo);
  try{

  FileWriter w = new FileWriter(f,true);
  BufferedWriter bw = new BufferedWriter(w);
  PrintWriter wr = new PrintWriter(bw);  
  

    wr.append(mensaje+"\n"); //concatenamos en el archivo sin borrar lo existente
    
    wr.close();

    bw.close();

    }catch(IOException e){};



  }

}
