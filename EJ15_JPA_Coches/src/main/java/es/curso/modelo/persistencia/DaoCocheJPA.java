package es.curso.modelo.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import es.curso.modelo.entidad.Coche;

@Repository
public class DaoCocheJPA implements DaoCoche {

	@PersistenceContext
	private EntityManager em;

	@Override
	public int alta(Coche p) {
		em.persist(p);
		return p.getId();
	}

	@Override
	public int baja(int id) {
		Coche pAux = em.find(Coche.class, id);
		em.remove(pAux);
		return pAux.getId();
	}

	@Override
	public Coche modificar(Coche p) {
		return em.merge(p);
	}

	@Override
	public Coche obtener(int id) {
		return em.find(Coche.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Coche> listar() {
		List<Coche> listaPeliculas = em.createQuery("from Coche p").getResultList();
		return listaPeliculas;
	}

}
