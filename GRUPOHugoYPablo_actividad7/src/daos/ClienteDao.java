package daos;

import java.util.List;

import javabeans.Clientes;

public interface ClienteDao {

	boolean altaCliente(Clientes clientes);
	boolean eliminarCliente(Clientes clientes);
	boolean modificarCliente(Clientes clientes);
	List<Clientes> buscarTodos();
	Clientes buscarUno(String cif);
	
}
