package testing;

import daos.ClienteDao;
import daos.ClienteDaoImplMy8;

public class TestingClientes {

	public static void main(String[] args) {
		
		
		ClienteDao cdao = new ClienteDaoImplMy8();
		
		System.out.println(cdao.buscarTodos());
		System.out.println("\n");
		System.out.println(cdao.buscarUno("A22222222"));
		System.out.println(cdao.buscarUno("B33333333"));
	}

}
