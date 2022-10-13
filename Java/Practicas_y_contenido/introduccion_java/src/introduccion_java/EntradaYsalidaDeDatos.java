package introduccion_java;

import java.util.Scanner;

public class EntradaYsalidaDeDatos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float numero ;
		System.out.println("introduzaca un numero: ");
		numero = entrada.nextFloat();
		
		System.out.println("El numero es: "+ numero);
	}

}
