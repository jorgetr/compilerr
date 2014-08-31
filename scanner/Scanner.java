package compiler.scanner;
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




public class Scanner  {
	public String nameFile;
	public File archivo;

public Scanner (String name, String outPutName, boolean debug) {

	String fname = name;
  String token;
  String dato = "";
  
 org.antlr.v4.runtime.CharStream filename=null;
	if (!fname.contains("."))
	fname=fname+".txt";
  
try{
  filename =new ANTLRFileStream(fname);
}catch(IOException e){
  e.printStackTrace();
}

  try{
      DecafLexer lexer = new DecafLexer(filename);
   while (lexer.nextToken().getType() != Token.EOF || lexer.error.size() > 0){

      dato = lexer.token;


     

      if(!dato.equals("")){
        
          if (debug)
            DebugScan(dato):

        ptrmsj(dato, outPutName);
      
      }


      
    }

  }catch(ArrayIndexOutOfBoundsException aiobe){
      System.err.println("Must provide a valid path to the filename with the tokens");
      System.exit(1);
  }catch(Exception e){
      System.err.println("Must provide a valid path to the filename with the tokens");
      System.exit(1);
  }

}


public void DebugScan(String texto){
    System.out.println(texto);
  }


void  ptrmsj(String mensaje, String archivo)
  {

  File f;
if (!archivo.contains("."))
  archivo=archivo+".txt";

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



public String elArchivo(){
	return nameFile;
}

}
