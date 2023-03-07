package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Clientes;
import javabeans.Departamentos;

public class DepartamentoDaoImplMy8 implements DepartamentoDao {

	private Connection conn;
	private PreparedStatement ps; 
	private ResultSet rs;
	private String sql;
	
	public DepartamentoDaoImplMy8() {
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
	public boolean altaCliente(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCliente(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarCliente(Departamentos departamentos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Departamentos> buscarTodos() {
		 sql = "select * from departamentos";
		    List<Departamentos> listadepar = new ArrayList<>();
		try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					Departamentos departamentos = new Departamentos();
					departamentos.setIdDepar(rs.getInt("Id_depar"));
					departamentos.setNombre(rs.getString("nombre"));
					departamentos.setDireccion(rs.getString("direccion"));
					listadepar.add(departamentos);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return listadepar;
	}

	@Override
	public Departamentos buscarUno(int idDepar) {
		// TODO Auto-generated method stub
		return null;
	}

}
