package testing;

import daos.PerfilesDao;
import daos.PerfilesDaoImplMy8;
import javabeans.Perfiles;

public class TestingPerfiles {

	public static void main(String[] args) {
		
		PerfilesDao pDao = new PerfilesDaoImplMy8();
		Perfiles perfil = new Perfiles(5, "Controlador stock");
		
		System.out.println(pDao.buscarTodos());
		System.out.println("\n");
		System.out.println(pDao.buscarUno(1));
		System.out.println(pDao.buscarUno(2));
		System.out.println(pDao.buscarUno(3));
		System.out.println(pDao.buscarUno(4));
		System.out.println("\n");
		System.out.println("\nDar de alta");
		//System.out.println(pDao.altaPerfiles(perfil));
		System.out.println("\nDar de bajas");
		//System.out.println(pDao.eliminarPerfiles(5));

	}

}
