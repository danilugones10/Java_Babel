package es.curso.persistencia;

import java.util.ArrayList;

import es.curso.entity.Cliente;

public interface DaoCliente {
	int insertar(Cliente p);	
	int modificar(Cliente p);	
	int borrar(int id);	
	Cliente buscar(int id);	
	ArrayList<Cliente> listar();
}
