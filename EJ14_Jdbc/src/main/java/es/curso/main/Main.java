package es.curso.main;


import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.ConfiguracionJava;
import es.curso.entity.Cliente;
import es.curso.entity.Pedido;
import es.curso.negocio.GestorCliente;
import es.curso.negocio.GestorPedido;

public class Main {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ConfiguracionJava.class);
		
		GestorPedido gp=context.getBean("gestorPedido", GestorPedido.class);
		Pedido p= context.getBean("pedido", Pedido.class);
//		p.setImporte(10);
//		p.setFecha(new Date());
		
		GestorCliente gc=context.getBean("gestorCliente", GestorCliente.class);
		Cliente c= context.getBean("cliente", Cliente.class);
		c.setEdad(19);
		c.setNombre("Dani");
		c.setPedido_id(2);
		
		gc.insertar(c);
		

	}

}
