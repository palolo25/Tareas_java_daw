package Clases;

public class Localidad {

	private int idLocalidad;
	private String direccion;
	private String ciudad;
	private String pais;
	public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
		super();
		this.idLocalidad = idLocalidad;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	
	
	
	public Localidad() {
		super();
	}



	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}
	public int getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	
}
