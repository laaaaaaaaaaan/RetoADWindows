package Reto1ADW;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.junit.Test;

public class TestLectorCSV {

	@Test
	public void testLectorCSV() throws IOException {
		boolean boleanoTest = true;
		String archivoCsvTest = "ArchivoCSV.csv";
		
		assertEquals(lecturaCSV.funcionesDeLectorCsv(archivoCsvTest),boleanoTest);
	}
	
	@Test
	public void test2LectorCSV() throws IOException {
		boolean boleanoTest = true;
		String archivoCsvTest = "Archivo.csv";
		
		assertNotEquals(lecturaCSV.funcionesDeLectorCsv(archivoCsvTest),boleanoTest);
	}


}
