package Arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int nElementos;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Elija el tamaño del arreglo: "));
		
		char[] letras = new char[nElementos];
		
		System.out.println("Escriba los caracteres que quiera: ");
		
		for(int i=0 ; i< nElementos ; i++) {
			
			System.out.println((i+1)+" . Escriba un caracter: ");
			
			letras[i] = entrada.next().charAt(0);
		}
		
		
		System.out.println("Los caracteres del arreglo son: ");
		
		for(int i=0;i<nElementos;i++) {
			System.out.println(letras[i]);
		}
		
		

	}

}
