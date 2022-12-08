/*
 Dadas las edades de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años y la cantidad de añumnos que miden mas de 1.75
 */
package PracticasBucles;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int edad,sumaEdad = 0, conteoM18 = 0, conteom175 = 0;
		float altura,sumaAltura = 0;
		
		for(int i=1;i<=5;i++) {
			
			edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\nEscriba su edad: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\nEscriba su estatura: "));
			
			sumaEdad += edad;//suma iterativa de edades
			sumaAltura += altura;//suma iterativa de alturas
			
			if(edad>18) {
				conteoM18++;
			}
			if(altura>1.75) {
				conteom175++;
			}
		}
		
		float mediaEdad = (float)sumaEdad/5;
		float mediaAltura = (float) sumaAltura/5;
		
		System.out.println("La media de la edad es: "+mediaEdad);
		System.out.println("La media de la altura es: "+mediaAltura);
		System.out.println("Alumnos mayores de edad: "+conteoM18);
		System.out.println("Alumos mas altos de 175: "+conteom175);
	}

}
