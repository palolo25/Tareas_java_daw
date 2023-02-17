package Clases;

public class Administrativo extends Persona{
	
	private String tareas;

	
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	

	public Administrativo(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}

	


	@Override
	public String toString() {
		return "Administrativo[ getNif()=" + getNif() + ", getNombre()=" + getNombre()
		+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "] Tareas: " + tareas;
	}

	


	public String getTareas() {
		return tareas;
	}



	public void setTareas(String tareas) {
		this.tareas = tareas;
	}



	@Override
	public void trabajar() {
		System.out.println("El administrativo "+getNombre()+" va a realizar estas tareas: "+getTareas());
		
	}
	
	public String gestionarMatricula() {
		return "El administrativo "+getNombre()+" va a gestionar una matrícula";
	}
	

}
