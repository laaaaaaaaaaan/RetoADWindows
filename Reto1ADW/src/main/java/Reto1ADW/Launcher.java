package Reto1ADW;

import java.io.IOException;

public class Launcher {

	public static void main(String[] args)throws IOException {
		
		String archivoCsv = "ArchivoCSV.csv";
		String archivoTxt = "ArchivoTxt.txt";
		String archivoXml = "datos.xml";
		LectorDatosPorTeclado.LectorDeAlfabetico();
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);;
		lecturaTxt.funcionDeLectorDeTxt(archivoTxt);;
		lecturaXml.funcionDeLectorDeXML(archivoXml);
	}

}
