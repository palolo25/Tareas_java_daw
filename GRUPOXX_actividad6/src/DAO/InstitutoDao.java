package DAO;
import java.util.ArrayList;
import Clases.*;
import Clases.Persona;

public interface InstitutoDao {

	boolean altaPersona(Persona persona);
	Persona buscarPersona(String nif);
	ArrayList<Persona> buscartodas();
	boolean eliminarPersona(Persona persona);
	ArrayList<Persona> buscarPersonasPorTipo(String tipoPersona);
	
}
