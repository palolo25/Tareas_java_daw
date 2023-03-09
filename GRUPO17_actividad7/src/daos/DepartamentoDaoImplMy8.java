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
	private int filas;
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
		
		sql = "select * from departamentos where id_depar = ?";
		Departamentos departamentos = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idDepar);
			rs = ps.executeQuery();
			if(rs.next()) {
			 departamentos = new Departamentos();
				
				departamentos.setIdDepar(rs.getInt(1));
				departamentos.setNombre(rs.getString("nombre"));
				departamentos.setDireccion(rs.getString("direccion"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  departamentos;
	}



	@Override
	public int altadepartamento(Departamentos departamentos) {
		sql = "insert into departamentos values(?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, departamentos.getIdDepar());
			ps.setString(2, departamentos.getNombre());
			ps.setString(3, departamentos.getDireccion());
			
			filas= ps.executeUpdate();
			filas = 1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}



	@Override
	public int eliminardepartamento(int departamentos) {
		sql = "delete from departamentos where id_depar = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, departamentos);
			
			filas= ps.executeUpdate();
			filas = 1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}



	@Override
	public int modificardepartamento(Departamentos departamentos) {
		sql = "update departamentos set id_depar = ?, " + "nombre = ?," + "direccion = ?"
	+ " where id_depar = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, departamentos.getIdDepar());
			ps.setString(2, departamentos.getNombre());
			ps.setString(3, departamentos.getDireccion());
			
			filas= ps.executeUpdate();
			filas = 1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

}
