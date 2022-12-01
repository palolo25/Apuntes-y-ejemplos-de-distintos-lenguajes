package introduccion_java;

import java.util.Scanner;

public class Entrada_salida_datos_con_cadenas {

    public static void main(String[] args) {
       
        
        Scanner entrada = new Scanner(System.in);
        String cadena;
        
        System.out.println("Escriba una cadena: ");
        cadena = entrada.nextLine();
        
        System.out.println("La cadena es: "+ cadena);
        

    }

}
