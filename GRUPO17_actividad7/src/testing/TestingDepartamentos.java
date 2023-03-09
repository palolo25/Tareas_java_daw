package testing;

import daos.DepartamentoDao;
import daos.DepartamentoDaoImplMy8;
import javabeans.Departamentos;

public abstract class TestingDepartamentos {

	public static void main(String[] args) {
		
		DepartamentoDao dDao = new DepartamentoDaoImplMy8();
		Departamentos depart = new Departamentos("Seguridad", "Barcelona", 50);
		Departamentos deparmod = dDao.buscarUno(30);
		deparmod.setDireccion("Cordoba");
		System.out.println("\nBuscar todos");
		System.out.println(dDao.buscarTodos());
		System.out.println("\n");
		System.out.println("\nBuscar uno");
		System.out.println(dDao.buscarUno(10));
		System.out.println(dDao.buscarUno(20));
		System.out.println(dDao.buscarUno(30));
		System.out.println(dDao.buscarUno(40));
		System.out.println("\nAlta departamento");
		//System.out.println(dDao.altadepartamento(depart));
		System.out.println("\nBaja departamento");
		//System.out.println(dDao.eliminardepartamento(50));
		System.out.println("\nModificar departamento");
		System.out.println(dDao.modificardepartamento(depart));
	}

}
