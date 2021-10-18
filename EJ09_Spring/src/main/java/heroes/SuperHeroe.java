package heroes;

public class SuperHeroe {

	private int id;
	private String nombre;
	private int poder;
	private String superPoder;
	
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
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	public String getSuperPoder() {
		return superPoder;
	}
	public void setSuperPoder(String superpPoder) {
		this.superPoder = superpPoder;
	}
	
	@Override
	public String toString() {
		return "SuperHeroe [id=" + id + ", nombre=" + nombre + ", poder=" + poder + ", superPoder=" + superPoder
				+ "]";
	}
	
	
}
