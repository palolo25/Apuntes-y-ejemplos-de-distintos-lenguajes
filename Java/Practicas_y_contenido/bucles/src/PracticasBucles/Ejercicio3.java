/*
 Leer tres numeros hasta que se ponga un 0. 
 Para cada numero decir si es par o impar. 
 */
package PracticasBucles;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		
		while(numero != 0 ) {
			
			if(numero %2 == 0) {
				
				System.out.println("El numero "+numero+" es par");
				
			}
			else {
			System.out.println("El numero "+numero+" es impar");	
				
			}
			
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba otro numero: "));
		}
		
		
		
		



	}

}
