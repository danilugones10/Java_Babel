package test;

import negocio.GestorCoche;

public class TestBaja {

	public static void main(String[] args) {
		GestorCoche gestorCoche=new  GestorCoche();
		
		boolean baja=gestorCoche.baja("123456K");
		if(baja){
			System.out.println("El coche se ha dado de baja");
		}else{
			System.out.println("El coche NO se ha dado de baja");
		}
	}

}
