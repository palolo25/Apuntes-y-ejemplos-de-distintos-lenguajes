package tablero;

import java.util.Scanner;

public class mainTablero {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Tablero t1;
		int x,y,opcion,incremento = 0;
		
		System.out.println("Escriba la cordenada de x: ");
		x = entrada.nextInt();
		System.out.println("Escriba la cordenada de y: ");
		y = entrada.nextInt();
		
		//Posicion inicial en el plano
		t1 = new Tablero(x,y);
		
		do {
			System.out.println("\n\t.:MENU:");
			System.out.println("1. Mover hacia ARRIBA");
			System.out.println("2. Mover hacia ABAJO");
			System.out.println("3. Mover hacia IZQUIERDA");
			System.out.println("4. Mover hacia DERECHA");
			System.out.println("5. SALIR");
			System.out.print("Escriba la opcion: ");
			opcion = entrada.nextInt();
			
			if(opcion != 5) {
				System.out.println("Cuantos espacion quiere mpoverse: ");
				 incremento = entrada.nextInt();
			}
			switch(opcion) {
			
			case 1: t1.moverArriba(incremento);
				break;
			
			case 2: t1.moverAbajo(incremento);
				break;
			
			case 3: t1.moverDerecha(incremento);
				break;
			
			case 4: t1.moverIzquierda(incremento);
				break;
			
			case 5:
				break;
			default:System.out.println("Opcion no valida");
			}
			System.out.println("Posicion actual de x e y: ("+ t1.getX() +" , " + t1.getY() + ")");
		}while(opcion != 5);
		

	}

}
