package es.curso.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cliente {

	
	private int id;
	private String nombre;
	private int edad;
	private int pedido_id;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id, String nombre, int edad, int pedido_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.pedido_id = pedido_id;
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
	public int getPedido_id() {
		return pedido_id;
	}
	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", pedido_id=" + pedido_id + "]";
	}
}
