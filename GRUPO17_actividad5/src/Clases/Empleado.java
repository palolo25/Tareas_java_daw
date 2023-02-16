package Clases;

public class Empleado extends Departamento {


	private int idEmpleado;
	private int idDepartamento;
	private String nombre;
	private String apellido;
	private String email;
	private double salario;
	private double complemento;
	private char sexo;



	public Empleado(int idLocalidad, String direccion, String ciudad, String pais, int idDepar, String descripcion,
			String localidad, int idEmpleado, int idDepartamento, String nombre, String apellido, String email,
			double salario, double complemento, char sexo) {
		super(idLocalidad, direccion, ciudad, pais, idDepar, descripcion, localidad);
		this.idEmpleado = idEmpleado;
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.salario = salario;
		this.complemento = complemento;
		this.sexo = sexo;
	}
	
	
	
	public Empleado(int idLocalidad, String direccion, String ciudad, String pais, int idDepar, String descripcion,
			String localidad) {
		super(idLocalidad, direccion, ciudad, pais, idDepar, descripcion, localidad);
	}



	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComplemento() {
		return complemento;
	}
	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", idDepartamento=" + idDepartamento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", email=" + email + ", salario=" + salario + ", complemento="
				+ complemento + ", sexo=" + sexo + "]";
	}


	public double salarioBruto() {
		double salarioBruto = this.salario + this.complemento;
		return salarioBruto ;
	}

	public double salarioMensual(int meses ) {
		double salarioMensual = this.salario * meses;
		return salarioMensual;
	}

	public String literalSexo() {

		if(sexo == 'h'||sexo == 'H') {
			return "Hombre";
		}else if(sexo == 'm'||sexo == 'M') {
			return "Mujer";
		}else {
			return "Indefinido";
		}

	}
	public String obtenerEmail() {
		String obtenerEmail = nombre.charAt(0)+"."+apellido.toLowerCase()+"@gmail.com";
		return obtenerEmail;

	}

	public String nombreCompleto() {

		String nombreCompleto = nombre +" "+ apellido ;
		return nombreCompleto;

	}












}
