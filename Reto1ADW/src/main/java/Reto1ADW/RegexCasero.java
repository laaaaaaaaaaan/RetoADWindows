package Reto1ADW;

import java.util.Scanner;

public class RegexCasero {

	public void validarPorExpresion() {
		String texto ="";
		String expres = "";
		Scanner reader = new Scanner(System.in);
		//Mostrar las experesiones regulares que tenemos.
		System.out.println("Introduzca texto ");
		texto = reader.next();
		System.out.println("Introduzca la expresion regular");
		expres = reader.next();
	}
}
