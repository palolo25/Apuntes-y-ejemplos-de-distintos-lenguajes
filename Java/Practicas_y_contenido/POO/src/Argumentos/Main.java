package Argumentos;

import javax.swing.JOptionPane;

public class Main {

	
	public static void main(String[]args) {
	int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
	int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
	
	Operacion op = new Operacion();
	
	op.Sumar(n1,n2);
	op.Restar(n1, n2);
	op.Dividir(n1, n2);
	op.Dividir(n1, n2);
	op.MostrarResultados();
	
	
	}
}
