package PracticasCondicionales;

import javax.swing.JOptionPane;

public class determinarSiEsMayuscula {

    public static void main(String[] args) {
       
        char letra;
        
        letra = JOptionPane.showInputDialog("Escriba una letra: ").charAt(0);
        
        
        if(Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula: ");
            
        }else {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula: ");
        }
    }

}
