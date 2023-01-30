package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {

	private int nPuertas;

	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.nPuertas = numeroPuertas;
	}

	
public int getNumeroPuertas() {
		return nPuertas;
	}

@Override
public String mostrarDatos() {
		
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de puertas: "+nPuertas;
	}
}
