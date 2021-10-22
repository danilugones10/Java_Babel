package es.curso.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cliente {

	private int id;
	private String nombre;
	private int edad;
	private Pedido listaPedidos;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id, String nombre, int edad, Pedido listaPedidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.listaPedidos = listaPedidos;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Pedido getListaPedidos() {
		return listaPedidos;
	}
	public void setListaPedidos(Pedido listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	
}
