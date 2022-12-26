package operadores_de_java;

import java.util.Scanner;

//operadores aritmeticos 
public class operadores_en_java {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float numero1,numero2,suma,resta,multiplicacion,division,resto;
		System.out.println("Escriba dos numeros: ");
		
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1*numero2;
		division = numero1 / numero2;
		resto = numero1 % numero2;
		
		
		System.out.println("La suma es: "+ suma);
		System.out.println("La resta es: "+ resta);
		System.out.println("La multiplicacion es igual a: "+ multiplicacion);
		System.out.println("La division es igual a: "+ division);
		System.out.println("El resto es: "+ resto);

	}

}
