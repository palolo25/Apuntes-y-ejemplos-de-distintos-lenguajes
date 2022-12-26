package MienbrosEstaticosEnUnaClase;

public class mainEstaticos {

	private static String frase = "Primera frase";
	
	public static int operacion(int n1, int n2) {
		
		int suma = n1 + n2;
		return suma;
		
	}
	
	public static void main(String[] args) {

		mainEstaticos ob1 = new mainEstaticos();
		mainEstaticos ob2 = new mainEstaticos();

		ob2.frase = "segunda frase";
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
		
		System.out.println("La suma es: " +  mainEstaticos.operacion(4, 7));
		
	}

}
