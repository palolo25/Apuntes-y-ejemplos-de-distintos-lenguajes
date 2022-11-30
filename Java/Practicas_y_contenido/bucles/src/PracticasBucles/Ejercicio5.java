/*
 Realizar un juego para adivinar. Para ello generar un numero aleatorio entre 0-100
 y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o menor
 con respecto a N. El proceso termina cuando el usuario acierta y mostrar el numero de intentos.
 */
package PracticasBucles;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        int numero, aleatorio, contador = 0;
        aleatorio = (int)(Math.random() * 100);

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
            if (aleatorio > numero) {
                System.out.println("Escriba un numero mayor");
            } else {
                System.out.println("Escriba un numero menor");
            }
            contador++;
        } while (numero != aleatorio);

        System.out.println("\nPerfecto adivinaste el numero en tantos intentos: " + contador);

    }

}