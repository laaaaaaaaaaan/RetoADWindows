package Reto1ADW;

import java.io.File;
import java.io.IOException;

public class Launcher {

	public static void main(String[] args)throws IOException {
		
		String archivoCsv = "ficheros"+ File.separator+"ArchivoCSV.csv";
		String archivoTxt =  "ficheros"+ File.separator+"ArchivoTxt.txt";
		String archivoXml =  "ficheros"+ File.separator+"datos.xml";
		LectorDatosPorTeclado.LectorDeAlfabetico();
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		lecturaTxt.funcionDeLectorDeTxt(archivoTxt);
		lecturaXml.funcionDeLectorDeXML(archivoXml);
		
	}
 
}
