package Clases_y_metodos_abstractos;

public class Planta implements ISerVivo {

	
	@Override
	public void alimentarse() {
		System.out.println("La planta se alimenta a traves de la fotosintesis");
	}

	@Override
	public boolean alimentarse(ISerVivo victima) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}
}
