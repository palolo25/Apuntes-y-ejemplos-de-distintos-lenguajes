package Clases_metodos_final;

public class Cuadrado extends FiguraCerrada {

	private double area;

	public Cuadrado(double tamaño, int nLados, double area) {
		super(tamaño, nLados);
		this.area = area;
	}
	
	public  void dibujar1() {
		
		System.out.println("Dibujamos un cuadrado");
	}
	
}
