package Introduccion;

import javax.swing.JOptionPane;

public class Operacion {
//Atributos 
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multi;
	int divi;
	
	
//Metodos 
// Metodo para pedir al usuario dos numeros 
	
	public void LeerNumeros() {
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		
	}
	public void Sumar() {
		suma = numero1 + numero2;
	}
	public void Restar() {
		resta = numero1 - numero2;
	}
	public void Dividir() {
		divi = numero1 / numero2;
	}
	public void Multiplicar() {
		multi = numero1 * numero2;
	}
	public void MostrarResultados() {
		System.out.println("El resultado de la suma es: "+ suma);
		System.out.println("El resultado de la resta es: "+ resta);
		System.out.println("El resultado de la division es: "+ divi);
		System.out.println("El resultado de la multiplicacion es: "+ multi);
	}
}
