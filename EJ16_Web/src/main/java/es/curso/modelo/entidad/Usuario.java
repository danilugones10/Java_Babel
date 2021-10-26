package es.curso.modelo.entidad;

public class Usuario {
	private int id;
	private String usuario;
	private String contraseña;
	
	public Usuario() {
		this.id=1;
		this.usuario="dani";
		this.contraseña="root";
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
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
