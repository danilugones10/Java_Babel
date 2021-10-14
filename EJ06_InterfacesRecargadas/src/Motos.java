
public class Motos  extends Vehiculo{
	public Motos(int id, String nombre, int caballos) {
		setCaballos(caballos);
		setId(id);
		setNombre(nombre);
	}
	@Override
	public void mover(int km) {
		System.out.println("La moto se movera: "+km+" km");
		super.mover(km);
	}
}
