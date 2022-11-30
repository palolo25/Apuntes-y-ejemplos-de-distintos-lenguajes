package matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DefMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int matriz [][],nFil,nCol;
		
		nFil = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de filas: "));
		nCol = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de columnas: "));
		
		matriz = new int [nFil][nCol];
		
		System.out.println("Escriba la matriz: ");
		for(int i = 0; i<nFil;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print("matriz ["+i+"]["+j+"]: ");
				matriz [i][j] = entrada.nextInt();
			}
			
			
		}
		
		System.out.println("La matriz es: ");
		
		for(int i =0; i<nFil;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print(matriz[i][j]);
			}
			
			
		}

	}

}
