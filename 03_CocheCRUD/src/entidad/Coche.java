package entidad;

public class Coche {

	private int id;
	private String marca;
	private int años;
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
	public int getAños() {
		return años;
	}
	public void setAños(int años) {
		this.años = años;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", años=" + años + ", km=" + km + "]";
	}
	
}
