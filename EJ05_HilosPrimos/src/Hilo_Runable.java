
public class Hilo_Runable implements Runnable {

	private int numeroPrimo;

	public Hilo_Runable(int primo) {
		this.numeroPrimo = primo;
	}

	@Override
	public void run() {

		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

		boolean prime = true;
		for (int i = 2; i < numeroPrimo; i++) {
			if (numeroPrimo % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("El numero "+numeroPrimo+" es primo");
		} else {
			System.out.println("El numero "+numeroPrimo+" NO es primo");

		}
	}

}
