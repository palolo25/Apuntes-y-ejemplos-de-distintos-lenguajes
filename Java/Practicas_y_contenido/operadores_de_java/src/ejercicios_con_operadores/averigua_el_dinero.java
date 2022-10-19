package ejercicios_con_operadores;

import java.util.Scanner;

public class averigua_el_dinero {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        float N,guillermo,luis,juan;
        System.out.println("Que dinero tiene guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (guillermo + luis) /2;
        
        N = guillermo + luis + juan;
        
        System.out.println("\nLa suma de los tres es igual a: "+ N);

    }

}
