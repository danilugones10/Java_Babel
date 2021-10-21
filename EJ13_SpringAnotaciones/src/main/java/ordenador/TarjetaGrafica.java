package ordenador;

public class TarjetaGrafica {
	private double precio;
	private String marca;
	private RAM ram;
	private String modelo;
	
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
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "TarjetaGrafica [precio=" + precio + ", marca=" + marca + ", ram=" + ram + ", modelo=" + modelo + "]";
	}
	
	
	
}
