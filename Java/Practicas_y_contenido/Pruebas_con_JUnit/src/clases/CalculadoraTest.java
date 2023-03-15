package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc;
	
	@Test
	public void testSuma() {
		
		 calc = new Calculadora();
		
		int resultado = calc.sumar(3, 2);
		
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		 calc = new Calculadora();
		int resultado = calc.restar(3, 2);
		int esperado = 1;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testMult() {
		 calc = new Calculadora();
		int resultado = calc.multiplicar(2, 2);
		int esperado = 4;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testdiv() {
		 calc = new Calculadora();
		int resultado = calc.dividir(4, 2);
		int esperado = 2;
		
		assertEquals(esperado, resultado);
	}
}
