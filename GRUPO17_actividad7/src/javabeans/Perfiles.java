package javabeans;

import java.util.Objects;

public class Perfiles {

	private int idPerfil;
	private String nombre;
	
	
	
	public Perfiles() {
		super();
	}



	public int getIdPerfil() {
		return idPerfil;
	}



	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public int hashCode() {
		return Objects.hash(idPerfil);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfiles other = (Perfiles) obj;
		return idPerfil == other.idPerfil;
	}



	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
}
