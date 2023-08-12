package Proyecto;

public class AeropuertoPrivado extends Aeropuerto {

    private String listaempresas[] = new String[10];
    private int numEpresas;


    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);

    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais);
        this.listaempresas = e;
        numEpresas = e.length;

    }

    public void insertaEmpresas(String e[]) {
        this.listaempresas = e;
        this.numEpresas = e.length;

    }

    public void insertarEmpresa(String e) {
        listaempresas[numEpresas] = e;
        numEpresas++;

    }

    public String[] getListaempresas() {
        return listaempresas;
    }

    public int getNumEpresas() {
        return numEpresas;
    }


}
