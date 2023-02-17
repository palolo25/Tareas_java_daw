package Clases;
public class Profesor extends Persona{

	private String competencias;

	
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	public Profesor(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}

	

	
	

	

	@Override
	public String toString() {
		return "Profesor[ getNif()=" + getNif() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "] Competencias: " + competencias;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	@Override
	public void trabajar() {
		
		System.out.println("El profesor "+getNombre()+" va a impartir su clase"); 
		
	}
	
	public String ponerNotas() {
		return "El profesor "+getNombre()+" va a corregir los exámenes";
		
	}
	
	
}
