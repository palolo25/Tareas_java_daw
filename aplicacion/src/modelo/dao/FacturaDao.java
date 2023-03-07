package modelo.dao;

import java.util.List;

import modelo.javabeans.Clientes;

public interface FacturaDao {

	
	List<Clientes> buscarTodas();
	Clientes buscarUna(String idFactura);
	
	
}
