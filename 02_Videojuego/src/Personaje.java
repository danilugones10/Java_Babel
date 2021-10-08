
public abstract class Personaje {
	private String nombre;
	private Arma arma;
	private int vida;
	private int dañoEspecial;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDañoEspecial() {
		return dañoEspecial;
	}
	public void setDañoEspecial(int dañoEspecial) {
		this.dañoEspecial = dañoEspecial;
	}
	
	public abstract int atacar();
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", arma=" + arma + ", vida=" + vida + ", dañoEspecial=" + dañoEspecial
				+ "]";
	}
	
	
}
