package PracticasCondicionales;

import javax.swing.JOptionPane;

public class CalcuBasica {

    public static void main(String[] args) {
        
        int num1, num2, suma, resta , multiplicacion ,division ;
        
        char operacion;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un primer numero: "));
        
        operacion = JOptionPane.showInputDialog("Que operacion desea realizar").charAt(0);
        
        switch(operacion) {
            
            case 's': 
            case 'S': suma = num1 + num2;
                     JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                     break;
                    
                
                
            case 'r': 
            case 'R':resta = num1 - num2;
                    JOptionPane.showMessageDialog(null, "La resta es: "+ resta);
                    break;
                
                
            case 'm': 
            case 'M':multiplicacion = num1 * num2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ multiplicacion);
                    break;
            
            
            case 'd': 
            case 'D':division = num1 / num2;
                    JOptionPane.showMessageDialog(null, "La division es: "+ division);
                    break;
                    
                    default: JOptionPane.showMessageDialog(null, "Opcion no valida");
        
        }

    }

}
