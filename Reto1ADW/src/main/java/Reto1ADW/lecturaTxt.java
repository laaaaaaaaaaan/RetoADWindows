package Reto1ADW;
/**Archivo para leer un archivo en .txt
 * 
 * Fuente --> https://jarroba.com/lectura-escritura-ficheros-java-ejemplos/
 * */

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class lecturaTxt {
	
	public static boolean funcionDeLectorDeTxt(String archivo) {	
		// Fichero del que queremos leer
				File fichero = new File(archivo);
				Scanner s = null;
 
				try {
					// Leemos el contenido del fichero
					//System.out.println("... Leemos el contenido del fichero ...");
					s = new Scanner(fichero);

					// Leemos linea a linea el fichero
					while (s.hasNextLine()) 
					{
						String linea = s.nextLine(); 	// Guardamos la linea en un String
						System.out.println(linea);      // Imprimimos la linea
						return true;
					}

				} 
				catch (Exception ex) 
				{
					System.out.println("Mensaje: " + ex.getMessage());
					return false;
				} 
				finally
				{
					// Cerramos el fichero tanto si la lectura ha sido correcta o no
					try 
					{
						if (s != null)
							s.close();
						} catch (Exception ex2) 
					{
						System.out.println("Mensaje 2: " + ex2.getMessage());
						return false;
					}
				}
				return false;
			}
	public static void EscritorDeTxt()
    {
	 	String st = " ";
	 	System.out.println("Introduzca lo que Q");
	 	Scanner reader = new Scanner(System.in);
	 	st= reader.next();
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/workspace/prueba.txt");
            pw = new PrintWriter(fichero);
           
            for (int i = 0; i < 10; i++) {
                pw.println( i +"\r");
                pw.append(st+";");
                
            }
            pw.println(st);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
	}

	
