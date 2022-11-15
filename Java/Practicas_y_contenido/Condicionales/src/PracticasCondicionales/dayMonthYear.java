package PracticasCondicionales;

import javax.swing.JOptionPane;

public class dayMonthYear {

    public static void main(String[] args) {
      
        
        int dia = 0;
        int mes = 0;
        int year = 0;
        
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Que dia es hoy: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("En que mes estamos: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("En que año estamos: "));
        
        if(dia < 30 && mes < 12) {
            JOptionPane.showMessageDialog(null, "Hoy es dia "+ dia);
            JOptionPane.showMessageDialog(null, "Estamos en el mes "+ mes);
            JOptionPane.showMessageDialog(null, "Estamos en el año "+ year);
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor no valido");
           
        }

    }

}
