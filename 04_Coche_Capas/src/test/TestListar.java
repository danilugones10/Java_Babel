package test;

import java.util.List;

import entidad.Coche;
import negocio.GestorCoche;

public class TestListar {

	public static void main(String[] args) {
		GestorCoche gestorCoche= new GestorCoche();
		System.out.println(gestorCoche.obtener("123456K"));
		
		System.out.println("*******************");
		
		List<Coche>listaCoches=gestorCoche.listar();
		System.out.println(listaCoches);
	}

}
