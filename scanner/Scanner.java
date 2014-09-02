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
import java.util.LinkedList;

import java.util.Stack;

public class Scanner  {
  public String nameFileInput;
  public String nameFileOutput;
  public File archivo;
  Stack errorStack;
public Scanner (String name, String outPutName, boolean debug) {

  String fname = name;
  String dato = "";

  LinkedList error=null;
 org.antlr.v4.runtime.CharStream filename=null;

  if (!fname.contains("."))
  fname=fname+".dcf";

  if (!outPutName.contains("."))
  outPutName=outPutName+".s";


nameFileInput=fname;
nameFileOutput=outPutName;

ptrmsj("stage: scanning", outPutName);
  
try{
  filename =new ANTLRFileStream(fname);
}catch(IOException e){
  e.printStackTrace();
}

  try{
      DecafLexer lexer = new DecafLexer(filename);
   while (lexer.nextToken().getType() != Token.EOF || lexer.errorStack.size() > 0){


      dato = lexer.token;
      errorStack = lexer.errorStack;


      

  while(!errorStack.isEmpty())
      {


        String aux ="<REPORT:  "+(String)errorStack.pop() + "/>";
      ptrmsj(aux, outPutName);
  

      }


     

      if(!dato.equals("")){
        
          if (debug)
            DebugScan(dato);

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
 
   ptrmsj(" Debugging Scan", outPutName);
    System.out.println("Debugging Scan >"+texto);
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