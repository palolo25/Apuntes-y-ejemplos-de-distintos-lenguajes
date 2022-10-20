package ejercicios_con_operadores;

import java.util.Scanner;

public class ecuacion_segundo_grado {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double a,b,c,resultado1,resultado2;
        
        System.out.println("Escriba el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Escriba el valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Escriba el valor de c: ");
        c = entrada.nextDouble();
        
        resultado1 = (-b+Math.sqrt(Math.pow(b, 2)- (4*a*c))) / (2*a);
        resultado2 = (-b-Math.sqrt(Math.pow(b, 2)- (4*a*c))) / (2*a);
        
        System.out.println("La raiz es igual a: " + resultado1);
        System.out.println("La raiz es igual a: " + resultado2);
        

    }

}
