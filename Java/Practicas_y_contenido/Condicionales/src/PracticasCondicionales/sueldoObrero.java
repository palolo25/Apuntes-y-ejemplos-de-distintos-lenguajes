package PracticasCondicionales;

import javax.swing.JOptionPane;

public class sueldoObrero {

    public static void main(String[] args) {
        int horas;
        float salarioTotal;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajo esta semana: "));



        if (horas <= 40) {
            salarioTotal = horas * 16;
            JOptionPane.showMessageDialog(null, "Su sueldo semanal es de: " + salarioTotal);
        } else {
            salarioTotal = (40 * 16) + ((horas - 40) * 20);
            JOptionPane.showMessageDialog(null, "Su sueldo semanal es de: " + salarioTotal);
        }




    }

}
