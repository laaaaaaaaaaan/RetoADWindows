package Reto1ADW;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class lecturaCSV {
	public static final String SEPARATOR=";";
	public static final String QUOTE="\"";
	public static boolean funcionesDeLectorCsv(String archivo)  throws IOException 
	{
		
BufferedReader br = null;
		
		try 
		{     
			br =new BufferedReader(new FileReader(archivo));
			String line = br.readLine();
			
			while (null!=line) 
			{
				String [] fields = line.split(";");
				System.out.println(Arrays.toString(fields));
				/*fields = removeTrailingQuotes(fields);
				System.out.println(Arrays.toString(fields));*/
				line = br.readLine();
			
				return true;
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
		return false;

	}
	 
}
