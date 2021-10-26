package es.curso.modelo.entidad;

public class Videojuego {

	private int id;
	private String nombre;
	private String compañia;
	private int notaMedia;
	private String creador;
	private String web;

	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compañia=" + compañia + ", notaMedia=" + notaMedia
				+ "]";
	}
	
}
