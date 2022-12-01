
/*
 ciclo while

 do{
 	instrucciones;
 
 } while(condicion)
 */

package bucles;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 1, contador;
		
		
		System.out.println("Escriba un numero: ");
		contador = entrada .nextInt();
		do {
			
			System.out.println(i);
			i++;
		}while(i<=contador);
		

	}

}
