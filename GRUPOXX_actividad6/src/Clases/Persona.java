package Clases;

public abstract class Persona {

	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;


	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	
	public Persona() {
		super();
	}

	

	public abstract String toString();


	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String llamar(Persona p) {
		return "Alicia Torres llamando a Carlos Robles";
	}

	public abstract void trabajar();
	
}
