import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import entidad.Coche;
import negocio.GestorCoche;



public class testDao {

	Coche coche1 = new Coche("123456P","Ford","Focus",1000);
	Coche coche2 = new Coche("123456Ñ","Nissan","Gt",1000);
	GestorCoche gestor = new GestorCoche();
	
	
	@Test
	public void alta() {
		gestor.alta(coche1);
		Coche cocheRespuesta = gestor.obtener(coche1.getMatricula());
		assertEquals(coche1, cocheRespuesta);
	}
	
	@Test
	public void baja() {
		gestor.baja(coche1.getMatricula());
		Coche cocheRespuesta = gestor.obtener(coche1.getMatricula());
		assertNull(cocheRespuesta);
	}
	
	@Test
	public void modificar() {
		Coche cocheModificado = new Coche("123456P","Ford","Focus",1000);
		
		gestor.alta(coche1);
		gestor.modificar(cocheModificado);
		Coche cocheRespuesta = gestor.obtener(coche1.getMatricula());
		
		assertEquals(cocheModificado, cocheRespuesta);
	}

	@Test
	public void obtener() {
		Coche cocheRespuesta = gestor.obtener(coche1.getMatricula());
		assertEquals(coche1, cocheRespuesta);
	}

	@Test
	public void listar() {
		List <Coche> listaCoches = new ArrayList<Coche>();
		Coche c1 = new Coche("123456P","Ford","Focus",1000);
		Coche c2 = new Coche("123456Ñ","Nissan","Gt",1000);
		listaCoches.add(c1);
		listaCoches.add(c2);
		
		List <Coche> listaCochesRespuesta = gestor.listar();
		assertEquals(listaCoches, listaCochesRespuesta);
	}
}
