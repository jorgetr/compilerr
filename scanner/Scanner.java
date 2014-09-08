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
  public static String nameFileInput;
  public static String nameFileOutput;
  public File archivo;
  static int flagDebug=0;
  static Stack errorStack;

  static String fname;
  static String  dato = "";

  LinkedList error=null;
  static org.antlr.v4.runtime.CharStream filename=null;
  static File f;
  static FileWriter w;
  static BufferedWriter bw ;
  static PrintWriter wr ;  


public Scanner (String name, String outPutName, boolean debug) {
  fname=name;
  

  if (!fname.contains("."))
  fname=fname+".dcf";

  if (!outPutName.contains("."))
  outPutName=outPutName+".s";

nameFileInput=fname;
nameFileOutput=outPutName;
f = new File(nameFileOutput);

try{

   w = new FileWriter(f);
   bw = new BufferedWriter(w);
   wr = new PrintWriter(bw);  
}
catch(Exception e){
      
    }
}



public static void runScan(boolean debug){
ptrmsj("stage: scanning", nameFileOutput);
  
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
      System.out.println(aux);
      ptrmsj(aux, "LogErrorScan.txt");
      }
      if(!dato.equals("")){
        
          if (debug)
            DebugScan(dato,flagDebug);

        ptrmsj(dato, nameFileOutput);
      
      }


      
    }

  }catch(ArrayIndexOutOfBoundsException aiobe){
      System.err.println("Must provide a valid path to the filename with the tokens");
      System.exit(1);
  }catch(Exception e){
      System.err.println("Must provide a valid path to the filename with the tokens");
      System.exit(1);
  }

try{
    wr.close();
    bw.close();
}catch(Exception e){
      
    }

}






public static void DebugScan(String texto , int flag){
  if (flag==0){
   ptrmsj(" Debugging Scan", nameFileOutput);
flag=1;
}

    System.out.println("Debugging Scan >"+texto);
  }


static void  ptrmsj(String mensaje, String archivo)
  {

  
if (!archivo.contains("."))
  archivo=archivo+".s";

 
wr.append(mensaje+"\n"); //concatenamos en el archivo sin borrar lo existente  

    
    


  }





}