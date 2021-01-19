package cl.awakelab.model;

public class Contacto {
	private int id_contacto; 	
	private String nombre; 		
	private String email; 		
	private String fono; 		
	private String asunto; 		
	private String comentario; 
	
	public Contacto() {}

	public Contacto(int id_contacto, String nombre, String email, String fono, String asunto, String comentario) {
		super();
		this.id_contacto = id_contacto;
		this.nombre = nombre;
		this.email = email;
		this.fono = fono;
		this.asunto = asunto;
		this.comentario = comentario;
	}

	/**
	 * @return the id_contacto
	 */
	public int getId_contacto() {
		return id_contacto;
	}

	/**
	 * @param id_contacto the id_contacto to set
	 */
	public void setId_contacto(int id_contacto) {
		this.id_contacto = id_contacto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the fono
	 */
	public String getFono() {
		return fono;
	}

	/**
	 * @param fono the fono to set
	 */
	public void setFono(String fono) {
		this.fono = fono;
	}

	/**
	 * @return the asunto
	 */
	public String getAsunto() {
		return asunto;
	}

	/**
	 * @param asunto the asunto to set
	 */
	public void setAsunto(String asunto) {
		this.asunto = asunto;
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
		return "Contacto [id_contacto=" + id_contacto + ", nombre=" + nombre + ", email=" + email + ", fono=" + fono
				+ ", asunto=" + asunto + ", comentario=" + comentario + "]";
	}
}
