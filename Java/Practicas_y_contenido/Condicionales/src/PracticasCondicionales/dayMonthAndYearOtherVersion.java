package PracticasCondicionales;

import javax.swing.JOptionPane;

public class dayMonthAndYearOtherVersion {

    public static void main(String[] args) {
        
        
        int dia = 0;
        int mes = 0;
        int year = 0;
        
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Que dia es hoy: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("En que mes estamos: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("En que año estamos: "));
        
        
        if(year == 0) {
            JOptionPane.showMessageDialog(null, "Valor incorrecto");
        }
        else if((mes == 2) && (dia > 1 && dia < 28)) {
            
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
        else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia >= 1 && dia <= 30) {
            
            JOptionPane.showMessageDialog(null, "Fecha corecta");
        }
        else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && (dia >= 1 && dia <= 31)) {
            
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor incorrecto");
        }

    }

}
