package videojuego;

public class Main {

	public static void main(String[] args) {

		Guerrero g1 = new Guerrero();
		g1.setNombre("Dani");
		Espada e1 = new Espada();
		g1.setArma(e1);
		g1.atacar();

		Guerrero g2 = new Guerrero();
		g2.setNombre("Pepe");
		Arco a1 = new Arco();
		g2.setArma(a1);
		g2.atacar();
	}

}
