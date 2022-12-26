/*
 Construir un programa que permita dirigir el movimiento
 de un objeto dentro de un tablero y actualice su posicion
 dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO,
 IZQUIERDA y DERECHA. Tras cada movimiento el programa mostrara
 la nueva direccion elegida y las cordenadas de situacion del objeto dentro
 del tablero.
 */
package tablero;

public class Tablero {
	
	private int x;
	private int y;
	
	public Tablero(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void moverArriba(int incremento) {
		
		y += incremento;
	}
	
	public void moverAbajo(int incremento) {
		
		y -= incremento;
	}
	
	public void moverDerecha(int incremento) {
		
		x += incremento;
	}
	
	public void moverIzquierda(int incremento) {
		
		x -= incremento;
	}
	
	
	

}
