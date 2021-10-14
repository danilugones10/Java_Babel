
public class Aviones extends Vehiculo {
	public Aviones(int id, String nombre, int caballos) {
		setCaballos(caballos);
		setId(id);
		setNombre(nombre);
	}
	@Override
	public void mover(int km) {
		int distancia=km;
		distancia+=getCaballos()*3;
		System.out.println("El avion se movera: "+distancia+" km");
		super.mover(km);
	}
}
