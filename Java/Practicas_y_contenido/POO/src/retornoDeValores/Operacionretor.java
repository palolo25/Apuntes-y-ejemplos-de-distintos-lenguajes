package retornoDeValores;

public class Operacionretor {

		
	//Metodos 
	// Metodo para pedir al usuario dos numeros 
		
		
		public int Sumar(int numero1,int numero2) {
			int	suma = numero1 + numero2;
			return suma;
		}
		public int Restar(int numero1,int numero2) {
			int	resta = numero1 - numero2;
			return resta;
		}
		public int Dividir(int numero1,int numero2) {
			int	division = numero1 / numero2;
			return division;
		}
		public int Multiplicar(int numero1,int numero2) {
			int	multiplicacion = numero1 * numero2;
			return multiplicacion;
		}
		public void MostrarResultados(int suma, int resta, int division,int multiplicacion) {
			System.out.println("El resultado de la suma es: "+ suma);
			System.out.println("El resultado de la resta es: "+ resta);
			System.out.println("El resultado de la division es: "+ division);
			
			System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
		}
}
