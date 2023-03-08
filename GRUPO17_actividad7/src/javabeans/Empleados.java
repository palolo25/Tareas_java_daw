package javabeans;

import java.sql.Date;
import java.util.Objects;

public class Empleados {

	private int idEmpleado;
	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	private double salario;
	private Date fechaIngreso;
	private Date fechaNacimiento;
	private char sexo;
	private int idPerfil;
	private int idDepar;
	
	
	
	public Empleados() {
		super();
	}
	
	

	public Empleados(int idEmpleado, String nombre, String apellido, String correo, String password, double salario,
			Date fechaIngreso, Date fechaNacimiento, char sexo, int idPerfil, int idDepar) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.idPerfil = idPerfil;
		this.idDepar = idDepar;
	}



	public double salarioMensual(int meses) {
		return salario / meses;
	}
	

	public int getIdEmpleado() {
		return idEmpleado;
	}



	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public Date getFechaIngreso() {
		return fechaIngreso;
	}



	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}



	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public int getIdDepar() {
		return idDepar;
	}

	public void setIdDepar(int idDepar) {
		this.idDepar = idDepar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return idEmpleado == other.idEmpleado;
	}

	@Override
	public String toString() {
		return "Empleados [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", correo="
				+ correo + ", password=" + password + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso
				+ ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", idPerfil=" + idPerfil + ", idDepar="
				+ idDepar + "]";
	}

	


	



	

	
}
