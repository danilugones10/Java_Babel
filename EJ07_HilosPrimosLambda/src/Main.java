
public class Main {

	public static void main(String[] args) {
		
		Thread t1 = getThread(26);
		t1.setName("Hilo 1");
		t1.start();
		
		Thread t2 = getThread(2);
		t2.setName("Hilo 2");
		t2.start();
		
		Thread t3 = getThread(7);
		t3.setName("Hilo 3");
		t3.start();
		
		
	}
	
	private static Thread  getThread(int numeroPrimo) {
			Hilo_Runable hilo = new Hilo_Runable(numeroPrimo);
			return new Thread(hilo.getThread());
	}

}
