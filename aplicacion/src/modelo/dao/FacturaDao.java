package modelo.dao;

import java.util.List;

import modelo.javabeans.Factura;

public interface FacturaDao {

	
	List<Factura> buscarTodas();
	Factura buscarUna(String idFactura);
	
	
}
