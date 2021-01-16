package cl.awakelab.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.DAO.CapacitacionDAO;
import cl.awakelab.model.Capacitacion;

@Controller
public class CapacitacionController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String ppal(Model model) {
		
		//armo lista de datos que voy a mostrar.
		//List<Capacitacion> lista = new ArrayList<Capacitacion>();
		
		//y la paso como atributo de model
		//model.addAttribute("lista", lista);		
		//return "index";
		
		CapacitacionDAO cap = new CapacitacionDAO();			
		List<Capacitacion> lista = cap.readAll();			
		model.addAttribute("lista", lista);
		return "capacitacion";
		
		//getServletContext().getRequestDispatcher("/capacitacion.jsp").forward(request, response);	
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
