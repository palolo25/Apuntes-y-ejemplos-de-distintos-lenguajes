
/*
Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido  
*/


package practicas;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float[] numeros = new float[5];
		
		System.out.println("Guardando los datos del arreglo");
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+"Escriba un numero: ");
			
			numeros[i] = entrada.nextFloat();
		}
		System.out.println("\n Imprimir los datos del arreglo");
		
		for(float i:numeros) {
			System.out.println(i);
		}
	}

}
