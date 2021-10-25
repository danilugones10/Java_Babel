package es.curso.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.Configuracion;
import es.curso.modelo.entidad.Coche;
import es.curso.modelo.negocio.GestorCoche;

public class Main {

	private static ApplicationContext context;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(Configuracion.class);
		System.out.println("Inicializando BBDD...");

		Coche c = context.getBean("coche", Coche.class);
		GestorCoche gc = context.getBean("gestorCoche", GestorCoche.class);

		int opcion = 0;

		do {
			System.out.println("         Menu\n" + "\t 1. Dar de alta un nuevo coche\n"
					+ "\t 2. Buscar un coche\n" + "\t 3. Modificar un coche\n" + "\t 4. Borrar un coche\n"
					+ "\t 5. Listar los coches\n" +"\t 0. Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Inserte matricula de 7 digitos");
				c.setMatricula(sc.next());
				System.out.println("Inserte marca");
				c.setMarca(sc.next());
				System.out.println("Inserte modelo");
				c.setModelo(sc.next());
				System.out.println("Inserte kilometros del coche");
				c.setKm(sc.nextInt());
				System.out.println("**** INSERTANDO COCHE ****");
				gc.alta(c);
				break;

			case 2:
				System.out.println("**** BUSCAR COCHE ****");
				System.out.println("Inserte id del coche");
				System.out.println(gc.buscar(sc.nextInt()));
				break;

			case 3:
				System.out.println("Inserte id del coche que modifiques");
				Coche modificacion= gc.buscar(sc.nextInt());
				System.out.println("**** MODIFICAR COCHE ****");
				System.out.println("Inserte marca");
				modificacion.setMarca(sc.next());
				System.out.println("Inserte modelo");
				modificacion.setModelo(sc.next());
				System.out.println("Inserte matricula de 7 digitos");
				modificacion.setMatricula(sc.next());
				gc.modificar(modificacion);
				break;

			case 4:
				System.out.println("**** BORRAR COCHE ****");
				System.out.println("Inserte id del coche que vas a borrar");
				gc.baja(sc.nextInt());
				break;

			case 5:
				System.out.println("**** LISTAR COCHES ****");
				List<Coche> lista = gc.listar();
				lista.forEach((v) -> System.out.println(v));
				break;
			}

		} while (opcion != 0);

	}

}
