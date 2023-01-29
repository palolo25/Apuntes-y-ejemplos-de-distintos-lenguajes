package Operaciones_con_numeros_complejos;

import java.util.Scanner;

public class mainComplejos {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		NumeroComplejo numero1,numero2,suma,mult;
		double a, b, c, d;
		int opcion, numero;
		do {
			System.out.println("\t. :Operaciones con Numeros complejos: .");
			System.out.println("1. Sumar dos números complejos");
			System.out.println("2. Multiplicar 2 números complejos");
			System.out.println("3. comparar 2 números complejos (igualés o no)");
			System.out.println("4. multiplicar un número complejos por un entero");
			System.out.println("5. Salir");
			System.out.println("Escriba una opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
				
			case 1:
				System.out.println("Escriba el primer numero complejo: ");
				System.out.println("Escriba la parte real: ");
				a = entrada.nextDouble();
				System.out.println("Escriba la parte imaginaria: ");
				b = entrada.nextDouble();
				System.out.println("Escriba el segundo numero complejo: ");
				System.out.println("Escriba la parte real: ");
				c = entrada.nextDouble();
				System.out.println("Escriba la parte imaginaria: ");
				d = entrada.nextDouble();
				
				numero1 = new NumeroComplejo(a,b);
				numero2 = new NumeroComplejo(c,d);
			
				suma = numero1.calcularSuma(numero2);
				System.out.println("\nLa suma es: "+ suma.getA() + " + " + suma.getB() + "i");
				
				break;
			
			
			case 2:
			System.out.println("Escriba el primer numero complejo: ");
			System.out.println("Escriba la parte real: ");
			a = entrada.nextDouble();
			System.out.println("Escriba la parte imaginaria: ");
			b = entrada.nextDouble();
			System.out.println("Escriba el segundo numero complejo: ");
			System.out.println("Escriba la parte real: ");
			c = entrada.nextDouble();
			System.out.println("Escriba la parte imaginaria: ");
			d = entrada.nextDouble();
			
			numero1 = new NumeroComplejo(a,b);
			numero2 = new NumeroComplejo(c,d);
			
			mult = numero1.calcularProducto(numero2);
			System.out.println("\nLa multiplicacion es: "+ mult.getA() + " + " + mult.getB() + "i");
				
				break;
				
			case 3:
				System.out.println("Escriba el primer numero complejo: ");
				System.out.println("Escriba la parte real: ");
				a = entrada.nextDouble();
				System.out.println("Escriba la parte imaginaria: ");
				b = entrada.nextDouble();
				System.out.println("Escriba el segundo numero complejo: ");
				System.out.println("Escriba la parte real: ");
				c = entrada.nextDouble();
				System.out.println("Escriba la parte imaginaria: ");
				d = entrada.nextDouble();
				
				numero1 = new NumeroComplejo(a,b);
				numero2 = new NumeroComplejo(c,d);
				
				if(numero1.conprobarIgualdad(numero2)) {
					System.out.println("\nLos numeros complejos son iguales");
				}
				else {
					System.out.println("\nLos numeros NO son iguales");
				}
				
				break;
				
			case 4:
				System.out.println("Escriba el primer numero complejo: ");
				System.out.println("Escriba la parte real: ");
				a = entrada.nextDouble();
				System.out.println("Escriba la parte imaginaria: ");
				b = entrada.nextDouble();
				System.out.println("Escriba un numero entero: ");
				numero = entrada.nextInt();
				
				numero1 = new NumeroComplejo(a,b);
				
				mult = numero1.multiplicarPorEntero(numero);
				System.out.println("\nLa multiplicacion es: "+ mult.getA() + " + " + mult.getB() + "i");
				
				break;
				
			case 5:
				break;
			}
		}while(opcion != 5);
		

	}

}
