package Reto1ADW;

import java.io.File;
import java.io.IOException;

public class Launcher {

	public static void main(String[] args)throws IOException {
		
		Binario binario = new Binario();
		PasarHexadecimal pH = new PasarHexadecimal();
		Separador sep = new Separador();
		String[] lineasEnviadas = {"alosha,Olefir,18,Lander Haz Algo","Lander,Arellano,28,Alosha Haz Algo"};
	/*	String archivoCsv = "ficheros"+ File.separLectorDeTxt(archivoTxt);
		lecturaXml.funcionDeLator+"ArchivoCSV.csv";
		String archivoTxt =  "ficheros"+ File.separator+"ArchivoTxt.txt";
		String archivoXml =  "ficheros"+ File.separator+"datos.xml";
		LectorDatosPorTeclado.LectorDeAlfabetico();
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		lecturaTxt.funcionDeectorDeXML(archivoXml);
		EscritorTxt.funcionDeEscrituraDeXML(archivoXml);*/
		
		sep.separador(lineasEnviadas,",");
		pH.CambiarAHexadecimal(128949);
		System.out.println("\n"+binario.obtenerBinario(258));
		
	}
}
