
public class Arma {
	private String nombre;
	private int daño=((int) (Math.random()*20)+20);
	private int tipo;
	
	
	public static int ESPADA=100;
	public static int ARCO=200;
	public static int HECHIZO=300;
	public static int REZO=400;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDaño() {
		return daño;
	}
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", daño=" + daño + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
}
