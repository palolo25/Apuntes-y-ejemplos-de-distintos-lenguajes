package ejercicios_con_operadores;

import java.util.Scanner;

public class suma_de_3_notas {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         float nota1,nota2,nota3,suma;
         
         System.out.println("Escriba 3 nota: ");
         
         nota1 = entrada.nextFloat();
         nota2 = entrada.nextFloat();
         nota3 = entrada.nextFloat();
         
          suma = nota1+nota2+nota3;// suma de las 3 notas 
         
         System.out.println("\nLa suma es igual a: " + suma);

    }

}
