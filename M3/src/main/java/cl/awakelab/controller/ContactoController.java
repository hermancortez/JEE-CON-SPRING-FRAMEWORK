package cl.awakelab.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.DAO.CapacitacionDAO;
import cl.awakelab.DAO.ContactoDAO;
import cl.awakelab.model.Capacitacion;
import cl.awakelab.model.Contacto;

public class ContactoController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String ppal(Model model) {
		
		ContactoDAO cap = new ContactoDAO();			
		List<Contacto> lista = cap.readAll();			
		model.addAttribute("lista", lista);
		return "capacitacion";
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
