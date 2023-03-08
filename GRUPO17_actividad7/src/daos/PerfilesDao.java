package daos;

import java.util.List;

import javabeans.Perfiles;

public interface PerfilesDao {

	int altaPerfiles(Perfiles perfiles);
	int eliminarPerfiles(int perfiles);
	int modificarPerfiles(Perfiles perfiles);
	List<Perfiles> buscarTodos();
	Perfiles buscarUno(int idPerfil);
}
