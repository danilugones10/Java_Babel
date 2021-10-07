package actividadOrdenador;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Ordenador ordenador = new Ordenador();
		ordenador.setMarca("Hp");
		ordenador.setPrecio(1000);
		
		Procesador procesador=new Procesador();
		procesador.setHz(4.2);
		procesador.setMarca("Intel");
		procesador.setPrecio(100);
		ordenador.setProcesador(procesador);
		
		Placa placa=new Placa();
		placa.setMarca("Asus");
		placa.setModelo("320");
		placa.setPrecio(100);
		ordenador.setPlaca(placa);
		
		RAM ram = new RAM();
		ram.setGeneracion("8");
		ram.setHz(2.4);
		ram.setPrecio(100);
		RAM ram2 = new RAM();
		ram2.setGeneracion("8");
		ram2.setHz(2.4);
		ram2.setPrecio(100);
		RAM ram3 = new RAM();
		ram3.setGeneracion("8");
		ram3.setHz(2.4);
		ram3.setPrecio(100);
		ArrayList<RAM>listaRam=new ArrayList<RAM>();
		listaRam.add(ram);listaRam.add(ram2);listaRam.add(ram3);
		ordenador.setListaRam(listaRam);
		
		TarjetaGrafica tarjeta1=new TarjetaGrafica();
		tarjeta1.setMarca("Geforce");
		tarjeta1.setModelo("modelo1");
		tarjeta1.setPrecio(100);
		tarjeta1.setRam(ram);
		ArrayList<TarjetaGrafica>listaTarjetas=new ArrayList<TarjetaGrafica>();
		listaTarjetas.add(tarjeta1);
		ordenador.setListaTarjetaGrafica(listaTarjetas);
		
		Perifericos periferico1=new Perifericos();
		periferico1.setMarca("Razer");
		periferico1.setNombre("Raton");
		periferico1.setPrecio(100);
		Perifericos periferico2=new Perifericos();
		periferico2.setMarca("Razer");
		periferico2.setNombre("Teclado");
		periferico2.setPrecio(100);
		ArrayList<Perifericos>listaPerifericos=new ArrayList<Perifericos>();
		listaPerifericos.add(periferico1);listaPerifericos.add(periferico2);
		ordenador.setListaPerifericos(listaPerifericos);
		
		
		System.out.println(ordenador);
		System.out.println("El precio del ordenador es de: "+ordenador.getPrecio());
		System.out.println("El precio de los perifericos es de: "+ordenador.calcularPrecio());
	}

}
