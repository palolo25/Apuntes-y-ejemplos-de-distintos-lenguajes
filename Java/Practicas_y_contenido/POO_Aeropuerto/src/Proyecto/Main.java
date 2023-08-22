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
	    aero[0] = new AeropuertoPublico("Barajas", "Madrid", "Espa�a", 82000000);

	    Compa�ia compa�ia1 = new Compa�ia("Emirates");
	    Compa�ia compa�ia2 = new Compa�ia("Ryaner");
	    Compa�ia compa�ia3 = new Compa�ia("AirSpain");

	    compa�ia1.insertarVuelo(new Vuelo("IB20", "Madrid", "Mexico", 152, 230));
	    compa�ia1.getVuelo("IB20").insertarPasajero(new Pasajero("Pepe", "123456G", "Inglesa"));
	    compa�ia1.getVuelo("IB20").insertarPasajero(new Pasajero("Luis", "654321F", "Espa�ola"));
	    compa�ia1.getVuelo("IB20").insertarPasajero(new Pasajero("Laura", "987654Z", "Mexicana"));
	    compa�ia1.getVuelo("IB20").insertarPasajero(new Pasajero("Emily", "543210Y", "Canadiense"));
	    compa�ia1.getVuelo("IB20").insertarPasajero(new Pasajero("Miguel", "135792X", "Espa�ola"));

	    compa�ia2.insertarVuelo(new Vuelo("IC20", "Madrid", "Barcelona", 52, 120));
	    compa�ia2.getVuelo("IC20").insertarPasajero(new Pasajero("Juan", "123456F", "Inglesa"));
	    compa�ia2.getVuelo("IC20").insertarPasajero(new Pasajero("Elena", "654321E", "Espa�ola"));
	    compa�ia2.getVuelo("IC20").insertarPasajero(new Pasajero("Sof�a", "987654D", "Italiana"));
	    compa�ia2.getVuelo("IC20").insertarPasajero(new Pasajero("Liam", "246813C", "Estadounidense"));
	    compa�ia2.getVuelo("IC20").insertarPasajero(new Pasajero("Emma", "135792B", "Inglesa"));

	    compa�ia3.insertarVuelo(new Vuelo("ID20", "Madrid", "Londres", 352, 200));
	    compa�ia3.getVuelo("ID20").insertarPasajero(new Pasajero("Ana", "987654H", "Alemana"));
	    compa�ia3.getVuelo("ID20").insertarPasajero(new Pasajero("Carlos", "543210I", "Espa�ola"));
	    compa�ia3.getVuelo("ID20").insertarPasajero(new Pasajero("Sophia", "246813J", "Alemana"));
	    compa�ia3.getVuelo("ID20").insertarPasajero(new Pasajero("Lucas", "135792K", "Holandesa"));
	    compa�ia3.getVuelo("ID20").insertarPasajero(new Pasajero("Olivia", "123456L", "Francesa"));

	    aero[0].insertarCompa�ia(compa�ia1);
	    aero[0].insertarCompa�ia(compa�ia2);
	    aero[0].insertarCompa�ia(compa�ia3);

	    // Aeropuerto 2
	    aero[1] = new AeropuertoPrivado("JFK", "Nueva York", "Estados Unidos");

	    Compa�ia compa�ia4 = new Compa�ia("Company X");
	    Compa�ia compa�ia5 = new Compa�ia("Company Y");
	    Compa�ia compa�ia6 = new Compa�ia("Company Z");

	    compa�ia4.insertarVuelo(new Vuelo("JF100", "Nueva York", "Los �ngeles", 200, 180));
	    compa�ia4.getVuelo("JF100").insertarPasajero(new Pasajero("Michael", "987654Z", "Estadounidense"));
	    compa�ia4.getVuelo("JF100").insertarPasajero(new Pasajero("Emily", "543210Y", "Canadiense"));
	    compa�ia4.getVuelo("JF100").insertarPasajero(new Pasajero("Oliver", "246813X", "Estadounidense"));
	    compa�ia4.getVuelo("JF100").insertarPasajero(new Pasajero("Sophia", "135792W", "Estadounidense"));
	    compa�ia4.getVuelo("JF100").insertarPasajero(new Pasajero("Liam", "123456V", "Estadounidense"));

	    compa�ia5.insertarVuelo(new Vuelo("JF200", "Nueva York", "Miami", 150, 150));
	    compa�ia5.getVuelo("JF200").insertarPasajero(new Pasajero("Anna", "987654U", "Alemana"));
	    compa�ia5.getVuelo("JF200").insertarPasajero(new Pasajero("David", "543210T", "Estadounidense"));
	    compa�ia5.getVuelo("JF200").insertarPasajero(new Pasajero("Emma", "246813S", "Inglesa"));
	    compa�ia5.getVuelo("JF200").insertarPasajero(new Pasajero("Olivia", "135792R", "Estadounidense"));
	    compa�ia5.getVuelo("JF200").insertarPasajero(new Pasajero("Noah", "123456Q", "Estadounidense"));

	    compa�ia6.insertarVuelo(new Vuelo("JF300", "Nueva York", "Chicago", 180, 170));
	    compa�ia6.getVuelo("JF300").insertarPasajero(new Pasajero("Sophie", "987654P", "Inglesa"));
	    compa�ia6.getVuelo("JF300").insertarPasajero(new Pasajero("Lucas", "543210O", "Holandesa"));
	    compa�ia6.getVuelo("JF300").insertarPasajero(new Pasajero("Isabella", "246813N", "Estadounidense"));
	    compa�ia6.getVuelo("JF300").insertarPasajero(new Pasajero("Ethan", "135792M", "Estadounidense"));
	    compa�ia6.getVuelo("JF300").insertarPasajero(new Pasajero("Ava", "123456L", "Estadounidense"));

	    aero[1].insertarCompa�ia(compa�ia4);
	    aero[1].insertarCompa�ia(compa�ia5);
	    aero[1].insertarCompa�ia(compa�ia6);

	    // Aeropuerto 3
	    aero[2] = new AeropuertoPublico("Heathrow", "Londres", "Reino Unido", 50000000);

	    Compa�ia compa�ia7 = new Compa�ia("British Airways");
	    Compa�ia compa�ia8 = new Compa�ia("EasyJet");
	    Compa�ia compa�ia9 = new Compa�ia("Lufthansa");

	    compa�ia7.insertarVuelo(new Vuelo("LH100", "Londres", "Berl�n", 120, 150));
	    compa�ia7.getVuelo("LH100").insertarPasajero(new Pasajero("William", "987654K", "Brit�nico"));
	    compa�ia7.getVuelo("LH100").insertarPasajero(new Pasajero("Mia", "543210J", "Brit�nico"));
	    compa�ia7.getVuelo("LH100").insertarPasajero(new Pasajero("James", "246813I", "Brit�nico"));
	    compa�ia7.getVuelo("LH100").insertarPasajero(new Pasajero("Sophia", "135792H", "Brit�nico"));
	    compa�ia7.getVuelo("LH100").insertarPasajero(new Pasajero("Oliver", "123456G", "Brit�nico"));

	    compa�ia8.insertarVuelo(new Vuelo("EJ200", "Londres", "Par�s", 100, 180));
	    compa�ia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Noah", "987654F", "Francesa"));
	    compa�ia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Emma", "654321E", "Inglesa"));
	    compa�ia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Olivia", "987654D", "Francesa"));
	    compa�ia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Liam", "543210C", "Irlandesa"));
	    compa�ia8.getVuelo("EJ200").insertarPasajero(new Pasajero("Sophia", "135792B", "Inglesa"));

	    compa�ia9.insertarVuelo(new Vuelo("LH300", "Londres", "M�nich", 150, 200));
	    compa�ia9.getVuelo("LH300").insertarPasajero(new Pasajero("Lucas", "987654A", "Alem�n"));
	    compa�ia9.getVuelo("LH300").insertarPasajero(new Pasajero("Sophie", "654321B", "Alem�n"));
	    compa�ia9.getVuelo("LH300").insertarPasajero(new Pasajero("Noah", "987654C", "Alem�n"));
	    compa�ia9.getVuelo("LH300").insertarPasajero(new Pasajero("Emma", "543210D", "Inglesa"));
	    compa�ia9.getVuelo("LH300").insertarPasajero(new Pasajero("Oliver", "135792E", "Alem�n"));

	    aero[2].insertarCompa�ia(compa�ia7);
	    aero[2].insertarCompa�ia(compa�ia8);
	    aero[2].insertarCompa�ia(compa�ia9);

	    // Aeropuerto 4
	    aero[3] = new AeropuertoPrivado("Schiphol", "�msterdam", "Pa�ses Bajos");

	    

	    aero[3].getListaCompa�ia()[0].insertarVuelo(new Vuelo("AM100", "�msterdam", "Par�s", 80, 120));
	    aero[3].getListaCompa�ia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Lucas", "987654F", "Holandesa"));
	    aero[3].getListaCompa�ia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Emma", "543210E", "Holandesa"));
	    aero[3].getListaCompa�ia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Sophie", "246813D", "Holandesa"));
	    aero[3].getListaCompa�ia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Noah", "135792C", "Holandesa"));
	    aero[3].getListaCompa�ia()[0].getVuelo("AM100").insertarPasajero(new Pasajero("Liam", "123456B", "Holandesa"));
	    
	    // ... Repite el proceso para el Aeropuerto 4 ...
	}


}
