package entidad;

import java.util.List;

import negocio.GestorCoche;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	
	public Coche(String matricula, String marca, String modelo, int km) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}
	
	public Coche() {
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + "]";
	}
	
	public void addCoche(Coche coche) {
		GestorCoche gestorCoche = new GestorCoche();
		boolean alta = gestorCoche.alta(coche);
		if(alta) {
		System.out.println("El coche se añadió correctamente");
		}else {
		System.out.println("Hubo un fallo al añadir el coche");
		}
	}
	
	public void deleteCoche(Coche coche) {
		GestorCoche gestorCoche=new  GestorCoche();
		boolean baja=gestorCoche.baja(coche.matricula);
		if(baja){
			System.out.println("El coche se ha dado de baja");
		}else{
			System.out.println("El coche NO se ha dado de baja");
		}
	}
	
	public void editCoche(Coche coche) {
		GestorCoche gestorCoche = new GestorCoche();
		boolean modificar=gestorCoche.modificar(coche);
		if(modificar){
			System.out.println("El coche se ha modificado");
		}else{
			System.out.println("El coche NO se ha modificado");
		}
	}
	
	public void obtenerCoche(String matricula) {
		GestorCoche gestorCoche= new GestorCoche();
		System.out.println(gestorCoche.obtener(matricula));
	}
	
	public void listarCoches() {
		GestorCoche gestorCoche= new GestorCoche();
		List<Coche>listaCoches=gestorCoche.listar();
		System.out.println(listaCoches);
	}
}
