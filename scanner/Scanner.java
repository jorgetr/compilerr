package compiler.scanner;

import java.io.File;
import java.io.FileWriter;



public class Scanner  {
	public String nameFile;
	public File archivo;

public Scanner (String fileName) {
	nameFile=fileName+".txt";
	try{
	 archivo=new File(fileName+".txt");
	FileWriter escribir=new FileWriter(archivo,true);

	escribir.write("stage: Scanner");
	escribir.close();

	 }
	 catch(Exception e)
	{
	System.out.println("Error al escribir");
	}

}

public String elArchivo(){
	return nameFile;
}

}
