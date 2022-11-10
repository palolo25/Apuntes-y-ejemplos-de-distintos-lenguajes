
/*La sentecia switch:
 * 
 * switch(dato){
 * 
 * 
 * 
 * case 1 : instrucuones1;
 *          break;
 *          
 *          
 * case 2 : instrucuones2;
 *          break;
 *          
 * case 3 : instrucuones3;
 *          break;
 *          
 *          
 * case 4 : instrucuones4;
 *          break;
 * }
 * */
package intro_condicionales;

import javax.swing.JOptionPane;

public class condicionales_switch_ {

    public static void main(String[] args) {
       
        
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero entre 1 y 5: "));
        
        
        switch(dato) {
            
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
            break;
            
            case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
            break;
            
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
            break;
            
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
            break;
            
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
            break;
            
            default: JOptionPane.showMessageDialog(null, "Ese numero es invalido");
            
            
        }

    }

}
