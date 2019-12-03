package Reto1ADW;

import java.util.ArrayList;

public class Separador {

	public static ArrayList<String[]> separador(String lineas[],String separador) {
		ArrayList<String[]> arrayList = new ArrayList<String[]>();
		String[] lineasGuardadas =null;
		for(int i=0;i<lineas.length;i++) {		
			lineasGuardadas=lineas[i].split(separador);	
			arrayList.add(lineasGuardadas);
			
		} 
		
		for(int k = 0;k<arrayList.size();k++) {
			for(int j = 0;j<arrayList.get(k).length;j++) {
				System.out.println(k+" : es  "+arrayList.get(k)[j]);
			}
		}
		
		return arrayList;
	} 
}