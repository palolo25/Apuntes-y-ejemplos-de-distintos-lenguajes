package Introduccion;

public class Coche {
	//Atributos
	String color;
	String marca;
	int km;
	
	
	
	//Metodo
	public static void main(String [] args ) {
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		Coche coche3 = new Coche();
		
		coche1.color = "blanco";
		coche1.km = 0;
		coche1.marca = "BMW";
		
		coche2.color = "negro";
		coche2.km = 100;
		coche2.marca = "Buggatti";
		
		coche3.color = "rojo";
		coche3.km = 298;
		coche3.marca = "ferrari";
		
		System.out.println("El primer coche es un: "+ coche1.marca +" "+ coche1.color +" con estos kilometros " + coche1.km);
		System.out.println("El segundo coche es un: "+ coche2.marca +" "+ coche2.color +" con estos kilometros " + coche2.km);
		System.out.println("El tercer coche es un: "+ coche3.marca +" "+ coche3.color +" con estos kilometros " + coche3.km);
		
	}

}
