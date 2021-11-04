package es.curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoVideojuego;

@RestController
public class VideojuegoControlador {

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	
	//Buscar por id
	@GetMapping(path="videojuego/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity<Videojuego> getPersona(@PathVariable("id") int id) {
		System.out.println("Buscando videojuego con id: " + id);
		Videojuego p = daoVideojuego.get(id);
		if(p != null) {
			return new ResponseEntity<Videojuego>(p,HttpStatus.OK);//200 OK
		}else {
			return new ResponseEntity<Videojuego>(HttpStatus.NOT_FOUND);//404 NOT FOUND
		}
	}
	
	//Dar de alta un videojuego
	@PostMapping(path="videojuego",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Videojuego> altaVideojuego(@RequestBody Videojuego p) {
		System.out.println("altaPersona: objeto persona: " + p);
		daoVideojuego.add(p);
		return new ResponseEntity<Videojuego>(p,HttpStatus.CREATED);//201 CREATED
	}
	
	//Sacar todos los videojuegos
	@GetMapping(path="videojuegos",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Videojuego>> listarVideojuegos() {
		List<Videojuego> listaPersonas = null;
			System.out.println("Listando los videojuegos");
			listaPersonas = daoVideojuego.list();			
		
		System.out.println(listaPersonas);
		return new ResponseEntity<List<Videojuego>>(listaPersonas,HttpStatus.OK);
	}
	
	//Sacar precio
		@GetMapping(path="precio",produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<Integer>> precios() {
			System.out.println("Precios");			
			System.out.println("El ultimo valor del JSON es el precio TOTAL");
			return new ResponseEntity<List<Integer>>(daoVideojuego.total(),HttpStatus.OK);
		}
	
	//Buscar por Nombre
	@GetMapping(path="videojuegosNombre/{nombre}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Videojuego>> listarVideojuegosNombre(@PathVariable("nombre") String nombre) {
		List<Videojuego> listaPersonas = null;
			System.out.println("Listando las videojuegos por nombre: " + nombre);
			listaPersonas = daoVideojuego.listByNombre(nombre);			
		
		System.out.println(listaPersonas);
		return new ResponseEntity<List<Videojuego>>(listaPersonas,HttpStatus.OK);
	}
	
	//Buscar por Compania
	@GetMapping(path="videojuegosCompania/{compania}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Videojuego>> listarVideojuegosCompania(@PathVariable("compania") String compania) {
		List<Videojuego> listaPersonas = null;
			System.out.println("Listando las videojuegos por compania: " + compania);
			listaPersonas = daoVideojuego.listByCompania(compania);			
		
		System.out.println(listaPersonas);
		return new ResponseEntity<List<Videojuego>>(listaPersonas,HttpStatus.OK);
	}
	
	//Borrar un videojuego
	@DeleteMapping(path="videojuego/{id}")
	public ResponseEntity<Videojuego> borrarPersona(@PathVariable int id) {
		System.out.println("ID a borrar: " + id);
		Videojuego p = daoVideojuego.delete(id);
		if(p != null) {
			return new ResponseEntity<Videojuego>(p,HttpStatus.OK);//200 OK
		}else {
			return new ResponseEntity<Videojuego>(HttpStatus.NOT_FOUND);//404 NOT FOUND
		}
	}
	
	//Modificar videojuego
	@PutMapping(path="videojuego/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Videojuego> modificarPersona(
			@PathVariable("id") int id, 
			@RequestBody Videojuego p) {
		System.out.println("ID a modificar: " + id);
		System.out.println("Datos a modificar: " + p);
		p.setId(id);
		Videojuego pUpdate = daoVideojuego.update(p);
		if(pUpdate != null) {
			return new ResponseEntity<Videojuego>(HttpStatus.OK);//200 OK
		}else {
			return new ResponseEntity<Videojuego>(HttpStatus.NOT_FOUND);//404 NOT FOUND
		}
	}
}
