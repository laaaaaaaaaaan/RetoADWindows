package Reto1ADW;

import java.io.IOException;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args)throws IOException {
		Scanner reader = new Scanner(System.in);
		int num;
		Binario binario = new Binario();
		PasarHexadecimal pH = new PasarHexadecimal();
		Octal octal = new Octal();
		Separador sep = new Separador();
		String[] lineasEnviadas = {"alosha,Olefir,18,Lander Haz Algo","Lander,Arellano,23,Alosha Haz Algo"};
	/*	String archivoCsv = "ficheros"+ File.separLectorDeTxt(archivoTxt);
		lecturaXml.funcionDeLator+"ArchivoCSV.csv";
		String archivoTxt =  "ficheros"+ File.separator+"ArchivoTxt.txt";
		String archivoXml =  "ficheros"+ File.separator+"datos.xml";
		LectorDatosPorTeclado.LectorDeAlfabetico();
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		lecturaTxt.funcionDeectorDeXML(archivoXml);
		EscritorTxt.funcionDeEscrituraDeXML(archivoXml);*/
		sep.separador(lineasEnviadas,",");
		System.out.println("Introduce el numero decimal que quieres convertir a hexadecimal");
		num=reader.nextInt();
		pH.CambiarAHexadecimal(num);
		octal.formatoOctal();
		System.out.println("Introduce el numero decimal que quieres convertir a binario");
		num=reader.nextInt();
		System.out.println("\n"+binario.obtenerBinario(num));		
	}
}
