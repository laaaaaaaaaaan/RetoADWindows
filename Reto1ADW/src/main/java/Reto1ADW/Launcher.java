package Reto1ADW;

import java.io.File;
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
		String[] lineasEnviadas = {"alosha,Olefir,18,Ejemplo 1","Lander,Arellano,23,Ejemplo 2"};
		String archivoCsv = "ficheros"+ File.separator+"ArchivoCSV.csv";
		String archivoTxt =  "ficheros"+ File.separator+"ArchivoTxt.txt";
		String archivoXml =  "ficheros"+ File.separator+"datos.xml";
		LectorDatosPorTeclado.LectorDeAlfabetico();
		lecturaCSV.funcionesDeLectorCsv(archivoCsv);
		lecturaXml.funcionDeLectorDeXML(archivoXml);
		EscritorTxt.funcionDeEscrituraDeXML(archivoXml);
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
