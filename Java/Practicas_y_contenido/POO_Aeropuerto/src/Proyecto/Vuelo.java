package Proyecto;

public class Vuelo {

    private String identificador;
    private String ciudadOrigen;
    private String ciusdadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciusdadDestino, double precio, int numMaxPasajeros) {
        super();
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciusdadDestino = ciusdadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros];

    }

    public void insertarPasajero(Pasajero pasajero) {

        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiusdadDestino() {
        return ciusdadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    public Pasajero getPsajero(int i) {
        return listaPasajeros[i];
    }

    public Pasajero getPasajero(String pasaporte) {
        boolean encontrado = false;
        int i = 0;
        Pasajero pas = null;

        while ((encontrado == false) && (i < listaPasajeros.length)) {
            if (pasaporte.equals(listaPasajeros[i].getPasaporte())) {
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;
    }




}
