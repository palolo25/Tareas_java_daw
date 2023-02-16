package Clases;

public class TestingEmpleado {

	public static void main(String[] args) {
		
		 Localidad localidad = new Localidad(1, "direccion", "Madrid", "España");
	        Departamento departamento = new Departamento(1, "Descripcion", localidad);
	        Trabajo trabajo = new Trabajo("idtrabajo", "Descripcion", 0, 5000);
	        Empleado empleado = new Empleado(2, "Pepe", "perez", "pp@gmail.com", 3400, 500, 'H', trabajo, departamento);
	        Trabajo trabajoLeido = empleado.getTrabajo();
	        Departamento departamentoLeido = empleado.getDepartamento();
	        Localidad localidadLeida = departamentoLeido.getLocalidad();
	        
	        System.out.println(empleado.getIdEmpleado());
	        System.out.println(empleado.getNombre());
	        System.out.println(empleado.getApellido());
	        System.out.println(empleado.obtenerEmail());
	        System.out.println(empleado.getSalario());
	        System.out.println(empleado.getComplemento());
	        System.out.println(empleado.getSexo());
	        System.out.println(trabajoLeido.getIdTrabajo());
	        System.out.println(trabajoLeido.getDescripcion());
	        System.out.println(trabajoLeido.getMinSalario());
	        System.out.println(trabajoLeido.getMaxSalario());
	        System.out.println(departamentoLeido.getIdDepar());
	        System.out.println(departamentoLeido.getDescripcion());
	        System.out.println(localidadLeida.getDireccion());
	        System.out.println(localidadLeida.getCiudad());
	        System.out.println(localidadLeida.getPais());
	        
	}

}
