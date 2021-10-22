package es.curso.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.ConfiguracionJava;
import es.curso.persistencia.DaoCrearTablaCliente;

public class MainCrearTablaCliente {

private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(ConfiguracionJava.class);
	}
	
	public static void main(String[] args) {
		DaoCrearTablaCliente daoCliente=context.getBean("daoCrearTablaCliente", DaoCrearTablaCliente.class);
		daoCliente.crearTablaCliente();
		System.out.println("Tabla creada :)");
	}

}
