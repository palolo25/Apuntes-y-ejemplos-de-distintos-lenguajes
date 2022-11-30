/*
 Pedir numeros hasta que se teclee uno negativo, y
 mostrar cuantos numeros se han introducido.
 */
package PracticasBucles;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

        int numero, contador = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));

        while (numero >= 0) {
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba otro numero: "));
        }

        System.out.println("Usted ha introducido " + contador + " numeros");
    }

}