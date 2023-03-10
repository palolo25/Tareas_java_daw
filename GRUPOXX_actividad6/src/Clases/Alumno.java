package Clases;

public class Alumno extends Persona {

	private String curso;

	
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public Alumno(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}

	@Override
	public String toString() {
		return "Alumno[ getNif()=" + getNif() + ", getNombre()=" + getNombre()
		+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "] Cursando: " + curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void trabajar() {
		System.out.println("El alumno"+getNombre()+"va a estudiar para el curso "+getCurso());
		
	}
	
	public String hacerExamen() {
		return "El alumno "+getNombre()+" va a hacer su examen";
	}
}
