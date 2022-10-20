package ejercicios_con_operadores;

import java.util.Scanner;

public class conversor_de_horas {

    public static void main(String[] args) {
        
        float horas,dias,semanas,horasDias,horasSemana,horasTotales;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cantida de horas: ");
        
        horas = entrada.nextFloat();
        
        horasTotales = horas%24;
        
        horasDias = (horas%168/24);
        long resultadoDias = Math.round(horasDias);
        horasSemana = (horas/168);
        long resultadoSemana = Math.round(horasSemana);
        
        System.out.println("Numero de semanas: "+ resultadoSemana);
        System.out.println("Numero de dias: " + resultadoDias);
        System.out.println("Numero de horas: " + horasTotales);

    }

}
