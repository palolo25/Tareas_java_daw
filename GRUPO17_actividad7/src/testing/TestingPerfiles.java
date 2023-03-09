package testing;

import daos.PerfilesDao;
import daos.PerfilesDaoImplMy8;
import javabeans.Perfiles;

public class TestingPerfiles {

	public static void main(String[] args) {
		
		PerfilesDao pDao = new PerfilesDaoImplMy8();
		Perfiles perfil1 = new Perfiles(5, "Controlador stock");
		Perfiles perfil = pDao.buscarUno(4);
		System.out.println("\nBuscar todos");
		System.out.println(pDao.buscarTodos());
		System.out.println("\n");
		System.out.println("\nBuscar uno");
		System.out.println(pDao.buscarUno(1));
		System.out.println(pDao.buscarUno(2));
		System.out.println(pDao.buscarUno(3));
		System.out.println(pDao.buscarUno(4));
		System.out.println("\n");
		System.out.println("\nDar de alta");
		//System.out.println(pDao.altaPerfiles(perfil1));
		System.out.println("\nDar de bajas");
		//System.out.println(pDao.eliminarPerfiles(5));

		System.out.println("\nModificar");
		perfil.setNombre("Controlador");
		
		System.out.println(pDao.modificarPerfiles(perfil));
	}

}
