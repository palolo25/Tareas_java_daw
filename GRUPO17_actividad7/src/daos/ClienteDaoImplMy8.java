package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javabeans.Clientes;



public class ClienteDaoImplMy8 implements ClienteDao {

	
	private Connection conn;
	private PreparedStatement ps; 
	private ResultSet rs;
	private String sql;
	
	public ClienteDaoImplMy8() {
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
	public List<Clientes> buscarTodos() {
		 sql = "select * from clientes";
		    List<Clientes> lista = new ArrayList<>();
		try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					Clientes clientes = new Clientes();
					clientes.setCif(rs.getString("cif"));
					clientes.setNombre(rs.getString("nombre"));
					clientes.setApellidos(rs.getString("apellidos"));
					clientes.setDomicilio(rs.getString("domicilio"));
					clientes.setFacturacionAnual(rs.getFloat("facturacion_anual"));
					clientes.setNumeroEmpleados(rs.getInt("numero_empleados"));
					lista.add(clientes);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return lista;
	}

	@Override
	public Clientes buscarUno(String cif) {
		
		sql = "select * from clientes where cif = ?";
		Clientes clientes = null;
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, cif);
				rs = ps.executeQuery();
				if(rs.next()) {
					clientes = new Clientes();
					clientes.setCif(rs.getString("cif"));
					clientes.setNombre(rs.getString("nombre"));
					clientes.setApellidos(rs.getString("apellidos"));
					clientes.setDomicilio(rs.getString("domicilio"));
					clientes.setFacturacionAnual(rs.getDouble("facturacion_anual"));
					clientes.setNumeroEmpleados(rs.getInt("numero_empleados"));
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return clientes;
		}



	@Override
	public int altaCliente(Clientes clientes) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int eliminarCliente(Clientes clientes) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int modificarCliente(Clientes clientes) {
		// TODO Auto-generated method stub
		return 0;
	}
}