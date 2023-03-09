package testing;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;
import javabeans.Clientes;

public class TestingClientes {

	public static void main(String[] args) {
		
		
		ClienteDao cdao = new ClienteDaoImplMy8();
		Clientes cliente = new Clientes("C11111111", "Pablo", "Segura", "Suiza", 130000, 930);
		cliente.setNombre("Hugo");
		System.out.println(cdao.modificarCliente(cliente));
		System.out.println("\nBuscar todos");
		System.out.println(cdao.buscarTodos());
		
		System.out.println("\nBuscar uno");
		System.out.println(cdao.buscarUno("A22222222"));
		System.out.println(cdao.buscarUno("B33333333"));
		System.out.println("\nAlta cliente");
		//System.out.println(cdao.altaCliente(cliente));
		System.out.println("\nBaja cliente");
		//System.out.println(cdao.eliminarCliente("C11111111"));
		System.out.println("\nModificar cliente");
		cliente.setNombre("Hugo");
		System.out.println(cdao.modificarCliente(cliente));
	}

}
