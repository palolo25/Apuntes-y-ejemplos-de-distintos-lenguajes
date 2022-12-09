/*
 	Crear y cargar una matriz de tamaño n*m y decir si es simetrica o no
 */
package practicas;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class ejercicio1 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        int matriz[][], nFil, nCol;
        boolean simetrica = true;

        nFil = Integer.parseInt(JOptionPane.showInputDialog("Escriba numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Escriba numero de columnas: "));

        matriz = new int[nFil][nCol];

        System.out.println("Escriba una matriz: ");

        for (int i = 0; i < nFil; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        if (nFil == nCol) {
            int i, j;
            i = 0;
            while (i < nFil && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
                JOptionPane.showInternalMessageDialog(null, "La matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }

        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
    }

}