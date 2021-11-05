package es.curso.modelo.servicio;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import es.curso.modelo.entidad.Videojuego;

@Service
public class VideojuegoServicio {

	public static final String URL = "http://localhost:8080/videojuego/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Videojuego obtener(int id){
		try {
			ResponseEntity<Videojuego> re = restTemplate.getForEntity(URL + id, Videojuego.class);
			HttpStatus hs= re.getStatusCode();
			if(hs == HttpStatus.OK) {				
				return re.getBody();
			}else {
				System.out.println("Respuesta no contemplada");
				return null;
			}
		}catch (HttpClientErrorException e) {
			System.out.println("obtener -> La persona NO se ha encontrado, id: " + id);
		    System.out.println("obtener -> Codigo de respuesta: " + e.getStatusCode());
		    return null;
		}
	}
	
	public Videojuego alta(Videojuego p){
		try {
			ResponseEntity<Videojuego> re = restTemplate.postForEntity(URL, p, Videojuego.class);
			System.out.println("alta -> Codigo de respuesta " + re.getStatusCode());
			return re.getBody();
		} catch (HttpClientErrorException e) {
			System.out.println("alta -> La persona NO se ha dado de alta, id: " + p);
		    System.out.println("alta -> Codigo de respuesta: " + e.getStatusCode());
		    return null;
		}
	}
	
	public boolean modificar(Videojuego p){
		try {
			restTemplate.put(URL + p.getId(), p, Videojuego.class);
			return true;
		} catch (HttpClientErrorException e) {
			System.out.println("modificar -> La persona NO se ha modificado, id: " + p.getId());
		    System.out.println("modificar -> Codigo de respuesta: " + e.getStatusCode());
		    return false;
		}
	}
	
	public boolean borrar(int id){
		try {
			restTemplate.delete(URL + id);
			return true;
		} catch (HttpClientErrorException e) {
			System.out.println("borrar -> La persona NO se ha borrar, id: " + id);
		    System.out.println("borrar -> Codigo de respuesta: " + e.getStatusCode());
		    return false;
		}
	}
	
	public List<Videojuego> listar(String nombre){
		String queryParams = "";		
		if(nombre != null) {
			queryParams += "?nombre=" + nombre;
		}
		
		try {
			ResponseEntity<Videojuego[]> response =
					  restTemplate.getForEntity(URL + queryParams,Videojuego[].class);
			Videojuego[] arrayPersonas = response.getBody();
			return Arrays.asList(arrayPersonas);
		} catch (HttpClientErrorException e) {
			System.out.println("listar -> Error al obtener la lista de personas");
		    System.out.println("listar -> Codigo de respuesta: " + e.getStatusCode());
		    return null;
		}
	}
}
