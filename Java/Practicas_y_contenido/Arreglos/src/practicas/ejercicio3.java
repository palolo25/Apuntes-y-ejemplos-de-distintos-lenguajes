/*
 Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media de los numeros positivos,
 los numeros negativos y contar el numero de ceros.
 */
package practicas;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float numeros[] = new float[5];
		float suma_posi = 0, suma_nega = 0;
		int conteo_posi = 0, conteo_nega = 0,conteo_ceros = 0;
		
		System.out.println("Guardando los numeros");
		
		for(int i=0;i<5;i++) {
			
			System.out.print((i+1)+"Escribe un numero: ");
			
			numeros[i] = entrada.nextFloat();
			
			if(numeros[i] == 0) {
				conteo_ceros++;
			}else if(numeros[i] > 0) {
				
				suma_posi += numeros[i];
				conteo_posi++;
			}else {
				suma_nega += numeros[i];
				conteo_nega++;
				
			}
		
		}
		
		//Media positivos
		if(conteo_posi == 0) {
			System.out.println("No se puede hacer media");
		}else {
			
			float media_posi = suma_posi / conteo_posi;
			System.out.println("La media de positivos es: "+ media_posi);
		}
		// Media negativos
		if(conteo_nega == 0) {
			System.out.println("No se puede hacer media");
		}else {
			
			float media_nega = suma_nega / conteo_nega;
			System.out.println("La media de negativos es: "+ media_nega);
		}
		
		System.out.println("La cantidad de ceros es: "+ conteo_ceros);
		

	}

}
