package cl.awakelab.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.DAO.ContactoDAO;
import cl.awakelab.model.Contacto;

public class UsuarioController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String ppal(Model model) {
		
		ContactoDAO cap = new ContactoDAO();			
		List<Contacto> lista = cap.readAll();			
		model.addAttribute("lista", lista);
		return "Login";
	}
	
	@RequestMapping(value="/Caracteristicas", method=RequestMethod.GET)
	public String caracteristicas() {
		return "caracteristicas";
	}
	
	@RequestMapping(value="/Precios", method = RequestMethod.GET)
	public String precios() {
		return "precios";
	}
}
