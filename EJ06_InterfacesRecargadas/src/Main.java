import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Motos moto = new Motos(1, "Moto", 49);
		Coches coche = new Coches(2, "Coche", 120);
		Barcos barco = new Barcos(3, "Barco", 200);
		Aviones avion = new Aviones(4, "Avion", 300);

//		moto.mover(200);
//		coche.mover(500);
//		barco.mover(400);
//		avion.mover(300);

		List<Vehiculo> listaVehiculo = new ArrayList<>();
		listaVehiculo.add(moto);
		listaVehiculo.add(coche);
		listaVehiculo.add(barco);
		listaVehiculo.add(avion);

		for (Vehiculo vehiculo : listaVehiculo) {
			System.out.println(vehiculo);
			vehiculo.mover(300);
		}
	}

}
