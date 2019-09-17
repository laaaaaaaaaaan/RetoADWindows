package Reto1ADW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Lectores {

	public static void leerArchivotxt (String archivo) throws IOException {
		
		String cadena;
		FileReader lector = new  FileReader(archivo);
		BufferedReader lector2 = new BufferedReader(lector);
		
		while((cadena = lector2.readLine())!=null) {
			System.out.println(cadena);
		}
		lector2.close();		
	}
		
	/*public static void leerArchivosDoc() {
		
		File file = null;
        WordExtractor extractor = null;
        
        try
        {

            file = new File("c:\\New.doc");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();
            for (int i = 0; i < fileData.length; i++)
            {
                if (fileData[i] != null)
                    System.out.println(fileData[i]);
            }
        }
        catch (Exception exep)
        {
            exep.printStackTrace();
        }
	}
	*/
}
