package Clases_metodos_final;

public class Cuadrado extends FiguraCerrada {

	private double area;

	public Cuadrado(double tama�o, int nLados, double area) {
		super(tama�o, nLados);
		this.area = area;
	}
	
	public  void dibujar1() {
		
		System.out.println("Dibujamos un cuadrado");
	}
	
}
