package MetodoConstructor;

public class Constructor {

	//Atributos
	String nombre;
	int edad;
	
	//Metodos
	
	//Metodo constructor
	public Constructor(String _nombre, int _edad) {
		
		nombre = _nombre;
		edad = _edad;	
	}
	
	//Otra forma de hacerlo 
	//El this. hace diferencia entre atributo y parametro
/*public Constructor(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;	
	}*/
	
	
	public void mostrarDatos() {
		
		System.out.println("El nombre es: "+ nombre);
		System.out.println("La edad es: "+ edad);
	}
}
