package cl.awakelab.interfaces;

import java.util.List;

import cl.awakelab.model.Contacto;

public interface IContactoDAO {
	public void createContacto(Contacto con);
	public List<Contacto> readAll();
}
