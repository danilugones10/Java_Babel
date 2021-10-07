package actividadOrdenador;

public class Procesador {
	private double precio;
	private String marca;
	private double hz;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getHz() {
		return hz;
	}
	public void setHz(double hz) {
		this.hz = hz;
	}
	
	@Override
	public String toString() {
		return "Procesador [precio=" + precio + ", marca=" + marca + ", hz=" + hz + "]";
	}
	
	

}
