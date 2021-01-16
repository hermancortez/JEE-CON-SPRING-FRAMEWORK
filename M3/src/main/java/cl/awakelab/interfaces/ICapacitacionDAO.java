package cl.awakelab.interfaces;

import java.util.List;

import cl.awakelab.model.Capacitacion;

public interface ICapacitacionDAO {
	public void createCapacitacion(Capacitacion capa);
	public List<Capacitacion> readAll();	
	public void updateCapacitacion(Capacitacion u);
	public void deleteCapacitacion(int id);
	public Capacitacion readOne(int id);
}
