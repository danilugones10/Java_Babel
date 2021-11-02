package es.curso;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import es.curso.modelo.entidad.Coche;
import es.curso.modelo.persistencia.DaoCocheJPA;

@SpringBootApplication
public class Ej20SpribgBootApplication implements CommandLineRunner{
	public static Scanner sc = new Scanner(System.in);
	
	@Autowired
	private Coche coche;
	
	@Autowired
	private DaoCocheJPA daoCocheJPA;
	
	public static void main(String[] args) {
		SpringApplication.run(Ej20SpribgBootApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		int opcion = 0;

		do {
			System.out.println("         Menu\n" + "\t 1. Dar de alta un nuevo coche\n" + "\t 2. Buscar un coche\n"
					+ "\t 3. Modificar un coche\n" + "\t 4. Borrar un coche\n" + "\t 5. Listar los coches\n"
					+ "\t 0. Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Inserte matricula de 7 digitos");
				coche.setMatricula(sc.next());
				System.out.println("Inserte marca");
				coche.setMarca(sc.next());
				System.out.println("Inserte modelo");
				coche.setModelo(sc.next());
				System.out.println("Inserte kilometros del coche");
				coche.setKm(sc.nextInt());
				System.out.println("**** INSERTANDO COCHE ****");
				if ((coche.getMatricula().length() == 7) && (coche.getMarca().length() > 0) && (coche.getModelo().length() > 0)) {
					daoCocheJPA.save(coche);
				}
				break;

			case 2:
				System.out.println("**** BUSCAR COCHE ****");
				System.out.println("Inserte id del coche");
				System.out.println(daoCocheJPA.findById(sc.nextInt()));
				break;

			case 3:
				System.out.println("Inserte id del coche que modifiques");
				Coche modificacion = daoCocheJPA.findById(sc.nextInt()).get();
				System.out.println("**** MODIFICAR COCHE ****");
				System.out.println("Inserte marca");
				modificacion.setMarca(sc.next());
				System.out.println("Inserte modelo");
				modificacion.setModelo(sc.next());
				System.out.println("Inserte matricula de 7 digitos");
				modificacion.setMatricula(sc.next());
				if ((coche.getMatricula().length() == 7) && (coche.getMarca().length() > 0) && (coche.getModelo().length() > 0)) {
					daoCocheJPA.save(modificacion);
				}
				break;

			case 4:
				System.out.println("**** BORRAR COCHE ****");
				System.out.println("Inserte id del coche que vas a borrar");
				daoCocheJPA.deleteById(sc.nextInt());
				break;

			case 5:
				System.out.println("**** LISTAR COCHES ****");
				List<Coche> lista = daoCocheJPA.findAll();
				lista.forEach((v) -> System.out.println(v));
				break;
			}

		} while (opcion != 0);
		
	}

}
