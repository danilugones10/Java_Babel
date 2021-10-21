package ordenador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static ApplicationContext context;
	
	public static void main(String[] args) throws ClassNotFoundException {

		context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		
		Ordenador ordenador=context.getBean("ordenador",Ordenador.class);
		DaoOrdenador.convertir(ordenador);
		System.out.println(ordenador);
		System.out.println("El precio del ordenador es de : "+ordenador.getPrecio());
	}

}
