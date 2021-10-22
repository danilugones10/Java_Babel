package es.curso.entity;

import java.util.Date;

public class Pedido {
	
	private int id;
	private int importe;
	private Date fecha;
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pedido(int id, int importe, Date fecha) {
		super();
		this.id = id;
		this.importe = importe;
		this.fecha = fecha;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
