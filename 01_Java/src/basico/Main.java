package basico;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
//		El ciclo de vida de un objeto en java es desde que se crea y mientras tenga una refrencia apuntando, ya que los objetos que no
//		tienen referencia seran eliminados por el recolector de basura

//		int contador=0;
//		while (true) {
//			Persona p1 = new Persona();
//			System.out.println(contador++ +"-"+ p1.toString());
//		}

		Persona p1 = new Persona();
		p1.setEdad(30);

		Persona p2 = p1;
		p1.setEdad(40);

		int numero = 0;
		int numero2 = numero;
		numero = 10;

		System.out.println(p1.getEdad());
		System.out.println(p2.getEdad());

		System.out.println(numero);
		System.out.println(numero2);
		
		Persona p3 = new Persona();
		p3.setEdad(49);
		p3.setNombre("Dani");
		p3.setPeso(60);
		Direccion d1 = new Direccion();
		p3.setDireccion(d1);
		p3.getDireccion().setCiudad("Oviedo");
		p3.getDireccion().setCp("33194");
		
		System.out.println(p3);

	}

}
