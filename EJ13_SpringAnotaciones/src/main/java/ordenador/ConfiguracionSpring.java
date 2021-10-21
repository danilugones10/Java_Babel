package ordenador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;


public class ConfiguracionSpring {
	
	@Bean(value = "ram")
	public RAM ram() {
		RAM ram = new RAM();
		ram.setPrecio((double)(Math.random()*50+50));
		ram.setHz(4);
		ram.setGeneracion("cuarta");
		return ram;
	}
	
	@Bean(value = "ramGrafica")
	public RAM ram2() {
		RAM ram = new RAM();
		ram.setPrecio((double)(Math.random()*50+50));
		ram.setHz(4);
		ram.setGeneracion("grafica");
		return ram;
	}
	
	@Bean
	public ArrayList<RAM> listaRam(@Qualifier("ram") RAM ram, @Qualifier("ramGrafica") RAM ram2){
		ArrayList<RAM>listaRam= new ArrayList<RAM>();
		listaRam.add(ram);
		listaRam.add(ram2);
		return listaRam;
	}
	
	@Bean
	public Procesador procesador() {
		Procesador procesador=new Procesador();
		procesador.setPrecio((double)(Math.random()*10));
		procesador.setMarca("Intel");
		procesador.setHz(5);
		return procesador;
	}
	
	@Bean
	public Placa placa() {
		Placa placa=new Placa();
		placa.setPrecio((double)(Math.random()*50+50));
		placa.setMarca("Asus");
		placa.setModelo("Modelo 2");
		return placa;
	}
	
	@Bean
	public TarjetaGrafica tarjetaGrafica(@Qualifier("ramGrafica") RAM ram) {
		TarjetaGrafica tarjetaGrafica= new TarjetaGrafica();
		tarjetaGrafica.setPrecio((double)(Math.random()*50+50));
		tarjetaGrafica.setMarca("Nvidia");
		tarjetaGrafica.setModelo("Gtx");
		tarjetaGrafica.setRam(ram);
		return tarjetaGrafica;	
	}
	
	@Bean
	public ArrayList<TarjetaGrafica> listaTarjetaGraficas(TarjetaGrafica tarjetaGrafica){
		ArrayList<TarjetaGrafica>listaTarjetaGraficas= new ArrayList<TarjetaGrafica>();
		listaTarjetaGraficas.add(tarjetaGrafica);
		return listaTarjetaGraficas;
	}
	
	@Bean(value = "raton")
	public Perifericos raton() {
		Perifericos raton = new Perifericos();
		raton.setPrecio((double)(Math.random()*50+50));
		raton.setMarca("HP");
		raton.setNombre("Raton");
		return raton;
	}
	
	@Bean(value = "teclado")
	public Perifericos teclado() {
		Perifericos teclado = new Perifericos();
		teclado.setPrecio((double)(Math.random()*50+50));
		teclado.setMarca("HP");
		teclado.setNombre("Teclado");
		return teclado;
	}
	
	@Bean
	public ArrayList<Perifericos> listaPerifericos(@Qualifier("raton") Perifericos raton, @Qualifier("teclado") Perifericos teclado){
		ArrayList<Perifericos>listaPerifericos= new ArrayList<Perifericos>();
		listaPerifericos.add(raton);
		listaPerifericos.add(teclado);
		return listaPerifericos;
	}
	
	@Bean
	public Ordenador ordenador( Placa placa, Procesador procesador, ArrayList<TarjetaGrafica> listaTarjetaGraficas, ArrayList<RAM> listaRam , ArrayList<Perifericos> listPerifericos) {
		Ordenador ordenador=new Ordenador();
		
		ordenador.setMarca(Ordenador.randomMarcaOrdenador());
		ordenador.setProcesador(procesador);
		ordenador.setPlaca(placa);
		ordenador.setListaTarjetaGrafica(listaTarjetaGraficas);
		ordenador.setListaRam(listaRam);
		ordenador.setListaPerifericos(listPerifericos);
		ordenador.setPrecio(ordenador.calcularPrecio());
		return ordenador;
	}
	

}
