package PracticasCondicionales;

import javax.swing.JOptionPane;

public class numeroMayorOmenor {

    public static void main(String[] args) {

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un segundo numero: "));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero1);
        } else if (numero2 > numero1) {

            JOptionPane.showMessageDialog(null, "El numero mayor es: " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Los dos numero son iguales");
        }

    }

}
