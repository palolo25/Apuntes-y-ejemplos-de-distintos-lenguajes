/*
 * La sentencia if
 * 
 * 
 * if(condicion){
 * instruccion1;
 * }
 * else {
 * instruccion2;
 * }
 * */
package intro_condicionales;

import javax.swing.JOptionPane;

public class condicionales_if_else {

    public static void main(String[] args) {
        
        int numero, dato = 5 ;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
        
        if (numero == dato) {
            
            JOptionPane.showMessageDialog(null, "El numero es 5");
            
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");   
        }

    }

}
