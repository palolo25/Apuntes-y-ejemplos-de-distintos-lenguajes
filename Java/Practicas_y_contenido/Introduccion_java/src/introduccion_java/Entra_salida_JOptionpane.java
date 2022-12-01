package introduccion_java;

import javax.swing.JOptionPane;

public class Entra_salida_JOptionpane {

    public static void main(String[] args) {
       String cadena;
       int entero;
       char letra;
       double decimal;
       
       cadena = JOptionPane.showInputDialog("Escriba una cadena: ");
       entero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero entero: "));
       letra = JOptionPane.showInputDialog("Escribe una letra; ").charAt(0);
       decimal = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero decimal: "));
      
       JOptionPane.showMessageDialog(null, "La cadena es: "+ cadena);
       JOptionPane.showMessageDialog(null,"El entero es: "+ entero);
       JOptionPane.showMessageDialog(null,"La letra es: "+ letra);
       JOptionPane.showMessageDialog(null,"El decimal es: "+ decimal);
    }

}
