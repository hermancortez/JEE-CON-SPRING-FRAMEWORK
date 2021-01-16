package cl.awakelab.model;

public class Capacitacion {
	private int id_capa; 			
	private String nombreapellido;
	private String lugar;
	private String email;			
	private String duracion; 		
	private String comentario;
	
	public Capacitacion() {}

	public Capacitacion(int id_capa, String nombreapellido, String lugar, String email, String duracion,
			String comentario) {
		super();
		this.id_capa = id_capa;
		this.nombreapellido = nombreapellido;
		this.lugar = lugar;
		this.email = email;
		this.duracion = duracion;
		this.comentario = comentario;
	}

	/**
	 * @return the id_capa
	 */
	public int getId_capa() {
		return id_capa;
	}

	/**
	 * @param id_capa the id_capa to set
	 */
	public void setId_capa(int id_capa) {
		this.id_capa = id_capa;
	}

	/**
	 * @return the nombreapellido
	 */
	public String getNombreapellido() {
		return nombreapellido;
	}

	/**
	 * @param nombreapellido the nombreapellido to set
	 */
	public void setNombreapellido(String nombreapellido) {
		this.nombreapellido = nombreapellido;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Capacitacion [id_capa=" + id_capa + ", nombreapellido=" + nombreapellido + ", lugar=" + lugar
				+ ", email=" + email + ", duracion=" + duracion + ", comentario=" + comentario + "]";
	}
	
}
