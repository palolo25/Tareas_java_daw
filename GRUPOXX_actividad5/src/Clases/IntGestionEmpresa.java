package Clases;

import java.util.ArrayList;

public interface IntGestionEmpresa {

	boolean altaEmpleado(Empleado empleado);
	boolean eliminarUno(Empleado empleado);
	boolean modificarUno(Empleado empleado);
	ArrayList<Empleado> buscarPorSexo(char sexo);
	Empleado buscarUno(int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	double masaSalarial();
	ArrayList<Empleado> buscarPorDepartamento(int idDepar);
	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);
}
