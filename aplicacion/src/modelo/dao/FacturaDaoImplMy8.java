package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Clientes;

public class FacturaDaoImplMy8 implements FacturaDao {

	private Connection conn;
	private PreparedStatement ps; 
	private ResultSet rs;
	private String sql;
	
	public FacturaDaoImplMy8() {
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/casaPrueba?serverTimezone=UTC" , "root" , "Pablo6364");
			System.out.println("Conectado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No conectado :(");
			e.printStackTrace();
		}
	}

	@Override
	public List<Clientes> buscarTodas() {
		 
		 sql = "select * from facturas";
		    List<Clientes> lista = new ArrayList<>();
		try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					Clientes factura = new Clientes();
					factura.setIdfactura(rs.getString("id_factura"));
					factura.setDescripcion(rs.getString("descripcion"));
					factura.setIdproyecto(rs.getString("id_proyecto"));
					
					lista.add(factura);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return lista;
	}

	@Override
	public Clientes buscarUna(String idFactura) {
		sql = "select * from facturas where is_factura = ?";
		Clientes factura = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, factura.getIdfactura());
			rs = ps.executeQuery();
			if(rs.next()) {
				factura = new Clientes();
				factura.setIdfactura(rs.getString("id_factura"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
