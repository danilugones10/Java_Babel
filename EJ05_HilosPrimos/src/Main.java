
public class Main {

	public static void main(String[] args) {
		Hilo_Runable hilo1=new Hilo_Runable(26);
		Hilo_Runable hilo2=new Hilo_Runable(2);
		Hilo_Runable hilo3=new Hilo_Runable(7);
		
		Thread t1 = new Thread(hilo1);
		t1.setName("Hilo 1");
		t1.start();
		
		Thread t2 = new Thread(hilo2);
		t2.setName("Hilo 2");
		t2.start();
		
		Thread t3 = new Thread(hilo3);
		t3.setName("Hilo 3");
		t3.start();
	}

}
