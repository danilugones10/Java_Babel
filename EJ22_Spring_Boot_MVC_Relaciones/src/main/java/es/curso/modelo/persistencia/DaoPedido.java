package es.curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.modelo.entidad.Pedidos;

public interface DaoPedido extends JpaRepository<Pedidos, Integer>{

}
