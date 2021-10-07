package basico;

//Plantilla de objetos
public class Persona {

	// En una clase podemos encontrar metodos y atributos
	// Los atributos representan las caracteristicas de los objetos
	// El valor que tienen los atributos en un instante de tiempo se conoce como
	// estado de un objeto
	// Visibilidad:
	// private->solo en la clase
	// default->clase y paquete
	// protected->clase, paquete y herencia
	// public->todo el programa
	private String nombre;
	private int edad;
	private double peso;
	private Direccion direccion;

	// Los metodos representan la funcionalidad de los objetos
	// Los metodos tienen una firma de metodo que es lo que les hace unico
	// Firma:
	// 1- Numero de parametros de entrada
	// 2- Nombre del metodo
	// 3- Tipo de parametros de entrada
	public void presentar() {
		System.out.println("Me llamo " + nombre);
	}

	// Java no permite metodos con la misma firma

	// Si cambiamos alguna de las tres cosas que componen la firma de un metododo
	// estamos ante una sobrecarga
	public void presentar2() {
		System.out.println("Me llamo" + nombre);
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direccion=" + direccion + "]";
	}

	
	
	

}
