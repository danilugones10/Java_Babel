package ordenador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;
	
	public static void main(String[] args) throws ClassNotFoundException {
		context = new ClassPathXmlApplicationContext("ApplicationContext01.xml");
		
		Ordenador pc1 = context.getBean("pc", Ordenador.class);
//		System.out.println("El precio del ordenador es de: "+pc1.getPrecio());
//		System.out.println("El precio de los componentes es de: "+pc1.calcularPrecio());
		DaoOrdenador.convertir(pc1);
	}

}
