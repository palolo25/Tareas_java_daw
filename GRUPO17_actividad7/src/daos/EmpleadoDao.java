package daos;

import java.util.List;


import javabeans.Empleados;

public interface EmpleadoDao {

	boolean altaCliente(Empleados empleados);
	boolean eliminarCliente(Empleados empleados);
	boolean modificarCliente(Empleados empleados);
	List<Empleados> buscarTodos();
	Empleados  buscarUno(int idEmpl);
	
	
	  public double salarioBruto();
	  public double salarioMensual(int meses);
	  public String literalSexo();
	  public String obtenerEmail();
	  public String nombreCompleto();
	  List<Empleados> empleadosByDepartamento(int idDepar);
	  List<Empleados> empleadosBySexo(char sexo);
	  List<Empleados> EmpleadosByApellido(String subcadena);
	  double salarioTotal(int idDepar);
}
