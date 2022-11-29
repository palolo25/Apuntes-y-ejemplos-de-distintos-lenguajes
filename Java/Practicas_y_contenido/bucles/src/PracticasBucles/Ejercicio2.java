// Este programa diferencia de numero positivo y negativo, finaliza cuando se escribe 0

package PracticasBucles;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numero; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		
		while(numero != 0) {
			
			if(numero>0){
				System.out.println("Este numero "+ numero + " es positivo");
			}
			else {
				System.out.println("Este numero "+numero+" es negativo");
			}
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));	
			
			
			
		}
	}

}
