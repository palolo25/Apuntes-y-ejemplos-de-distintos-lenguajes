package PracticasCondicionales;

import javax.swing.JOptionPane;

public class pedirNumero {

    public static void main(String[] args) {
       
        
        int numero; 
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero: "));
        
        if(numero < 10) {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene una cifra");
        }
        else if(numero < 100) {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene dos cifras");

        }
        else if(numero < 1000) {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene tres cifras");

        }
        else if(numero < 10000) {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene cuatro cifras");

        }
        else if(numero < 100000) {
            JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene cinco cifras");

        }

    }

}
