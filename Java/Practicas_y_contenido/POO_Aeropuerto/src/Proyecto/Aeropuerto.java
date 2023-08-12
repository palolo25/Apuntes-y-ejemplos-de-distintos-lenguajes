package Proyecto;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	private String pais;
	private Compañia listaCompañia[] = new Compañia[10];
	private int numCompañia;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompañia = 0;
		
	}
	
	public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		listaCompañia = c;
		this.numCompañia = c.length;
		
	}
	
	public void insertarCompañia(Compañia compañia) {
		listaCompañia[numCompañia] = compañia;
		numCompañia++;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public Compañia[] getListaCompañia() {
		return listaCompañia;
	}

	public int getNumCompañia() {
		return numCompañia;
	}
	
	public Compañia getCompañia(int i) {
		return listaCompañia[i];
		
	}
	
	public Compañia getCompañia(String nombre) {
		boolean encontrado = false;
		int i = 0;
		Compañia c = null;
		while((!encontrado)&&(i<listaCompañia.length)) {
			if(nombre.equals(listaCompañia[i].getNombre())) {
				encontrado = true;
				c = listaCompañia[i];
			}
			i++;
		}
		return c;
	}
	
	
	
}
