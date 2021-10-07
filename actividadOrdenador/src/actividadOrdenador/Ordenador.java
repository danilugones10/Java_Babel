package actividadOrdenador;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {
	private double precio;
	private String marca;
	private Procesador procesador;
	private Placa placa;
	private ArrayList<RAM>listaRam;
	private ArrayList<TarjetaGrafica>listaTarjetaGrafica;
	private ArrayList<Perifericos>listaPerifericos;
	
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public List<RAM> getListaRam() {
		return listaRam;
	}
	public void setListaRam(List<RAM> listaRam) {
		this.listaRam = (ArrayList<RAM>) listaRam;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public List<TarjetaGrafica> getListaTarjetaGrafica() {
		return listaTarjetaGrafica;
	}
	public void setListaTarjetaGrafica(List<TarjetaGrafica> listaTarjetaGrafica) {
		this.listaTarjetaGrafica = (ArrayList<TarjetaGrafica>) listaTarjetaGrafica;
	}
	public List<Perifericos> getListaPerifericos() {
		return listaPerifericos;
	}
	public void setListaPerifericos(List<Perifericos> listaPerifericos) {
		this.listaPerifericos = (ArrayList<Perifericos>) listaPerifericos;
	}
	public Placa getPlaca() {
		return placa;
	}
	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", marca=" + marca + ", listaRam=" + listaRam + ", procesador="
				+ procesador + ", listaTarjetaGrafica=" + listaTarjetaGrafica + ", listaPerifericos=" + listaPerifericos
				+ ", placa=" + placa + "]";
	}
	
	public double calcularPrecio() {
		double precioRams = 0;
		double precioTarjetas = 0;
		double precioPerifericos = 0;
		
		for (int i = 0; i < listaRam.size(); i++) {
			precioRams=precioRams+listaRam.get(i).getPrecio();
		}
		for (int i = 0; i < listaTarjetaGrafica.size(); i++) {
			precioTarjetas=precioTarjetas+listaTarjetaGrafica.get(i).getPrecio();
		}
		for (int i = 0; i < listaPerifericos.size(); i++) {
			precioPerifericos=precioPerifericos+listaPerifericos.get(i).getPrecio();
		}
		return procesador.getPrecio()+placa.getPrecio()+precioPerifericos+precioRams+precioTarjetas;
	}
	
	

}
