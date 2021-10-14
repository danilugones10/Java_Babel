package main;

import java.util.Scanner;

import entidad.Coche;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Coche coche = new Coche("123456Y", "Ford", "focus", 100);
		
		System.out.println("1- para añadir coche");
		System.out.println("2- para borrar coche");
		System.out.println("3- para modificar coche");
		System.out.println("4- para listar coches");
		System.out.println("5- para obtener coche");
		
		int option = teclado.nextInt();

		switch (option) {
		case 1: {
			coche.addCoche(coche);
			break;
		}
		case 2: {
			coche.deleteCoche(coche);
			break;
		}
		case 3: {
			Coche cocheEdit = new Coche("123456Y", "Ford", "Edit", 100);
			coche.editCoche(cocheEdit);
			break;
		}
		case 4: {
			coche.listarCoches();
			break;
		}
		case 5: {
			coche.obtenerCoche("123456Y");
			break;
		}
		}

	}

}
