package Clases;

public class Departamento extends Localidad {


	private int idDepar;
	private String descripcion;
	private String localidad;
	
	public Departamento(int idLocalidad, String direccion, String ciudad, String pais, int idDepar, String descripcion,
			String localidad) {
		super(idLocalidad, direccion, ciudad, pais);
		this.idDepar = idDepar;
		this.descripcion = descripcion;
		this.localidad = localidad;
	}

	public Departamento(int idLocalidad, String direccion, String ciudad, String pais) {
		super(idLocalidad, direccion, ciudad, pais);
	}

	@Override
	public String toString() {
		return "Departamento [idDepar=" + idDepar + ", descripcion=" + descripcion + ", localidad=" + localidad + "]";
	}

	public int getIdDepar() {
		return idDepar;
	}

	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
	
}
