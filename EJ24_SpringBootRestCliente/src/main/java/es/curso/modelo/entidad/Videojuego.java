package es.curso.modelo.entidad;

import org.springframework.stereotype.Component;

@Component
public class Videojuego {

	private int id;
	private String nombre;
	private String compania;
	private int notaMedia;
	private int precio;

	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Videojuego(int id, String nombre, String compania, int notaMedia, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.compania = compania;
		this.notaMedia = notaMedia;
		this.precio=precio;
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
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compania=" + compania + ", notaMedia=" + notaMedia
				+ ", precio=" + precio + "]";
	}
	
}
