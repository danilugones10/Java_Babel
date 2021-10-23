package es.curso.main;


import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.ConfiguracionJava;
import es.curso.entity.Cliente;
import es.curso.entity.Pedido;
import es.curso.negocio.GestorCliente;
import es.curso.negocio.GestorPedido;

public class Main {

	private static ApplicationContext context;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ConfiguracionJava.class);
		
		GestorPedido gp=context.getBean("gestorPedido", GestorPedido.class);
		
		GestorCliente gc=context.getBean("gestorCliente", GestorCliente.class);
		
		int opcion=0;
		
		do {
			
			System.out.println("         Menu\n"
					+ "\t 1. Dar de alta un nuevo pedido\n"
					+ "\t 2. Dar de baja un pedido\n"
					+ "\t 3. Buscar un pedido\n"
					+ "\t 4. Modificar un pedido\n"
					+ "\t 5. Dar de alta un nuevo cliente\n"
					+ "\t 6. Dar de baja un cliente\n"
					+ "\t 7. Buscar un cliente\n"
					+ "\t 8. Modificar un cliente\n"
					+ "\t 9. Listar pedidos\n"
					+ "\t 10. Listar clientes\n"
					+ "\t 0. Salir");
			opcion=sc.nextInt();
			
			switch(opcion) {
			
				case 1:
					Pedido p= context.getBean("pedido", Pedido.class);
					System.out.println("inserte importe del pedido");
					p.setImporte(sc.nextInt());
					p.setFecha(new Date());
					gp.insertar(p);
					break;
					
				case 2:
					System.out.println("inserte id del pedido que vas a borrar");
					gp.borrar(sc.nextInt());
					break;
					
				case 3:
					System.out.println("inserte id del pedido que vas a buscar");
					gp.buscar(sc.nextInt());
					break;
				
				case 4:
					System.out.println("id del pedido");
					Pedido p2= gp.buscar(sc.nextInt());
					System.out.println("nuevo importe");
					p2.setImporte(sc.nextInt());
					gp.modificar(p2);
					break;
					
				case 5:
					Cliente c= context.getBean("cliente", Cliente.class);
					System.out.println("inserte edad del cliente");
					c.setEdad(sc.nextInt());
					System.out.println("inserte nombre del cliente");
					c.setNombre(sc.next());
					System.out.println("inserte id del pedido correspondiente");
					c.setPedido_id(sc.nextInt());
					gc.insertar(c);
					break;
					
				case 6:
					System.out.println("inserte id del clinete que vas a dar de baja");
					gc.borrar(sc.nextInt());
					break;
					
				case 7:
					System.out.println("inserte id del cliente que vas a buscar");
					gp.buscar(sc.nextInt());
					break;
					
				case 8:
					System.out.println("id del cliente");
					Cliente c2= gc.buscar(sc.nextInt());
					System.out.println("nueva edad");
					c2.setEdad(sc.nextInt());
					System.out.println("nuevo nombre");
					c2.setNombre(sc.next());
					System.out.println("nuevo pedido");
					c2.setPedido_id(sc.nextInt());
					gc.modificar(c2);
					break;	
				
				case 9:
					System.out.println(gp.listar());
					break;
				
				case 10:
					System.out.println(gc.listar());
					break;
			}
			
		} while (opcion != 0);
	}

}

