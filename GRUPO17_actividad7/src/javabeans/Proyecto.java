package javabeans;

import java.sql.Date;
import java.util.Objects;

public class Proyecto {

	private int idProyecto;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFinPrevisto;
	private Date fechaFinReal;
	private double ventaPrevista;
	private double costePrevisto;
	private double costeReal;
	private String estado;
	private int jefeProyecto;
	private String cif;
	
	
	public Proyecto() {
		super();
	}


	public Proyecto(int idProyecto, String descripcion, Date fechaInicio, Date fechaFinPrevisto, Date fechaFinReal,
			double ventaPrevista, double costePrevisto, double costeReal, String estado, int jefeProyecto, String cif) {
		super();
		this.idProyecto = idProyecto;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinPrevisto = fechaFinPrevisto;
		this.fechaFinReal = fechaFinReal;
		this.ventaPrevista = ventaPrevista;
		this.costePrevisto = costePrevisto;
		this.costeReal = costeReal;
		this.estado = estado;
		this.jefeProyecto = jefeProyecto;
		this.cif = cif;
	}


	public int getIdProyecto() {
		return idProyecto;
	}


	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFinPrevisto() {
		return fechaFinPrevisto;
	}


	public void setFechaFinPrevisto(Date fechaFinPrevisto) {
		this.fechaFinPrevisto = fechaFinPrevisto;
	}


	public Date getFechaFinReal() {
		return fechaFinReal;
	}


	public void setFechaFinReal(Date fechaFinReal) {
		this.fechaFinReal = fechaFinReal;
	}


	public double getVentaPrevista() {
		return ventaPrevista;
	}


	public void setVentaPrevista(double ventaPrevista) {
		this.ventaPrevista = ventaPrevista;
	}


	public double getCostePrevisto() {
		return costePrevisto;
	}


	public void setCostePrevisto(double costePrevisto) {
		this.costePrevisto = costePrevisto;
	}


	public double getCosteReal() {
		return costeReal;
	}


	public void setCosteReal(double costeReal) {
		this.costeReal = costeReal;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getJefeProyecto() {
		return jefeProyecto;
	}


	public void setJefeProyecto(int jefeProyecto) {
		this.jefeProyecto = jefeProyecto;
	}


	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idProyecto);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proyecto other = (Proyecto) obj;
		return idProyecto == other.idProyecto;
	}


	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio
				+ ", fechaFinPrevisto=" + fechaFinPrevisto + ", fechaFinReal=" + fechaFinReal + ", ventaPrevista="
				+ ventaPrevista + ", costePrevisto=" + costePrevisto + ", costeReal=" + costeReal + ", estado=" + estado
				+ ", jefeProyecto=" + jefeProyecto + ", cif=" + cif + "]";
	}
	
	
	
	
}
