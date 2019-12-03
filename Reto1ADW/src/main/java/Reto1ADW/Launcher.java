package Reto1ADW;

import java.io.File;
import java.io.IOException;

public class Launcher {

	public static void main(String[] args)throws IOException {
		
		String[] lineasEnviadas = {"alosha,Olefir,18,Lander Haz Algo","Lander,Arellano,28,Alosha Haz Algo"};
	/*	String archivoCsv = "ficheros"+ File.separator+"ArchivoCSV.csv";
		String archivoTxt =  "ficheros"+ File.separator+"ArchivoTxt.txt";
		String archivoXml =  "ficheros"+ File.separator+"datos.xml";
		LectorDatosPorTeclado.LectorDeAlfabetico();
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		lecturaTxt.funcionDeLectorDeTxt(archivoTxt);
		lecturaXml.funcionDeLectorDeXML(archivoXml);
		EscritorTxt.funcionDeEscrituraDeXML(archivoXml);*/
		
		Separador.separador(lineasEnviadas,",");
	}
}
