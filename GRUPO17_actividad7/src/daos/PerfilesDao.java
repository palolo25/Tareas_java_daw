package daos;

import java.util.List;

import javabeans.Perfiles;

public interface PerfilesDao {

	int altaCliente(Perfiles perfiles);
	int eliminarCliente(Perfiles perfiles);
	int modificarCliente(Perfiles perfiles);
	List<Perfiles> buscarTodos();
	Perfiles buscarUno(int idPerfil);
}
