package Reto1ADW;

import java.util.ArrayList;

public class Separador {

	public static ArrayList<String> separador(String lineas[],String separador) {
		ArrayList<String> arrayList = new ArrayList<String>();//El Error esta AQUI!!!!!!!!!
		String[] lineasGuardadas =null;
		for(int i=0;i<lineas.length;i++) {		
			lineasGuardadas=lineas[i].split(separador);	
			arrayList.add(lineasGuardadas[i]);
			//Hay que redimensionar el arrayList para que el arraylist guarde la información del 
			//Array .
		} 
		
		for(int k = 0;k<arrayList.size();k++) {
			System.out.println("1 : es  "+arrayList.get(k));
		}
		
		return arrayList;
	} 
}