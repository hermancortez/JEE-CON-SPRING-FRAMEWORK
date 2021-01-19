package cl.awakelab.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.conexion.Conexion;
import cl.awakelab.interfaces.IContactoDAO;
import cl.awakelab.model.Contacto;



public class ContactoDAO implements IContactoDAO {

	@Override
	public void createContacto(Contacto con) {

		String sql = "insert into contacto (id_contacto, nombre, email, fono, asunto, comentario) values (" + 
				con.getId_contacto() + ", '" + con.getNombre() + "', '" + con.getEmail() + "', '" + con.getFono() + "', '" + con.getAsunto() + "' , '" + con.getComentario() + "')";
		
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
	public List<Contacto> readAll() {

		List<Contacto> lista = new ArrayList<Contacto>();
		
		String sql = "select id_contacto, nombre, email, fono, asunto, comentario from registrarusuario";
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			System.out.println("Connection c " + cn);
			
			Statement s = cn.createStatement();
			System.out.println("Statement s " + s);
			
			ResultSet rs = s.executeQuery(sql);
			System.out.println("rs " + rs);
			
			while (rs.next()) {
				lista.add(new Contacto(rs.getInt("id_contacto"),rs.getString("nombre"),rs.getString("email"),rs.getString("fono"),rs.getString("asunto"),rs.getString("comentario")));
			}

			s.close();
			
			
		} catch (SQLException e) {
			System.out.println("Error en metodo readAll");
			e.printStackTrace();
		}
				
		return lista;
	}

}
