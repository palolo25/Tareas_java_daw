package testing;



import daos.EmpleadoDao;
import daos.EmpleadoDaoImplMy8;

public class TestingEmpleados {

	public static void main(String[] args) {
		
		EmpleadoDao edao = new EmpleadoDaoImplMy8();
		
		System.out.println(edao.buscarTodos());

	}

}
