package daos;

import java.util.List;

import javabeans.Departamentos;



public interface DepartamentoDao {

	boolean altaCliente(Departamentos departamentos);
	boolean eliminarCliente(Departamentos departamentos);
	boolean modificarCliente(Departamentos departamentos);
	List<Departamentos> buscarTodos();
	Departamentos buscarUno(int idDepar);
}
