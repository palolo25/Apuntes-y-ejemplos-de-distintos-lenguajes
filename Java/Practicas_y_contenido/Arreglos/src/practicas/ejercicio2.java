/*
 Leer 5 numeros en un arreglo y mostrarlos el orden inverso al que han sido introducidos
 */
 
package practicas;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float numeros[] = new float[5];
		
		System.out.println("Guardamos los datos del arreglo");
		
		for(int i=0;i<5;i++) {
			
			System.out.print((i+1)+"Escribe un numero: ");
			
			numeros[i] = entrada.nextFloat();
			
		}
		System.out.println("Estos son los elementos en orden inverso");
		
		for(int i=4;i>=0;i--) {
			System.out.println(numeros[i]);
		}

	}

}
