package es.curso.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.entity.Pedido;
import es.curso.persistencia.DaoPedido;

@Service
public class GestorPedido {
	
	@Autowired
	DaoPedido daoPedido;
	
	public int insertar(Pedido p) {
		return daoPedido.insertar(p);
	}
	
	public int modificar(Pedido p) {
		return daoPedido.modificar(p);
		
	}
	
	public int borrar(int id) {
		return daoPedido.borrar(id);
	}
	
	public Pedido buscar(int id) {
		return daoPedido.buscar(id);
	}
	
	public List<Pedido> listar(){
		return daoPedido.listar();
	}
}
