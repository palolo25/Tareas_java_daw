package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import javabeans.Empleados;

public class EmpleadoDaoImplMy8 implements EmpleadoDao {

	private Connection conn;
	private PreparedStatement ps; 
	private ResultSet rs;
	private String sql;
	
	public EmpleadoDaoImplMy8() {
		
		try {
			 conn = DriverManager.getConnection("jdbc:mysql://127.0.1.1:3306/clientes_proyectos_empleados_2023?serverTimezone=UTC","root","Pablo6364");
			System.out.println("Conexion establecida");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Conexion NOOO establecida");
		}
		
	}

	@Override
	public double salarioBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double salarioMensual(int meses) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String literalSexo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nombreCompleto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> empleadosByDepartamento(int idDepar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> empleadosBySexo(char sexo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> EmpleadosByApellido(String subcadena) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double salarioTotal(int idDepar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean altaCliente(Empleados empleados) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCliente(Empleados empleados) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarCliente(Empleados empleados) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Empleados> buscarTodos() {
		sql = "select * from empleados";
	    List<Empleados> listaempl = new ArrayList<>();
	try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Empleados empleados = new Empleados();
				empleados.setIdEmpleado(rs.getInt("id_empl"));
				empleados.setNombre(rs.getString("nombre"));
				empleados.setApellido(rs.getString("apellidos"));
				empleados.setCorreo(rs.getString("email"));
				empleados.setPassword(rs.getString("password"));
				empleados.setSalario(rs.getDouble("salario"));
				empleados.setFechaIngreso(rs.getDate("fecha_ingreso"));
				empleados.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
				empleados.setIdPerfil(rs.getInt("id_perfil"));
				empleados.setIdDepar(rs.getInt("id_depar"));
				listaempl.add(empleados);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return listaempl;
	}

	@Override
	public Empleados buscarUno(int idEmpl) {
		// TODO Auto-generated method stub
		return null;
	}
}
