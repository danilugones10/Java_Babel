package es.curso;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.curso.modelo.entidad.Pedidos;
import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoPedido;
import es.curso.modelo.persistencia.DaoUsuario;
import es.curso.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class Ej21SpringBootMvcApplication implements CommandLineRunner {

	@Autowired
	private DaoUsuario daoUsuario;

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	@Autowired
	private DaoPedido daoPedido;

	public static void main(String[] args) {
		SpringApplication.run(Ej21SpringBootMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setUsuario("dani");
		usuario.setContrasena("root");

		daoUsuario.save(usuario);

		Videojuego v1 = new Videojuego();
		v1.setNombre("Fifa");
		v1.setCompania("EA Sports");
		v1.setCreador("Dani");
		v1.setNotaMedia(9);
		v1.setWeb("wewwwwww");

		daoVideojuego.save(v1);
		
		Pedidos p1= new Pedidos();
		p1.setUsuario(usuario);
		p1.setCodigo("asasdx");
		p1.setFecha(new Date());
		
		daoPedido.save(p1);

	}

}
