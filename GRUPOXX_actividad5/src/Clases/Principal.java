package Clases;

public class Principal {

	public static void main(String[] args) {
		Empresa empresaNike = new Empresa("Nike");
		Localidad localidad = new Localidad(2, "c/garci n23", "Madrid", "España");
		Departamento departamento = new Departamento(2, "informatica", localidad);
		Trabajo trabajo = new Trabajo("2021D", "programador", 2300, 4000);
		Empleado empleado = new Empleado(9, "Juan", "perez", "", 3400, 500, 'h', trabajo, departamento);
		//Empleado2
		Localidad localidad2 = new Localidad(3, "Avenida de Italia n21", "Roma", "Italia");
		Departamento departamento2 = new Departamento(3, "Informatica", localidad2);
		Trabajo trabajo2 = new Trabajo("3409F", "Desarrollador", 1300, 4300);
		Empleado empleado2 = new Empleado(3, "Ana", "Gomez", "", 2100, 500, 'm', trabajo2, departamento2);
		//Empleado3
		Localidad localidad3 = new Localidad(4, "San juan 23", "Barcelona", "España");
		Departamento departamento3 = new Departamento(4, "Directivo", localidad3);
		Trabajo trabajo3 = new Trabajo("5050G", "Lider regional", 5000, 12000);
		Empleado empleado3 = new Empleado(12, "Antonio", "Asensio", "", 5000, 3500, 'h', trabajo3, departamento3);
		//Empleado4
		Localidad localidad4 = new Localidad(5, "Avenida de paris s/n", "Paris", "Francia");
		Departamento departamento4 = new Departamento(5, "Desarrollador", localidad4);
		Trabajo trabajo4 = new Trabajo("1245J", "Programador java", 2100, 7000);
		Empleado empleado4 = new Empleado(5, "Carlos", "Fernadez", "", 4500, 1200, 'H', trabajo4, departamento4);
		//Empleado5
		Localidad localidad5 = new Localidad(6, "C/ corre y vete n31", "Madrid", "España");
		Departamento departamento5 = new Departamento(6, "Informatica", localidad5);
		Trabajo trabajo5 = new Trabajo("6769T", "Programador python", 4300, 9500);
		Empleado empleado5 = new Empleado(6, "Carla", "Mendez", "", 6600, 1200, 'M', trabajo5, departamento5);

		System.out.println("ALTA EMPLEADO");

		System.out.println("Empleado dado de alta: "+empresaNike.altaEmpleado(empleado));
		System.out.println("Empleado dado de alta: "+empresaNike.altaEmpleado(empleado2));
		System.out.println("Empleado dado de alta: "+empresaNike.altaEmpleado(empleado3));
		
		
		System.out.println("\n");
		System.out.println("ELIMINAR EMPLEADO");
		System.out.println("Empleado dado de baja: "+ empresaNike.eliminarUno(empleado));
		System.out.println("Empleado dado de baja: "+ empresaNike.eliminarUno(empleado2));
		System.out.println("Empleado dado de baja: "+ empresaNike.eliminarUno(empleado3));
	


		
		System.out.println("\n");
		System.out.println("MODIFICAR EMPLEADO");
		System.out.println("Empleado modificado: " + empresaNike.modificarUno(empleado));
		System.out.println("Empleado modificado: " + empresaNike.modificarUno(empleado4));
		System.out.println("Empleado modificado: " + empresaNike.modificarUno(empleado5));



		System.out.println("\n");
		System.out.println("BUSQUEDA POR SEXO");
	
		System.out.println("Sexo de lempleado encontrado: " + empresaNike.buscarPorSexo('H'));
		System.out.println("Sexo de lempleado encontrado: " + empresaNike.buscarPorSexo('h'));
		System.out.println("Sexo de lempleado encontrado: " + empresaNike.buscarPorSexo('M'));
		System.out.println("Sexo de lempleado encontrado: " + empresaNike.buscarPorSexo('m'));




		
		System.out.println("\n");
		System.out.println("BUSCAR UN EMPLEADO");
		System.out.println("Busqueda de empleado: " + empresaNike.buscarUno(1));
		System.out.println("Busqueda de empleado: " + empresaNike.buscarUno(5));
		


	
		System.out.println("\n");
		System.out.println("BUSCAR TODOS LOS EMPLEADOS");
		System.out.println("Todos los empleados: " + empresaNike.buscarTodos());


		
		System.out.println("\n");
		System.out.println("MASA SALARIAL");
		System.out.println("Masa salarial de los empleados: " + empresaNike.masaSalarial());


		
		System.out.println("\n");
		System.out.println("BUSQUEDA POR DEPARTAMENTO");
		System.out.println("Busqueda por departamento: " + empresaNike.buscarPorDepartamento(5));
		System.out.println("Busqueda por departamento: " + empresaNike.buscarPorDepartamento(3));

		
		System.out.println("\n");
		System.out.println("BUSQUEDA POR TRABAJO");
		System.out.println("Buscar por trabajo: " + empleado2);
		System.out.println("Buscar por trabajo: " + empleado4);
		System.out.println("Buscar por trabajo: " + empleado3);



		
		System.out.println("\n");
		System.out.println("BUSQUEDA POR PAIS");
		System.out.println("Buscar por pais: " + empresaNike.buscarPorPais("España"));
		System.out.println("Buscar por pais: " + empresaNike.buscarPorPais("Francia"));
		



	
		
	}

}
