package es.curso.modelo.persistencia;

import java.util.List;

import es.curso.modelo.entidad.Coche;


public interface DaoCoche {
	int alta(Coche p);
	int baja(int id);
	Coche modificar(Coche p);
	Coche obtener(int id);
	List<Coche> listar();

}
