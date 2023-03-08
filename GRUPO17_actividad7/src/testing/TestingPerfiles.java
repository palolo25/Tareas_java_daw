package testing;

import daos.PerfilesDao;
import daos.PerfilesDaoImplMy8;

public class TestingPerfiles {

	public static void main(String[] args) {
		
		PerfilesDao pDao = new PerfilesDaoImplMy8();
		
		System.out.println(pDao.buscarTodos());
		System.out.println("\n");
		System.out.println(pDao.buscarUno(1));
		System.out.println(pDao.buscarUno(2));
		System.out.println(pDao.buscarUno(3));
		System.out.println(pDao.buscarUno(4));

	}

}
