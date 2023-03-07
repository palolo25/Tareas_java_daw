package testing;

import daos.DepartamentoDao;
import daos.DepartamentoDaoImplMy8;

public abstract class TestingDepartamentos {

	public static void main(String[] args) {
		
		DepartamentoDao dDao = new DepartamentoDaoImplMy8();
		
		System.out.println(dDao.buscarTodos());

	}

}
