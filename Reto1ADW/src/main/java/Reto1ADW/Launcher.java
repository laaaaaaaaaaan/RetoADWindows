package Reto1ADW;

import java.io.IOException;

public class Launcher {

	public static void main(String[] args)throws IOException {
		
		String archivoCsv = "C:\\workspace\\RetoADWindows\\Reto1ADW/ArchivoCSV.csv";
		String archivoTxt = "C:\\workspace\\RetoADWindows\\Reto1ADW/ArchivoTxt.txt";
		
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);;
		lecturaTxt.funcionDeLectorDeTxt(archivoTxt);;
		lecturaXml.funcionDeLectorDeXML();
	}

}
