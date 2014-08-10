package compiler.parser;

import java.io.File;
import java.io.FileWriter;

import compiler.scanner.Scanner;

public class CC4Parser  {
Scanner tokens;
  public CC4Parser (Scanner token) {
  	tokens=token;
  	try{
String nameArchivo=token.elArchivo();
File archivo=new File(nameArchivo);
FileWriter escribir=new FileWriter(archivo,true);

escribir.write("stage: Parser");
escribir.close();

 }
 catch(Exception e)
{
System.out.println("Error al escribir");
}


  }

}
