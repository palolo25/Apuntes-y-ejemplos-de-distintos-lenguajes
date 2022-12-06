/*
  Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace,
  una posicion hacia abajo. El primero pasa a ser el segundo, el segundo pasa a ser el tercero y
  asi sucesivamente.
 */
package practicas;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int ultimo;
		
		System.out.println("Guardando los numeros");
		for(int i=0;i<10;i++) {
			
			System.out.print((i+1)+"Escribe un numero: ");
			
			arreglo[i] = entrada.nextInt();
			}
		ultimo = arreglo[9];
		
		
		for(int i = 8; i>=0;i--) {
			
			arreglo[i+1] = arreglo[i];
			
		}
		
		arreglo[0] = ultimo;
		System.out.println("El nuevo arreglo es: ");
		
		for(int i = 0; i<10;i++) {
			
			System.out.println("El arreglo: "+ arreglo[i]);
		}
	}

}
