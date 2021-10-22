package es.curso.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.ConfiguracionJava;
import es.curso.persistencia.DaoCrearTablaPedido;

public class MainCrearTablaPedido {

private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(ConfiguracionJava.class);
	}
	
	public static void main(String[] args) {
		DaoCrearTablaPedido daoPedido = context.getBean("daoCrearTablaPedido", DaoCrearTablaPedido.class);
		daoPedido.crearTablaPedido();
		System.out.println("Tabla creada :)");
	}

}
