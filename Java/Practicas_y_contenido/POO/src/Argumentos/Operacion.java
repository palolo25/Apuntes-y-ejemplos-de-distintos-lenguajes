package Argumentos;

import javax.swing.JOptionPane;

public class Operacion {

	//Atributos 
		
		int suma;
		int resta;
		int multi;
		int divi;
		
		
	//Metodos 
	// Metodo para pedir al usuario dos numeros 
		
		
		public void Sumar(int numero1,int numero2) {
			suma = numero1 + numero2;
		}
		public void Restar(int numero1,int numero2) {
			resta = numero1 - numero2;
		}
		public void Dividir(int numero1,int numero2) {
			divi = numero1 / numero2;
		}
		public void Multiplicar(int numero1,int numero2) {
			multi = numero1 * numero2;
		}
		public void MostrarResultados() {
			System.out.println("El resultado de la suma es: "+ suma);
			System.out.println("El resultado de la resta es: "+ resta);
			System.out.println("El resultado de la division es: "+ divi);
			System.out.println("El resultado de la multiplicacion es: "+ multi);
		}
	}

