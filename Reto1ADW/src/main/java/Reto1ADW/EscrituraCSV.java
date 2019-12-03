package Reto1ADW;
import java.io.FileWriter;

public class EscrituraCSV {

	 public static void main(String args[]) {

	        //De binario a decimal

	        double[] binario = {1000};
	        int exp = 0;
	        double decimal = 0;

	        for(int i = 0; i < binario.length; i++) {
	            for(exp = 0; exp < 4; exp++) {
	                decimal = binario[i] * (int)Math.pow(2, exp);
	            }
	        }
	        System.out.println("El número binario 1000 en decimal es: " + decimal);

	        //De decimal a binario

	        double[] decimal2 = {8000};
	        double binario2 = 0;
	        for(int n = 0; n < decimal2.length; n++) {
	            binario2 = decimal2[n] % 2;
	        }
	        System.out.println(binario2);

	    }

	}