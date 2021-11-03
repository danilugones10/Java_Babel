package es.curso.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import es.curso.modelo.entidad.Pedidos;
import es.curso.modelo.persistencia.DaoPedido;

public class GestorPedidos {

	@Autowired
	private DaoPedido daoPedido;
	
	@Transactional
	public int hacerPedido(Pedidos p) {
		return daoPedido.save(p).getId();
	}
}
