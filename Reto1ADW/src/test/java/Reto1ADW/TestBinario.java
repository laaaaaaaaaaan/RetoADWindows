package Reto1ADW;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestBinario {
	private String resultado;
	private String resultadoEsperado;
	private int numero;
	private Binario binario = new Binario();
	
	@Test
	public void testImpar() {
		numero = 3;
		resultadoEsperado = "11";
		resultado = binario.obtenerBinario(numero);
		
		org.junit.Assert.assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testNoMal() {
		numero = 8;
		resultadoEsperado = "111";
		resultado = binario.obtenerBinario(numero);
		
		org.junit.Assert.assertNotEquals(resultadoEsperado, resultado);
	}
	@Test
	public void testZero() {
		numero = 0;
		resultadoEsperado = "0";
		resultado = binario.obtenerBinario(numero);
		
		org.junit.Assert.assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void testuno() {
		numero = 1;
		resultadoEsperado = "1";
		resultado = binario.obtenerBinario(numero);
		
		org.junit.Assert.assertEquals(resultadoEsperado, resultado);
	}
	
}
