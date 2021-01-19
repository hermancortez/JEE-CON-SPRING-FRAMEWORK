package cl.awakelab.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cl.awakelab.conexion.Conexion;
import cl.awakelab.interfaces.IUsuarioDAO;
import cl.awakelab.model.Usuario;


public class UsuarioDAO  implements IUsuarioDAO {
	@Override
	public String loginUsuario(Usuario u) {
		String mensaje = "";
		Usuario usu = null;
		String sql = "select usuario,clave from usuarios where usuario =" + u.getUsuario(); 
				
		
		System.out.println(sql);
		
		try {
			
			Connection cn = Conexion.getConnection();
			Statement s = cn.createStatement();
			
			s.execute(sql);			
			s.close();
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				
				if(rs.getString("usuario").isEmpty()) {
					mensaje = "El usuario no existe";
				}else if(rs.getString("usuario") == u.getUsuario() && rs.getString("contrasena") == u.getContrasena()  ) {
					mensaje = "ok";
				}else if(rs.getString("usuario") == u.getUsuario() && rs.getString("contrasena") != u.getContrasena()  ) {
					mensaje = "Contrasena no valida";
				}
				
				usu = new Usuario(rs.getString("usuario"),rs.getString("contrasena"));
			}
			
		} catch (SQLException e) {
			System.out.println("Error en método createUsuario");
			e.printStackTrace();
		}
		
		return mensaje;
	}
}
