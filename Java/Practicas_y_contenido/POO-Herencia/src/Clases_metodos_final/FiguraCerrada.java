package Clases_metodos_final;

 public class FiguraCerrada extends Figura {

	private int nLados;

	public FiguraCerrada(double tama�o, int nLados) {
		super(tama�o);
		this.nLados = nLados;
	}
	
	
	public final void dibujar() {
		
		System.out.println("Dibujo de una figura cerrada");
	}
}
