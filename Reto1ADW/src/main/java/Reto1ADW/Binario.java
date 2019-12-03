package Reto1ADW;

import java.util.ArrayList;

public class Binario {
	 public  String obtenerBinario(int numero){
		   ArrayList<String> binario = new ArrayList<String>();
		   int resto;
		   String binarioString = "";

		   while(numero > 1){
			  
		      resto = numero%2;
		      numero = numero/2;
		      binario.add(0, Integer.toString(resto));
		   } //Haremos el bucle hasta que  no se pueda dividir mas

		   binario.add(0, Integer.toString(numero)); 

		   //Cogemos cada uno de los elementos del ArrayList y los juntamos en un String
		   for(int i = 0; i < binario.size(); i++){
		       binarioString += binario.get(i);
		   }
		   return binarioString;
		 }
}
