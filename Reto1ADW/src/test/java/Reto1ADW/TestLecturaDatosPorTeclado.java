package Reto1ADW;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestLecturaDatosPorTeclado {

	
	@Test
	public void test1() {

		boolean boleanoTest = true;
		assertEquals(LectorDatosPorTeclado.LectorDeAlfabetico(),boleanoTest);
		
	}
	@Test
	public void test1Falso() {

		boolean boleanoTest = true;
		assertNotEquals(LectorDatosPorTeclado.LectorDeAlfabetico(),boleanoTest);
		
	}

}
