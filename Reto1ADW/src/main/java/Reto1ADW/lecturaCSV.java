package Reto1ADW;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class lecturaCSV {
	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	public static void funcionesDeLectorCsv(String archivo)  throws IOException 
	{
		/**Lo primero es abrir el fichero para leerlo. Puesto que es un fichero de texto con líneas, una clase cómoda para leerlo 
	       * es BufferedReader, que admite en su constructor un FileReader. Esto nos permitirá usar el método readLine() para ir leyendo 
	       * líneas de una en una.
	       */
		
		BufferedReader br = null;
		
		try 
		{     
			br =new BufferedReader(new FileReader(archivo));
			String line = br.readLine();
			
			/**
			 * Un bucle mientras haya líneas, es decir, mientras readLine() no lea null. 
			 * Puesto que el separador que usamos es el punto y coma, una forma fácil de partir la cadena es usar el método split() 
			 * de la clase String. 
			 * La línea String [] fields = line.split(SEPARATOR); parte la línea usando el separador y nos devuelve un array de String
			 * con tantos elementos como campos. Por ejemplo, para la primera línea del CSV que contiene "uno";"dos";"tres", nos devolvería 
			 * un array de tres String, con los valores "uno", "dos" y "tres". 
			 * Un detalle a tener en cuenta, es que nos dejará las comillas en los valores, así que tendremos "uno" con sus dos comillas,
			 * una a cada lado, y así con todos los demás valores.
			 */
			
			while (null!=line) 
			{
				String [] fields = line.split(SEPARATOR);
				System.out.println(Arrays.toString(fields));
				/*fields = removeTrailingQuotes(fields);
				System.out.println(Arrays.toString(fields));*/
				line = br.readLine();
			}
   
		}
		catch (Exception e)
		{
			//Insercción excepción correspondiente
		}
		finally
		{
			if (null!=br) {
          br.close();
			}
		}
	}
	 /*/**Si queremos quitar estas comillas, hemos creado un método removeTrailingQuotes() al que pasamos nuestro array de String
	  * y nos devuelve con los mismos elementos, pero sin comillas.
	  */
	
	/*private static String[] removeTrailingQuotes(String[] fields) 
	{
		/**Creamos un array de String para guardar los resultados con la misma longitud que el array que nos pasan.
		String result[] = new String[fields.length];
		
		/**
		 *  Hacemos un bucle para ir recorriendo cada uno de los elementos.
		 *  Para quitar las comillas, usamos el método replaceAll() de la clase String. Este método admite como primer parámetro
		 *  una expresión regular y como segundo parámetro el nuevo valor que queremos poner. En nuestro ejemplo: 
		 *  En expresiones regulares, un ^ indica principio de la cadena. Así que ^" quiere decir unas comillas al principio de la cadena.
		 *  Así que reemplazamos ^" por nada (cadena vacía "").
		 *  En expresiones regulares, un $ indica final de la cadena. Así que "$ quiere decir unas comillas al final de la cadena. 
		 *  sí que reemplazamos "$ por nada (cadena vacía "")
		 *  Con esto quitamos las comillas del principio y del final en cada valor. A partir de ahí, sólo queda hacer lo que tengamos 
		 *  que hacer con cada valor, que en nuestro ejemplo sólo es sacarlo por pantalla.
		 * 
		for (int i=0;i<result.length;i++)
		{
			result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
		}
		
		return result;
   } */
}
