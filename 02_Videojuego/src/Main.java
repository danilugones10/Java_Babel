import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Personaje guerrero = new Guerrero();
		guerrero.setNombre("Guerrero");
		guerrero.setVida(100);
		guerrero.setDañoEspecial(5);
		Arma espada = new Arma();
		espada.setNombre("Espada");
		espada.setTipo(Arma.ESPADA);
		guerrero.setArma(espada);

		Personaje mago = new Mago();
		mago.setNombre("Mago");
		mago.setVida(100);
		mago.setDañoEspecial(10);
		Arma arco = new Arma();
		arco.setNombre("Arco");
		arco.setTipo(Arma.HECHIZO);
		mago.setArma(arco);

		Curandero curandero = new Curandero();
		curandero.setNombre("Curandero");
		curandero.setVida(100);
		curandero.setDañoEspecial(20);
		Arma rezo = new Arma();
		rezo.setNombre("Rezo");
		rezo.setTipo(Arma.REZO);
		curandero.setArma(rezo);

		Scanner teclado = new Scanner(System.in);
		String enter;

		while ((guerrero.getVida() >= 0) || (mago.getVida() >= 0)) {
			System.out.println("-----Teclee una letra y dale a ENTER-----");
			enter = teclado.next();
			System.out.println(mago.getNombre() + " tiene: " + mago.getVida() + " y ataca " + guerrero.getNombre()
					+ " con daño " + guerrero.atacar());
			mago.setVida(mago.getVida() - guerrero.atacar());
			System.out.println(mago.getNombre() + " se quedo con una vida de : " + mago.getVida());
			if (mago.getVida() <= 0) {
				System.out.println();
				System.out.println("GANADOR: " + guerrero.getNombre());
				break;
			}
			System.out.println("-----Teclee una letra y dale a ENTER-----");
			enter = teclado.next();
			System.out.println(guerrero.getNombre() + " tiene: " + guerrero.getVida() + " y ataca " + mago.getNombre()
					+ " con daño " + mago.atacar());
			guerrero.setVida(guerrero.getVida() - mago.atacar());
			System.out.println(guerrero.getNombre() + " se quedo con una vida de : " + guerrero.getVida());
			if (guerrero.getVida() <= 0) {
				System.out.println();
				System.out.println("GANADOR: " + mago.getNombre());
				break;
			}
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		}

	}

}
