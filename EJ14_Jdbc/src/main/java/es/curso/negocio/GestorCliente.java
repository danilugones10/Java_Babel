package es.curso.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.entity.Cliente;
import es.curso.persistencia.DaoCliente;

@Service
public class GestorCliente {

	@Autowired
	DaoCliente daoCliente;
	
	public int insertar(Cliente c) {
		return daoCliente.insertar(c);
	}
	
	public int modificar(Cliente c) {
		return daoCliente.modificar(c);
		
	}
	
	public int borrar(int id) {
		return daoCliente.borrar(id);
	}
	
	public Cliente buscar(int id) {
		return daoCliente.buscar(id);
	}
	
	public List<Cliente> listar(){
		return daoCliente.listar();
	}
}
