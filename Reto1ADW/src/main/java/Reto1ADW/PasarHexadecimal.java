package Reto1ADW;

import java.awt.Color;
import java.util.Scanner;

public class PasarHexadecimal {

	public static void CambiarAHexadecimal(int numero) {
		
		int resto,aux=numero;
		char digitosH[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexadecimal2 = ""; 
		while(aux>0){
			resto = aux % 16;
			hexadecimal2 = digitosH[resto] + hexadecimal2;
			aux /= 16;
		}
		
		System.out.printf("\n"+"Decimal --> %d, Hexadecimal --> %s",numero,hexadecimal2);
		System.out.println("\n");
		System.out.println("El numero hexadecimal es : "+hexadecimal2+" y el numero es decimal  : "+getDecimal(hexadecimal2));
	}
	public static int getDecimal(String hex){  
	    String digits = "0123456789ABCDEF";  
	    hex = hex.toUpperCase();  
	    int val = 0;  
	    for (int i = 0; i < hex.length(); i++)  
	    {  
	    	char c = hex.charAt(i);  
	    	int d = digits.indexOf(c);  
	    	val = 16*val + d;  
	    }  
	    return val;  
	}  
}
