package es.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.servicio.VideojuegoServicio;

@SpringBootApplication
public class Ej24SpringBootRestClienteApplication implements CommandLineRunner{

	@Autowired
	private VideojuegoServicio servicio;
	
	@Autowired
	private ApplicationContext context;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ej24SpringBootRestClienteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Videojuego v1=new Videojuego();
		v1.setId(1);
		v1.setNombre("Fifa");
		v1.setCompania("EA");
		v1.setNotaMedia(8);
		v1.setPrecio(20);
		
		servicio.alta(v1);
		
		
		servicio.obtener(1);
	}

}
