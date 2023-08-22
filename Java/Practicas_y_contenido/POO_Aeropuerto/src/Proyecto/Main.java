package Proyecto;

import java.util.Scanner;

public class Main {
	
	static Scanner entrada = new Scanner(System.in);
	final static int num = 4;
	static Aeropuerto aeropuerto[] = new Aeropuerto[num];
	
	
	public static void main(String[] args) {
		
		
		

	}
	
	public static void insertarDatosAeropuerto(Aeropuerto aero[]) {

	    // Aeropuerto 1
	    aero[0] = new AeropuertoPublico("Barajas", "Madrid", "España", 82000000);

	    Compañia compañia1 = new Compañia("Emirates");
	    Compañia compañia2 = new Compañia("Ryaner");
	    Compañia compañia3 = new Compañia("AirSpain");

	    compañia1.insertarVuelo(new Vuelo("IB20", "Madrid", "Mexico", 152, 230));
	    compañia1.getVuelo("IB20").insertarPasajero(new Pasajero("Pepe", "123456G", "Inglesa"));
	    compañia1.getVuelo("IB20").insertarPasajero(new Pasajero("Luis", "654321F", "Española"));
	    compañia1.getVuelo("IB20").insertarPasajero(new Pasajero("Laura", "987654Z", "Mexicana"));
	    compañia1.getVuelo("IB20").insertarPasajero(new Pasajero("Emily", "543210Y", "Canadiense"));
	    compañia1.getVuelo("IB20").insertarPasajero(new Pasajero("Miguel", "135792X", "Española"));

	    compañia2.insertarVuelo(new Vuelo("IC20", "Madrid", "Barcelona", 52, 120));
	    compañia2.getVuelo("IC20").insertarPasajero(new Pasajero("Juan", "123456F", "Inglesa"));
	    compañia2.getVuelo("IC20").insertarPasajero(new Pasajero("Elena", "654321E", "Española"));
	    compañia2.getVuelo("IC20").insertarPasajero(new Pasajero("Sofía", "987654D", "Italiana"));
	    compañia2.getVuelo("IC20").insertarPasajero(new Pasajero("Liam", "246813C", "Estadounidense"));
	    compañia2.getVuelo("IC20").insertarPasajero(new Pasajero("Emma", "135792B", "Inglesa"));

	    compañia3.insertarVuelo(new Vuelo("ID20", "Madrid", "Londres", 352, 200));
	    compañia3.getVuelo("ID20").insertarPasajero(new Pasajero("Ana", "987654H", "Alemana"));
	    compañia3.getVuelo("ID20").insertarPasajero(new Pasajero("Carlos", "543210I", "Española"));
	    compañia3.getVuelo("ID20").insertarPasajero(new Pasajero("Sophia", "246813J", "Alemana"));
	    compañia3.getVuelo("ID20").insertarPasajero(new Pasajero("Lucas", "135792K", "Holandesa"));
	    compañia3.getVuelo("ID20").insertarPasajero(new Pasajero("Olivia", "123456L", "Francesa"));

	    aero[0].insertarCompañia(compañia1);
	    aero[0].insertarCompañia(compañia2);
	    aero[0].insertarCompañia(compañia3);

	    // Aeropuerto 2
	    aero[1] = new AeropuertoPrivado("JFK", "Nueva York", "Estados Unidos");

	    Compañia compañia4 = new Compañia("Company X");
	    Compañia compañia5 = new Compañia("Company Y");
	    Compañia compañia6 = new Compañia("Company Z");

	    compañia4.insertarVuelo(new Vuelo("JF100", "Nueva York", "Los Ángeles", 200, 180));
	    compañia4.getVuelo("JF100").insertarPasajero(new Pasajero("Michael", "987654Z", "Estadounidense"));
	    compañia4.getVuelo("JF100").insertarPasajero(new Pasajero("Emily", "543210Y", "Canadiense"));
	    compañia4.getVuelo("JF100").insertarPasajero(new Pasajero("Oliver", "246813X", "Estadounidense"));
	    compañia4.getVuelo("JF100").insertarPasajero(new Pasajero("Sophia", "135792W", "Estadounidense"));
	    compañia4.getVuelo("JF100").insertarPasajero(new Pasajero("Liam", "123456V", "Estadounidense"));

	    compañia5.insertarVuelo(new Vuelo("JF200", "Nueva York", "Miami", 150, 150));
	    compañia5.getVuelo("JF200").insertarPasajero(new Pasajero("Anna", "987654U", "Alemana"));
	    compañia5.getVuelo("JF200").insertarPasajero(new Pasajero("David", "543210T", "Estadounidense"));
	    compañia5.getVuelo("JF200").insertarPasajero(new Pasajero("Emma", "246813S", "Inglesa"));
	    compañia5.getVuelo("JF200").insertarPasajero(new Pasajero("Olivia", "135792R", "Estadounidense"));
	    compañia5.getVuelo("JF200").insertarPasajero(new Pasajero("Noah", "123456Q", "Estadounidense"));

	    compañia6.insertarVuelo(new Vuelo("JF300", "Nueva York", "Chicago", 180, 170));
	    compañia6.getVuelo("JF300").insertarPasajero(new Pasajero("Sophie", "987654P", "Inglesa"));
	    compañia6.getVuelo("JF300").insertarPasajero(new Pasajero("Lucas", "543210O", "Holandesa"));
	    compañia6.getVuelo("JF300").insertarPasajero(new Pasajero("Isabella", "246813N", "Estadounidense"));
	    compañia6.getVuelo("JF300").insertarPasajero(new Pasajero("Ethan", "135792M", "Estadounidense"));
	    compañia6.getVuelo("JF300").insertarPasajero(new Pasajero("Ava", "123456L", "Estadounidense"));

	    aero[1].insertarCompañia(compañia4);
	    aero[1].insertarCompañia(compañia5);
	    aero[1].insertarCompañia(compañia6);

	    // Aeropuerto 3
	    aero[2] = new AeropuertoPublico("Heathrow", "Londres", "Reino Unido", 50000000);

	    Compañia compañia7 = new Compañia("British Airways");
	    Compañia compañia8 = new Compañia("EasyJet");
	    Compañia compañia9 = new Compañia("Lufthansa");

	    compañia7.insertarVuelo(new Vuelo("LH100", "Londres", "Berlín", 120, 150));
	    compañia7.getVuelo("LH100").insertarPasajero(new Pasajero("William", "987654K", "Británico"));
	    compañia7.getVuelo("LH100").insertarPasajero(new Pasajero("Mia", "543210J", "Británico"));
	    compañia7.getVuelo("LH100").insertarPasajero(new Pasajero("James", "246813I", "Británico"));
	    compañia7.getVuelo("LH100").insertarPasajero(new Pasajero("Sophia", "135792H", "Británico"));
	    compañia7.getVuelo("LH100").insertarPasajero(new Pasajero("Oliver", "123456G", "Británico"));

	    compañia8.insertarVuelo(new Vuelo("EJ200", "Londres", "París", 100, 180));
	    compañia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Noah", "987654F", "Francesa"));
	    compañia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Emma", "654321E", "Inglesa"));
	    compañia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Olivia", "987654D", "Francesa"));
	    compañia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Liam", "543210C", "Irlandesa"));
	    compañia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Sophia", "135792B", "Inglesa"));

	    compañia9.insertarVuelo(new Vuelo("LH300", "Londres", "Múnich", 150, 200));
	    compañia9.getVuelo("LH300").insertarPasajero(new Pasajero("Lucas", "987654A", "Alemán"));
	    compañia9.getVuelo("LH300").insertarPasajero(new Pasajero("Sophie", "654321B", "Alemán"));
	    compañia9.getVuelo("LH300").insertarPasajero(new Pasajero("Noah", "987654C", "Alemán"));
	    compañia9.getVuelo("LH300").insertarPasajero(new Pasajero("Emma", "543210D", "Inglesa"));
	    compañia9.getVuelo("LH300").insertarPasajero(new Pasajero("Oliver", "135792E", "Alemán"));

	    aero[2].insertarCompañia(compañia7);
	    aero[2].insertarCompañia(compañia8);
	    aero[2].insertarCompañia(compañia9);

	    // Aeropuerto 4
	    aero[3] = new AeropuertoPrivado("Schiphol", "Ámsterdam", "Países Bajos");

	    

	    aero[3].getListaCompañia()[0].insertarVuelo(new Vuelo("AM100", "Ámsterdam", "París", 80, 120));
	    aero[3].getListaCompañia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Lucas", "987654F", "Holandesa"));
	    aero[3].getListaCompañia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Emma", "543210E", "Holandesa"));
	    aero[3].getListaCompañia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Sophie", "246813D", "Holandesa"));
	    aero[3].getListaCompañia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Noah", "135792C", "Holandesa"));
	    aero[3].getListaCompañia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Liam", "123456B", "Holandesa"));
	    
	    // ... Repite el proceso para el Aeropuerto 4 ...
	}


}
