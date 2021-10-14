
public class Barcos extends Vehiculo{
	public Barcos(int id, String nombre, int caballos) {
		setCaballos(caballos);
		setId(id);
		setNombre(nombre);
	}
	@Override
	public void mover(int km) {
		int distancia=km;
		distancia+=getCaballos()*2;
		System.out.println("El barco se movera: "+distancia+" km");
		super.mover(km);
	}
}
