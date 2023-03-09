package daos;

import java.util.List;

import javabeans.Clientes;

public interface ClienteDao {

    int altaCliente(Clientes clientes);
	int eliminarCliente(String clientes);
	int modificarCliente(Clientes clientes);
	List<Clientes> buscarTodos();
	Clientes buscarUno(String cif);
	
}
