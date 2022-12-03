package SobrecargarMetodos;

public class Sobrecarga {
	
	String nombre;
	int edad;
	String dni;
	
	//Metodos
	public Sobrecarga(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Sobrecarga(String dni) {
		super();
		this.dni = dni;
	}

	
	public void correr() {
		System.out.println("Soy "+nombre+ " ,tengo "+edad+ " años y estoy en una carrera"+" y mi dni es "+dni);
	}
	public void correr(int km) {
		System.out.println("He recorrido "+km+" kilometros");
	}
}
