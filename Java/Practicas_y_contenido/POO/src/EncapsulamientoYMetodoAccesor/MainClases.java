package EncapsulamientoYMetodoAccesor;

public class MainClases {

	public static void main(String[] args) {
		
		Clase1 p1 = new Clase1();
		
		
		p1.setEdad(15);
		p1.setNombre("Pablo");
		System.out.println("La edad es: "+ p1.getEdad());
		System.out.println("Mi nombre es: "+ p1.getNombre());
		
	}

}
