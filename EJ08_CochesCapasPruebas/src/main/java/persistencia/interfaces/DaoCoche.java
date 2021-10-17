package persistencia.interfaces;

import java.util.List;

import entidad.Coche;


public interface DaoCoche {
	boolean alta(Coche p);
	boolean baja(String matricula);
	boolean modificar(Coche p);
	Coche obtener(String matricula);
	List<Coche> listar();

}
