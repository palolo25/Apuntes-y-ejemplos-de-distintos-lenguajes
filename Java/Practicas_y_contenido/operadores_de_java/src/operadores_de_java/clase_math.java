package operadores_de_java;

import java.util.Scanner;

public class clase_math {

    public static void main(String[] args) {
        // como hacer una raiz cuadrada de un double y un entero
        double raiz = Math.sqrt(9.936);
        
        System.out.println(raiz);
        
        int raiz2 = (int)Math.sqrt(9);
        
        System.out.println(raiz2);
       // como elebar a una potencia  
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        
        System.out.println(resultado);
        
        // redondeo de un un numero con round
        double numero = 4.56;
        long resultado2 = Math.round(numero);
        
        System.out.println(resultado2);
        
        // metodo ramdom(entrega un numero aleatorio)
        
        double numero2 = Math.random();
        
        System.out.println(numero2);

    }

}
