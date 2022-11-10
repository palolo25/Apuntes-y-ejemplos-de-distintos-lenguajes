package intro_condicionales;

import javax.swing.JOptionPane;

public class condicionales_operadorTernario {

    public static void main(String[] args) {
     
        int numero;
        String mensaje;
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
        
        mensaje = (numero%2==0) ? "Es par" : "Es impar";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
