package ejercicios_con_operadores;

import java.util.Scanner;

public class calificacion_estudiante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float participacion, examen1, examen2, examenFinal, notaFinal;
        System.out.println("\nParticipacion del alumno: ");
        participacion = entrada.nextFloat();

        System.out.println("\nNota primer parcial: ");
        examen1 = entrada.nextFloat();

        System.out.println("\nNota segundo parcial: ");
        examen2 = entrada.nextFloat();

        System.out.println("\nNota examen final: ");
        examenFinal = entrada.nextFloat();

        notaFinal = (float)((float)(participacion * 0.10) + (examen1 * 0.25) + (examen2 * 0.25) + (examenFinal * 0.40));

        System.out.println("Desglose de las notas:");
        System.out.println("Participacion: "+ (participacion*0.10));
        System.out.println("Primer examen: "+ (examen1*0.25));
        System.out.println("Segundo examen: "+ (examen2*0.25));
        System.out.println("Examne final: "+(examenFinal*0.40));
        
        System.out.println("La nota final del alumno es: " + notaFinal);

    }

}
