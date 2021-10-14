
public class Hilo_Runable{

	private int numeroPrimo;

	public Hilo_Runable(int primo) {
		this.numeroPrimo = primo;
	}

	
	private Runnable thread = () -> {
		double startTime=System.nanoTime();


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
		double time=System.nanoTime()-startTime;
		System.out.println("Tiempo del hilo "+Thread.currentThread().getName()+" :"+ time);
	};
	
	public Runnable getThread() {
		return thread;
	}

	public void setThread(Runnable thread) {
		this.thread = thread;
	}

	public int getNumeroPrimo() {
		return numeroPrimo;
	}

	public void setNumeroPrimo(int numeroPrimo) {
		this.numeroPrimo = numeroPrimo;
	}
	
	
}
