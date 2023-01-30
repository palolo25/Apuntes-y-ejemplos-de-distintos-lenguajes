package Clases_y_metodos_abstractos;

public class MainAnimalCar {

	public static void main(String[] args) {
		
		Planta planta = new Planta();
		AnimalCarnivoro animalc = new AnimalCarnivoro();
		AnimalHervivoro animalh = new AnimalHervivoro();
		
		planta.alimentarse();
		animalc.alimentarse();
		animalh.alimentarse();
	}

}
