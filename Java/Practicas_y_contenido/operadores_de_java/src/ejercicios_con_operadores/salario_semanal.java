package ejercicios_con_operadores;

import java.util.Scanner;

public class salario_semanal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float horasSemanales, salarioHora, salarioTotal;

        System.out.println("Cuantas horas trabajaste esta semana: ");
        horasSemanales = entrada.nextFloat();
        System.out.println("Cuanto ganas por hora: ");
        salarioHora = entrada.nextFloat();

        salarioTotal = horasSemanales * salarioHora;

        System.out.println("Su salario semanal es igual a: " + salarioTotal);

    }

}
