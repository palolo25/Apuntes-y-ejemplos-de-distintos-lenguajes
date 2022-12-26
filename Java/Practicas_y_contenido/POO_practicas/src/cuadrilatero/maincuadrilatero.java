package cuadrilatero;

import javax.swing.JOptionPane;

public class maincuadrilatero {

    public static void main(String[] args) {

        cuadrilatero c1;

        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el lado 1 del cuadrilatero: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Escriba el lado 2 del cuadrilatero: "));

        if (lado1 == lado2) { // es un cuadrado

            c1 = new cuadrilatero(lado1);
        } else {
            c1 = new cuadrilatero(lado1, lado2);
        }


        System.out.println("El perimetro es: " + c1.getPerimetro());
        System.out.println("El area es: " + c1.getArea());
    }

}