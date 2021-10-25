package es.curso.modelo.negocio;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.modelo.entidad.Coche;
import es.curso.modelo.persistencia.DaoCocheJPA;

@Service
public class GestorCoche {

	@Autowired
	private DaoCocheJPA cocheDao;
		
	@Transactional
	public int alta(Coche p) {
		if((p.getMatricula().length() == 7)&&(p.getMarca().length()>0)&&(p.getModelo().length()>0)) {
			return cocheDao.alta(p);
		}
		System.out.println("Error al dal de alta");
		return 0;
	}
	
	@Transactional
	public Coche modificar(Coche p) {
		if((p.getMatricula().length() == 7)&&(p.getMarca().length()>0)&&(p.getModelo().length()>0)) {
			return cocheDao.modificar(p);
		}
		System.out.println("Error al modificar");
		return p;
	}
	
	@Transactional
	public void baja(int id) {
		cocheDao.baja(id);
	}
	
	public Coche buscar(int id) {
		return cocheDao.obtener(id);
	}
	
	public List<Coche> listar(){
		return cocheDao.listar();
	}

}
