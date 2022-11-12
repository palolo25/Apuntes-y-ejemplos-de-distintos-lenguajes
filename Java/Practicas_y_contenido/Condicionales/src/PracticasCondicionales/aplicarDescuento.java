package PracticasCondicionales;

import javax.swing.JOptionPane;

public class aplicarDescuento {

    public static void main(String[] args) {

        float compra = 0, descuento = 0;


        compra = Float.parseFloat(JOptionPane.showInputDialog("Valor de su compra: "));
        if (compra > 300) {



            descuento = compra * 0.20f;
            compra -= descuento;
            JOptionPane.showMessageDialog(null, "Su compra con descuento es de: " + compra);
        } else {
            JOptionPane.showMessageDialog(null, "No llega al valor requerido pra el descuento" + compra);
        }

    }

}