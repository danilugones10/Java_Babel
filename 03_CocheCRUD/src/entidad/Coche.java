package entidad;

public class Coche {

	private int id;
	private String marca;
	private int a�os;
	private double km;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getA�os() {
		return a�os;
	}
	public void setA�os(int a�os) {
		this.a�os = a�os;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", a�os=" + a�os + ", km=" + km + "]";
	}
	
}
