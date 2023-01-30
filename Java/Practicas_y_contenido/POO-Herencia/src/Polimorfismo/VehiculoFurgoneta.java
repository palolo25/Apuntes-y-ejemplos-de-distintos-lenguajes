package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {

	private int carga;

	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	
	@Override
	public String mostrarDatos() {
		
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga: "+carga;
	}
}
