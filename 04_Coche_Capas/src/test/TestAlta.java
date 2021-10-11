package test;

import entidad.Coche;
import negocio.GestorCoche;


public class TestAlta {

	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.setMatricula("123456K");
		coche.setMarca("Mercedes");
		coche.setModelo("amg 64");
		coche.setKm(10000);
		
		GestorCoche gestorCoche = new GestorCoche();
		boolean alta=gestorCoche.alta(coche);
		if(alta){
			System.out.println("El coche se ha dado de alta");
		}else{
			System.out.println("El coche NO se ha dado de alta");
		}
	}

}
