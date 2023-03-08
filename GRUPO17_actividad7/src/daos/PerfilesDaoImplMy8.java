package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import javabeans.Perfiles;

public class PerfilesDaoImplMy8 implements PerfilesDao{

	private Connection conn;
	private PreparedStatement ps; 
	private ResultSet rs;
	private String sql;
	public PerfilesDaoImplMy8() {
		
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
	public int altaCliente(Perfiles perfiles) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int eliminarCliente(Perfiles perfiles) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int modificarCliente(Perfiles perfiles) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Perfiles> buscarTodos() {
		sql = "select * from perfiles";
	    List<Perfiles> listaperfil = new ArrayList<>();
	try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Perfiles perfil = new Perfiles();
				perfil.setIdPerfil(rs.getInt("id_perfil"));
				perfil.setNombre(rs.getString("nombre"));
				listaperfil.add(perfil);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return listaperfil;
	}
	@Override
	public Perfiles buscarUno(int idPerfil) {
		sql = "select * from perfiles where id_perfil = ?";
		Perfiles perfiles = null;
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idPerfil);
				rs = ps.executeQuery();
				if(rs.next()) {
					perfiles = new Perfiles();
					perfiles.setIdPerfil(rs.getInt("id_perfil"));
					perfiles.setNombre(rs.getString("nombre"));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return perfiles;
	}
}
