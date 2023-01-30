package Polimorfismo;

public class MainPrin {

	public static void main(String[] args) {
		
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("4528 LPK", "BMW", "M3");
		misVehiculos[1] = new VehiculoTurismo("1254 ÑPL", "MERCEDES", "CLA", 5);
		misVehiculos[2] = new VehiculoDeportivo("1212 ZLM", "TOYOTA", "SUPRA", 420);
		misVehiculos[3] = new VehiculoFurgoneta("1030 CPK", "CITROEN", "C15", 2500);
		
		
		for(Vehiculo vehiculo: misVehiculos) {
			System.out.println(vehiculo.mostrarDatos());
			System.out.println("");
		}
		
	}

}
