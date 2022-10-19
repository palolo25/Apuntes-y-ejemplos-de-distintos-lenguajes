package ejercicios_con_operadores;

import java.util.Scanner;

public class salario_del_vendedor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int coche;
        float salarioMensual,costeCoche,comision,valorPorCoche,salarioTotal;
        
        System.out.println("Cuanto es su salario mensual: ");
        salarioMensual = entrada.nextFloat();
        System.out.println("Cuantos coches ha vendido: ");
        coche =  entrada.nextInt();
        
        comision = coche * 150;
        
        System.out.println("Cuanto cuesta el coche: ");
        
        costeCoche = entrada.nextFloat();
        
        valorPorCoche = (float) (costeCoche * 0.05);
        
        salarioTotal = salarioMensual + comision + valorPorCoche;
        
        System.out.println("Su salario total es de: "+ salarioTotal);
        
        

    }

}
