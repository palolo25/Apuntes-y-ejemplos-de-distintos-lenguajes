/*
 Efercicio 6: Construir an programa para trabajar con 2 numeros complejos,
implemente el siguiente menu:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. comparar 2 números complejos (igualés o no)
4. multiplicar un número complejos por un entero
 */
package Operaciones_con_numeros_complejos;

public class NumeroComplejo {

	private double a; //Parte real
	private double b; //Parte imaginaria
	
	
	public NumeroComplejo(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}


	public double getA() {
		return a;
	}


	public double getB() {
		return b;
	}
	
	public NumeroComplejo calcularSuma(NumeroComplejo c) {
		
		NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
		return suma;
		
	}
	
	public NumeroComplejo calcularProducto(NumeroComplejo c) {
		
		NumeroComplejo mult = new NumeroComplejo(a * c.getA(), b * c.getB());
		return mult;
	}
	
	public boolean conprobarIgualdad(NumeroComplejo c) {
		boolean igualdad = false;
		if((a == c.getA()) && (b == c.getB())) {
			igualdad = true;
		}
		return igualdad;
	}
	
	public NumeroComplejo multiplicarPorEntero(int x) {
		
		NumeroComplejo mult = new NumeroComplejo(a * x, b * x);
		return mult;
		
	}
}
