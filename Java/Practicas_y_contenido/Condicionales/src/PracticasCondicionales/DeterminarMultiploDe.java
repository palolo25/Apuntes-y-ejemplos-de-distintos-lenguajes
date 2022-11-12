package PracticasCondicionales;

import javax.swing.JOptionPane;

public class DeterminarMultiploDe {

    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
        
        if(numero%10 == 0) {
            
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
        }
        
    }

}
