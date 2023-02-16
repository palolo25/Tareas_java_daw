
public class CuentaBancaria {
	/*
	 * atributos privados del objeto / instancia
	 */
	private int idCuenta;
	private String tipoCuenta, nombre, apellidos;
	private char genero;
	private double saldo;
	
	
	/*
	 * constructores
	 */
	
	public CuentaBancaria(int idCuenta, String tipoCuenta, String nombre, String apellidos, char genero, double saldo) {
		super();
		this.idCuenta = idCuenta;
		this.tipoCuenta = tipoCuenta;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.saldo = saldo;
	}


	public CuentaBancaria() {
		
	}
	
	
	/*
	 * getter and setter
	 */
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*
	 * metodos de los atributos de la clase
	 */
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}
	
	public void extraer(double cantidad) {
		saldo -= cantidad;
	}
	
	public String literalGenero() {
		if (genero == 'H')
			return "Hombre";
		else
			return "Mujer";
	}
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	
	
	
	
	
	
	
	
	
	

}
