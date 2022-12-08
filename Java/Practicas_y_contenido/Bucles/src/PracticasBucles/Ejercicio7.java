/*
 Una empresa que se dedica a la venta de desinfectante
 necesita un programa para gestionar las facturas.
 En cada factura figura: el codigo de articulo, la cantidad 
 vendida en litros y el precio/litro.
 Se pide de 5 facturas introducidas facturacion total, cantidad en litros
 vendidos del articulo 1 y cuantas facturas se emitieron de mas de 600€
 */
package PracticasBucles;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int codigo, litros,conteoMas600 = 0,litrosArticulos = 0;
		float precioL,importeFactura,facturacionT = 0;
		
		for(int i = 1;i<=5;i++) {
			
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulos Nª"+i+"\nEscriba el codigo: "));
			litros = Integer.parseInt(JOptionPane.showInputDialog("Articulos Nª"+i+"\nEscriba la cantidad de litros: "));
			precioL = Float.parseFloat(JOptionPane.showInputDialog("Articulos Nª"+i+"\nEscriba el precio por litro: "));
			
			importeFactura = (float) litros * precioL;
			facturacionT += importeFactura;
			
			if(codigo == 1) {
				litrosArticulos += litros;
			}
			
			if(importeFactura > 600) {
				conteoMas600++;
			}
			
					
		}
		
		
		System.out.println("Resumen de ventas");
		System.out.println("Facturacion total: "+facturacionT);
		System.out.println("Litros vendidos: "+ litrosArticulos);
		System.out.println("Facturas de mas de 600€: "+ conteoMas600);
		

	}

}
