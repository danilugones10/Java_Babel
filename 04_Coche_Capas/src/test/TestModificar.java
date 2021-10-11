package test;

import entidad.Coche;
import negocio.GestorCoche;

public class TestModificar {

	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.setMatricula("123456K");
		coche.setMarca("Audi");
		coche.setModelo("Q7");
		coche.setKm(8000);
		
		GestorCoche gestorCoche = new GestorCoche();
		boolean modificar=gestorCoche.modificar(coche);
		if(modificar){
			System.out.println("El coche se ha modificado");
		}else{
			System.out.println("El coche NO se ha modificado");
		}

	}

}
