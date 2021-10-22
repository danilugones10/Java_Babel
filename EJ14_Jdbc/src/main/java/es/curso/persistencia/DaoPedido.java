package es.curso.persistencia;

import java.util.List;

import es.curso.entity.Pedido;

public interface DaoPedido {
	int insertar(Pedido p);	
	int modificar(Pedido p);	
	int borrar(int id);	
	Pedido buscar(int id);	
	List<Pedido> listar();
}
