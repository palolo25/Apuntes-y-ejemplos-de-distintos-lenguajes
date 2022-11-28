
/*
bucle for

for(inicializacion del bucle; condicion; aumento o decremento){
	instrucciones;
}
 */


package bucles;

import java.util.Scanner;

public class BucleFor {

	public static void main(String[] args) {
		int contador;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba un numero: ");
		
		contador = entrada.nextInt();
		
		for(int i=1; i<=contador;i++) {
			System.out.println(i);
		}

	}

}
