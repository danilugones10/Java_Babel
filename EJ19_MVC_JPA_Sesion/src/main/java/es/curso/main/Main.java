package es.curso.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.Configuracion;
import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoUsu;
import es.curso.modelo.persistencia.DaoVideo;

public class Main {

	private static ApplicationContext context;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(Configuracion.class);
		System.out.println("Inicializando BBDD...");

		Videojuego videojuego = context.getBean(Videojuego.class);
		DaoVideo gVideojuego = context.getBean(DaoVideo.class);
		Usuario usuario = context.getBean(Usuario.class);
		DaoUsu gUsuario = context.getBean(DaoUsu.class);

		int opcion = 0;

		do {
			System.out.println("         Menu\n" + "\t 1. Nuevo Usuario\n" + "\t 2. Buscar un usuario\n"
					+ "\t 3. Modificar un usuario\n" + "\t 4. Borrar un usuario\n" + "\t 5. Listar los usuario\n"
					+ "\t 6. Nuevo Videojuego\n" + "\t 7. Buscar Videojuego\n" + "\t 8. Modificar Videojuego\n"
					+ "\t 9. Borrar Videojuego\n" + "\t 10. Listar Videojuegos\n" + "\t 0. Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("inserte usuario");
				usuario.setUsuario(sc.next());
				System.out.println("Inserte contraseña");
				usuario.setContrasena(sc.next());
				gUsuario.save(usuario);
				System.out.println("Alta el usuario");
				break;

			case 2:
				System.out.println("**** BUSCAR Usuario ****");
				System.out.println("Inserte id del usuario");
				System.out.println(gUsuario.findById(sc.nextInt()));
				break;

			case 3:
				System.out.println("Inserte id del coche que modifiques");
				Usuario modificacion = gUsuario.findById(sc.nextInt()).get();
				System.out.println("**** MODIFICAR COCHE ****");
				System.out.println("Inserte marca");
				modificacion.setId(sc.nextInt());
				System.out.println("Inserte modelo");
				modificacion.setUsuario(null);
				System.out.println("Inserte matricula de 7 digitos");
				modificacion.setContrasena(sc.next());
				gUsuario.save(modificacion);
				System.out.println("Modificado el usuario");
				break;

			case 4:
				System.out.println("**** BORRAR Usuario ****");
				System.out.println("Inserte id del usuario que vas a borrar");
				gUsuario.deleteById(sc.nextInt());
				break;

			case 5:
				System.out.println("**** LISTAR Usuarios ****");
				List<Usuario> lista = gUsuario.findAll();
				lista.forEach((v) -> System.out.println(v));
				break;
			case 6:
				System.out.println("Inserte nombre de videojuego");
				videojuego.setNombre(sc.next());
				System.out.println("Inserte compania de videojuego");
				videojuego.setCompania(sc.next());
				System.out.println("Inserte creador del videojuego");
				videojuego.setCreador(sc.next());
				System.out.println("Inserte nota del videojuego");
				videojuego.setNotaMedia(sc.nextInt());
				System.out.println("Inserte web del videojuego");
				videojuego.setWeb(sc.next());
				gVideojuego.save(videojuego);
				System.out.println("Alta el usuario");
				break;

			case 7:
				System.out.println("**** BUSCAR Videojuego ****");
				System.out.println("Inserte id del videojuego");
				System.out.println(gVideojuego.findById(sc.nextInt()));
				break;

			case 8:
				System.out.println("Inserte id del videojuego que modifiques");
				Videojuego modificacion2 = gVideojuego.findById(sc.nextInt()).get();
				System.out.println("**** MODIFICAR Videojuego ****");
				System.out.println("Inserte nota");
				modificacion2.setNotaMedia(sc.nextInt());
				System.out.println("Inserte nombre");
				modificacion2.setNombre(sc.next());
				System.out.println("Inserte compania");
				modificacion2.setCompania(sc.next());
				gVideojuego.save(modificacion2);
				System.out.println("Modificado el usuario");
				break;

			case 9:
				System.out.println("**** BORRAR Videojuego ****");
				System.out.println("Inserte id del usuario que vas a borrar");
				gVideojuego.deleteById(sc.nextInt());
				break;

			case 10:
				System.out.println("**** LISTAR Videojuegos ****");
				List<Videojuego> lista2 = gVideojuego.findAll();
				lista2.forEach((v) -> System.out.println(v));
				break;
			}

		} while (opcion != 0);

	}

}
