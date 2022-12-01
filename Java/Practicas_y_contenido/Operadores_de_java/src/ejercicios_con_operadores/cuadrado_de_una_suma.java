package ejercicios_con_operadores;

import java.util.Scanner;

public class cuadrado_de_una_suma {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        double a,b,resultado;
        
        System.out.println("\nEscriba el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("\nEscriba el valor de b: ");
        b = entrada.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        
        System.out.println("\nEl resultado es: "+ resultado);

    }

}