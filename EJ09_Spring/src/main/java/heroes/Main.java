package heroes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);

		context = new ClassPathXmlApplicationContext("ApplicationContext01.xml");
		
		boolean salir=false;

		SuperHeroe heroe1 = context.getBean("heroe1", SuperHeroe.class);

		SuperHeroe heroe2 = context.getBean("heroe2", SuperHeroe.class);

		SuperHeroe heroe3 = context.getBean("heroe3", SuperHeroe.class);

		List<SuperHeroe> listaPoder100 = new ArrayList<SuperHeroe>();

		List<SuperHeroe> listaVolar = new ArrayList<SuperHeroe>();

		
		do {
		System.out.println("1- Acceder a los 3 superHeroes singelton");
		System.out.println("2- Add super heroe con potencia 100 a su lista (pedira los datos al usuario)");
		System.out.println("3- Add super heroe que pueda volar a su lista (pedira los datos al usuario)");
		System.out.println("4- Listar super heroes con potencia 100");
		System.out.println("5- Listar super heroes que puedan volar");
		System.out.println("6- Salir");

		int option = teclado.nextInt();
			switch (option) {
			case 1: {
				System.out.println(heroe1);
				System.out.println(heroe2);
				System.out.println(heroe3);
				break;
			}
			case 2: {
				SuperHeroe heroePrototype = context.getBean("heroePrototype", SuperHeroe.class);
				System.out.println("Escriba la id");
				int id = teclado.nextInt();
				heroePrototype.setId(id);
				System.out.println("Escriba el nombre");
				String nombre = teclado.next();
				heroePrototype.setNombre(nombre);
				System.out.println("Escriba el poder");
				String superPoder = teclado.next();
				heroePrototype.setSuperPoder(superPoder);
				listaPoder100.add(heroePrototype);
				break;
			}
			case 3: {
				SuperHeroe heroePrototype2 = context.getBean("heroePrototype2", SuperHeroe.class);
				System.out.println("Escriba la id");
				int id = teclado.nextInt();
				heroePrototype2.setId(id);
				System.out.println("Escriba el nombre");
				String nombre = teclado.nextLine();
				heroePrototype2.setNombre(nombre);
				System.out.println("Escriba el poder");
				int poder = teclado.nextInt();
				heroePrototype2.setPoder(poder);
				listaVolar.add(heroePrototype2);
				break;
			}
			case 4: {
				System.out.println(listaPoder100);
				break;
			}
			case 5: {
				System.out.println(listaVolar);
				break;
			}
			case 6:{
				salir=true;
				System.out.println("Saliendo");
				break;
			}
			}
		}while(salir==false);
	}

}
