package Cochebarato;

import java.util.Scanner;

public class mainVehiculo {

	public static int indiceCocheMBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
		
		precio = coches[0].getPrecio();
		for(int i=1;i<coches.length;i++) {
			if(coches[i].getPrecio()< precio) {
				
				precio = coches[i].getPrecio();
				
				indice = i;
				
			}
		}
		return indice;
	}
	
	
 static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		String marca,modelo;
		float precio;
		int numeroVehiculos,indiceBarato;
		
		System.out.println("Cantidad de vehiculos: ");
		
		numeroVehiculos = entrada.nextInt();
		// Creamos los objetos
		Vehiculo coches [] = new Vehiculo[numeroVehiculos];
		
		for(int i=0;i<coches.length;i++) {
			
			System.out.println("Escriba las caracteristicas del coche "+(i+1)+":");
			
			System.out.println("Marca del coche: ");
			marca = entrada.nextLine();
			System.out.println("Modelo del coche: ");
			modelo = entrada.nextLine();
			System.out.println("precio del coche: ");
			precio = entrada.nextFloat();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		indiceBarato = indiceCocheMBarato(coches);
		
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());
		

	}

}
