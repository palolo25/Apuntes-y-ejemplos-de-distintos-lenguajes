/*
 ciclo while
 
  while(condicion){
  instrucciones;
  }
 
 */




package bucles;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		int contador;
		int i = 1;
		int a = 10;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		contador = entrada.nextInt();		
		while(i<=contador) {
			System.out.println(i);// 1, 2 .... 10
			i++;
		}
		
		
		while(a>=1) {
			System.out.println(a);
			a--;
		}

	}

}
