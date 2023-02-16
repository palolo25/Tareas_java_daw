package Clases;

public class Empresa extends Empleado implements IntGestionEmpresa {

	private String nombreEmpresa;

	public Empresa(int idLocalidad, String direccion, String ciudad, String pais, int idDepar, String descripcion,
			String localidad, int idEmpleado, int idDepartamento, String nombre, String apellido, String email,
			double salario, double complemento, char sexo, String nombreEmpresa) {
		super(idLocalidad, direccion, ciudad, pais, idDepar, descripcion, localidad, idEmpleado, idDepartamento, nombre,
				apellido, email, salario, complemento, sexo);
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public boolean alta(Empleado Empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double masaSalarial() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
