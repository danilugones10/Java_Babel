package es.curso.modelo.entidad;

public class Usuario {
	private int id;
	private String usuario;
	private String contrase�a;
	
	public Usuario() {
		this.id=1;
		this.usuario="dani";
		this.contrase�a="root";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	

}
