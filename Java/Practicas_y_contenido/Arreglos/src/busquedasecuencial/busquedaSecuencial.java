/*
	Busqueda secuencial:
	
	arreglo[] = {3,1,2,5,4}; dato = 2;
 	
 */

package busquedasecuencial;

import javax.swing.JOptionPane;

public class busquedaSecuencial {

	public static void main(String[] args) {
		
		int arreglo[]= {4,1,5,2,3};
		int dato;
		boolean band = false;
		dato = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero que busca: "));
		
		int i=0;
		
		while(i<5 && band == false ) {
			
			if(arreglo[i] == dato ) {
				band = true;
			}
			i++;
		}
		
		if(band == false) {
			JOptionPane.showMessageDialog(null, "Este numero no esta registrado");
		}else {
			
			JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion: "+(i-1));
		}
	
	}

}
