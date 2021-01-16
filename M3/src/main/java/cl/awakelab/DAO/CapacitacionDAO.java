package cl.awakelab.DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.interfaces.ICapacitacionDAO;
import cl.awakelab.model.Capacitacion;
import cl.awakelab.conexion.Conexion;

public class CapacitacionDAO implements ICapacitacionDAO  {

	@Override
	public void createCapacitacion(Capacitacion capa){

		String sql = "insert into creacapacitacion (id_capa,nombreapellido,lugar,email,duracion,comentario ) values (" + 
				capa.getId_capa() + ", '" +capa.getNombreapellido() + "', '" + capa.getLugar() + "', '" + capa.getEmail() + "', '" + capa.getDuracion() + "', '" + capa.getComentario() + "')";
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método createUsuario");
			e.printStackTrace();
		}
	}

	@Override
	public List<Capacitacion> readAll() {

		List<Capacitacion> lista = new ArrayList<Capacitacion>();
		
		String sql = "select id_capa,nombreapellido,lugar,email,duracion,comentario  from creacapacitacion";
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			System.out.println("Connection c " + cn);
			
			Statement s = cn.createStatement();
			System.out.println("Statement s " + s);
			
			ResultSet rs = s.executeQuery(sql);
			System.out.println("rs " + rs);
			
			while (rs.next()) {
				lista.add(new Capacitacion(rs.getInt("id_capa"), rs.getString("nombreapellido"), rs.getString("lugar"), 
						rs.getString("email"), rs.getString("duracion"),rs.getString("comentario")));
			}
			
			s.close();
			
			
		} catch (SQLException e) {
			System.out.println("Error en metodo readAll");
			e.printStackTrace();
		}
				
		return lista;
	}

	@Override
	public void updateCapacitacion(Capacitacion capa){
		
		String sql = "update creacapacitacion set id_capa ='" + capa.getId_capa() + "', nombreapellido = '" +capa.getNombreapellido() +"', lugar ='"+capa.getLugar()+"'"
				+ ",email = '"+capa.getEmail()+"', duracion ='"+capa.getDuracion()+"', comentario ='"+capa.getComentario()+"' where id_capa = " + capa.getId_capa();
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método updateUsuario");
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCapacitacion(int id) {
		
		String sql = "delete from creacapacitacion where id_capa =" + id; 
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);
			
			s.close();
			//cn.close();
			
		} catch (SQLException e) {
			System.out.println("Error en método updateUsuario");
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public Capacitacion readOne(int id){
		
		Capacitacion capa = null;
		
		try {
			
			//establecemos conexión con objeto Singleton
			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();
			String sql = "select id_capa,nombreapellido,lugar,email,duracion,comentario  from creacapacitacion where id_capa=" + id;
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				//creo una instancia de cliente, le paso los datos del resultset, y lo agrego a la lista.
				capa = new Capacitacion(rs.getInt("id_capa"), rs.getString("nombreapellido"), rs.getString("lugar"), 
						rs.getString("email"), rs.getString("duracion"),rs.getString("comentario"));
			}
			
			s.close();
			//c.close();
						
		} catch (SQLException e) {
			System.out.println("Error en método readOne");
			e.printStackTrace();
		}
		
		return capa;
		
		
	}
}
