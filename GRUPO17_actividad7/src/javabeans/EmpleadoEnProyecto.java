package javabeans;

import java.sql.Date;
import java.util.Objects;

public class EmpleadoEnProyecto {

	private int numeroOrden;
	private String idProyecto;
	private int idEmpl;
	private int horasAsignadas;
	private Date fechaIncorporacion;
	
	
	public EmpleadoEnProyecto() {
		super();
	}


	public EmpleadoEnProyecto(int numeroOrden, String idProyecto, int idEmpl, int horasAsignadas,
			Date fechaIncorporacion) {
		super();
		this.numeroOrden = numeroOrden;
		this.idProyecto = idProyecto;
		this.idEmpl = idEmpl;
		this.horasAsignadas = horasAsignadas;
		this.fechaIncorporacion = fechaIncorporacion;
	}


	public int getNumeroOrden() {
		return numeroOrden;
	}


	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}


	public String getIdProyecto() {
		return idProyecto;
	}


	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}


	public int getIdEmpl() {
		return idEmpl;
	}


	public void setIdEmpl(int idEmpl) {
		this.idEmpl = idEmpl;
	}


	public int getHorasAsignadas() {
		return horasAsignadas;
	}


	public void setHorasAsignadas(int horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}


	public Date getFechaIncorporacion() {
		return fechaIncorporacion;
	}


	public void setFechaIncorporacion(Date fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(numeroOrden);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoEnProyecto other = (EmpleadoEnProyecto) obj;
		return numeroOrden == other.numeroOrden;
	}


	@Override
	public String toString() {
		return "EmpleadoEnProyecto [numeroOrden=" + numeroOrden + ", idProyecto=" + idProyecto + ", idEmpl=" + idEmpl
				+ ", horasAsignadas=" + horasAsignadas + ", fechaIncorporacion=" + fechaIncorporacion + "]";
	}
	
	
	
}
