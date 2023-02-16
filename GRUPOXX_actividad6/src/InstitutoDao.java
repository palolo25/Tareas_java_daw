import java.util.ArrayList;

public interface InstitutoDao {

	boolean altaPersona(Persona persona);
	Persona buscarPersona(String nif);
	ArrayList<Persona> buscartodas();
	boolean eliminarPersona(Persona persona);
	ArrayList<Persona> buscarPersonasPorTipo(String tipoPersona);
}
