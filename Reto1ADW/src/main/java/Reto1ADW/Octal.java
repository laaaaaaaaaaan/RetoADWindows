package Reto1ADW;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Octal {

	public void formatoOctal() {
		DecimalFormat df = new DecimalFormat("#.000");
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduce un n�mero para pasar de decimal a octal: ");
        int decimal = reader.nextInt();
        
        
        System.out.println("Decimal a Octal");
         
        // 1� m�todo con toOctalString 
        String octal = Integer.toOctalString(decimal);
        System.out.println("M�todo 1 -> Decimal: " + decimal +", Octal: "+ octal);
        System.out.println("Usamos el decimal format para limita los decimales ->" + df.format(Integer.parseInt(octal)));
   
        System.out.print("Introduce un n�mero para pasar de octal a decimal: ");
        String octalString = reader.next();
        //Converting octal number into decimal  
        int decimal2=Integer.parseInt(octalString,8);  
        //Printing converted decimal number  
        System.out.println( "Octal: " +  octalString+", decimal: "+ decimal2 );  
	}
}
