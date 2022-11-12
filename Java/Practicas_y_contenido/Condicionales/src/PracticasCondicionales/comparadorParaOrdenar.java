package PracticasCondicionales;

import javax.swing.JOptionPane;

public class comparadorParaOrdenar {

    public static void main(String[] args) {


        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un segundo numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un tercer numero: "));


        if ((n1 > n2) && (n2 > n3)) {

            JOptionPane.showMessageDialog(null, "EL orden es el siguiente: " + n1 + "-" + n2 + "-" + n3);

        } else if ((n1 > n3) && (n3 > n2)) {

            JOptionPane.showMessageDialog(null, "EL orden es el siguiente: " + n1 + "-" + n3 + "-" + n2);

        } else if ((n2 > n3) && (n3 > n1)) {

            JOptionPane.showMessageDialog(null, "EL orden es el siguiente: " + n2 + "-" + n3 + "-" + n1);




        } else if ((n2 > n1) && (n1 > n3)) {

            JOptionPane.showMessageDialog(null, "EL orden es el siguiente: " + n2 + "-" + n1 + "-" + n3);


        } else if ((n3 > n1) && (n1 > n2)) {

            JOptionPane.showMessageDialog(null, "EL orden es el siguiente: " + n3 + "-" + n1 + "-" + n2);
        } else {

            JOptionPane.showMessageDialog(null, "EL orden es el siguiente: " + n3 + "-" + n2 + "-" + n1);
        }
    }

}
