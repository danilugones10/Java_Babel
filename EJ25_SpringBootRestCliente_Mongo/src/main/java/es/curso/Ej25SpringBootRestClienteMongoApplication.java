package es.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class Ej25SpringBootRestClienteMongoApplication implements CommandLineRunner {

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public static void main(String[] args) {
		SpringApplication.run(Ej25SpringBootRestClienteMongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Videojuego v1 = new Videojuego();
		v1.setId(1);
		v1.setNombre("Fifa");
		v1.setNotaMedia(9);
		v1.setCompania("EA");
		
		Videojuego v2 = new Videojuego();
		v2.setId(1);
		v2.setNombre("Fornite");
		v2.setNotaMedia(9);
		v2.setCompania("EpicGames");
		
		daoVideojuego.save(v1);
		daoVideojuego.save(v2);
		
		
//		daoVideojuego.deleteById(v1.getId());
		
//		Videojuego v3 = new Videojuego();
//		v3.setId(1);
//		v3.setNombre("GTA");
//		v3.setNotaMedia(9);
//		v3.setCompania("EA");
//		
//		daoVideojuego.save(v3);
		
//		daoVideojuego.findAll();
		
//		daoVideojuego.findById(v1.getId());

	}

}
