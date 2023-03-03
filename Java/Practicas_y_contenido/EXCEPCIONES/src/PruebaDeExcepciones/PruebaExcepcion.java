package PruebaDeExcepciones;

public class PruebaExcepcion {

	public static void main(String[] args) {
		
		// Sintacticamente el programa esta correcto.
		int num1 = 5, num2 = 0;
		// En este punto saltara la excepcion porque no puedes dividir un numero entre 0.
		int resultado = num1/num2;
		
		System.out.println("El resultado es: " + resultado);

	}

}
