package Reto1ADW;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLectorXML {

	@Test
	public void testLectorXML() {
		boolean boleanoTest = true;
		String archivoXmlTest = "datos.xml";
		
		assertEquals(lecturaXml.funcionDeLectorDeXML(archivoXmlTest),boleanoTest);
	}
	
	@Test
	public void test2LectorXML() {
		boolean boleanoTest = true;
		String archivoXmlTest = "datox.xml";
		
		assertNotEquals(lecturaXml.funcionDeLectorDeXML(archivoXmlTest),boleanoTest);
	}

}
