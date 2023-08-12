package Proyecto;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	private String pais;
	private Compa�ia listaCompa�ia[] = new Compa�ia[10];
	private int numCompa�ia;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompa�ia = 0;
		
	}
	
	public Aeropuerto(String nombre, String ciudad, String pais, Compa�ia c[]) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		listaCompa�ia = c;
		this.numCompa�ia = c.length;
		
	}
	
	public void insertarCompa�ia(Compa�ia compa�ia) {
		listaCompa�ia[numCompa�ia] = compa�ia;
		numCompa�ia++;
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

	public Compa�ia[] getListaCompa�ia() {
		return listaCompa�ia;
	}

	public int getNumCompa�ia() {
		return numCompa�ia;
	}
	
	public Compa�ia getCompa�ia(int i) {
		return listaCompa�ia[i];
		
	}
	
	public Compa�ia getCompa�ia(String nombre) {
		boolean encontrado = false;
		int i = 0;
		Compa�ia c = null;
		while((!encontrado)&&(i<listaCompa�ia.length)) {
			if(nombre.equals(listaCompa�ia[i].getNombre())) {
				encontrado = true;
				c = listaCompa�ia[i];
			}
			i++;
		}
		return c;
	}
	
	
	
}
