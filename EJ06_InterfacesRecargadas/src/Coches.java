
public class Coches extends Vehiculo{
	public Coches(int id, String nombre, int caballos) {
		setCaballos(caballos);
		setId(id);
		setNombre(nombre);
	}
	@Override
	public void mover(int km) {
		System.out.println("El coche se movera: "+km+" km");
		super.mover(km);
	}
}
