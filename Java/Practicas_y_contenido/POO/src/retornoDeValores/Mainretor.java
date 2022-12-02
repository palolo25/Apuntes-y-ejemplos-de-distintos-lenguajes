package retornoDeValores;

import javax.swing.JOptionPane;

import parametroYArgumentos.Operacion;

public class Mainretor {
	public static void main(String[]args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
		
		Operacionretor op = new Operacionretor();
		
	int suma =	op.Sumar(n1,n2);
	int resta =	op.Restar(n1, n2);
	int div =	op.Dividir(n1, n2);
	int mult =	op.Multiplicar(n1, n2);
		op.MostrarResultados(suma, resta, div, mult);
		
		
		}
}
