package ordenador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DaoOrdenador {

	public static void convertir(Ordenador o) throws ClassNotFoundException {
		//Creando fichero
		try (FileOutputStream file = new FileOutputStream("pc.dat");
				ObjectOutputStream escritor = new ObjectOutputStream(file);) {
			escritor.writeObject(o.toString());
			
			System.out.println("El objeto se ha grabado con éxito");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
			return;
		}
		
		//Imprimiendo fichero
		try (FileInputStream file = new FileInputStream("pc.dat");
				ObjectInputStream escritor = new ObjectInputStream(file);){
			
			Object ordenador = escritor.readObject();

//			System.out.println(ordenador);
		} catch (IOException e) {
			System.out.println("Error al leer en el fichero");
			e.printStackTrace();
		}
	}

}
