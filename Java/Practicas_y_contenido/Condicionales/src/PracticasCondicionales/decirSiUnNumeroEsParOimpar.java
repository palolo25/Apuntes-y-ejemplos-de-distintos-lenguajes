package PracticasCondicionales;

import javax.swing.JOptionPane;

public class decirSiUnNumeroEsParOimpar {

    public static void main(String[] args) {


        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un segundo numero: "));


        if ((numero1 % 2 == 0) && (numero2 % 2 == 0)) {

            JOptionPane.showMessageDialog(null, "Los dos numeros son pares");
        } else if ((numero1 % 2 != 0) && (numero2 % 2 != 0)) {

            JOptionPane.showMessageDialog(null, "Los dos numeros son impares");

        } else {

            JOptionPane.showMessageDialog(null, "Hay un numero par y otro impar");
        }
    }

}
