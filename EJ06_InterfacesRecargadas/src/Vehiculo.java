
public class Vehiculo implements Movible{
	private int id;
	private String nombre;
	private int caballos;
	
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
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	
	@Override
	public void mover(int km) {
		Movible.super.mover(km);
	}
	
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", nombre=" + nombre + ", caballos=" + caballos + "]";
	}
	
	
	
}
