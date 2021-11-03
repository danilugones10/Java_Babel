package es.curso.modelo.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.springframework.stereotype.Component;

@Entity
@Table(name="videojuegos")
@Component
public class Videojuego {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	private String nombre;
	private String compania;
	private int notaMedia;
	private String creador;
	private String web;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="detalle_pedido",
	   joinColumns= { @JoinColumn(name="fk_id_detalle", referencedColumnName="id") },
	   inverseJoinColumns= { @JoinColumn(name="fk_id_videojuego", referencedColumnName="id")})
	private List<Pedidos> pedidos;
	
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
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compania=" + compania + ", notaMedia=" + notaMedia
				+ "]";
	}
	
}
