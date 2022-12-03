package Constantes;

public class Persona {

	private final String nombre;
	private int edad;
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		
		System.out.println("El nombre es: "+ nombre);
		System.out.println("La edad es: "+ edad);
	}
}
