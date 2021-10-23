package es.curso.negocio;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.entity.Pedido;
import es.curso.persistencia.DaoPedido;

@Service
public class GestorPedido {
	
	Scanner teclado = new Scanner(System.in);
	
	@Autowired
	DaoPedido daoPedido;
	
	public int insertar(Pedido p) {
		System.out.println("Pedido insertado");
		return daoPedido.insertar(p);
	}
	
	public int modificar(Pedido p) {
		System.out.println("Pedido modificado");
		return daoPedido.modificar(p);
		
	}
	
	public int borrar(int id) {
		System.out.println("Pedido borrado");
		return daoPedido.borrar(id);
	}
	
	public Pedido buscar(int id) {
		return daoPedido.buscar(id);
	}
	
	public List<Pedido> listar(){
		return daoPedido.listar();
	}
}
