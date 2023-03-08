package javabeans;

import java.util.Objects;

public class Departamentos {

	private String nombre;
	private String direccion;
	private int idDepar;
	
	
	public Departamentos() {
		super();
	}

	

	public Departamentos(String nombre, String direccion, int idDepar) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.idDepar = idDepar;
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


	public int getIdDepar() {
		return idDepar;
	}


	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idDepar);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamentos other = (Departamentos) obj;
		return idDepar == other.idDepar;
	}


	@Override
	public String toString() {
		return "Departamentos [nombre=" + nombre + ", direccion=" + direccion + ", idDepar=" + idDepar + "]";
	}
	
	
}
