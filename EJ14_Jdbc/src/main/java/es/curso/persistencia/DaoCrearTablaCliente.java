package es.curso.persistencia;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.curso.entity.Cliente;

@Repository
public class DaoCrearTablaCliente implements DaoCliente{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DaoClienteRowMapper clienteRowMapper;
	
	@Override
	public int insertar(Cliente p) {
		String query = "insert into cliente (EDAD, NOMBRE, PEDIDO_ID) values (?, ?, ?)";
		
		//Le pasamos la query y los valores de las "?" en orden
		int id = jdbcTemplate.update(query,
				p.getEdad(),
				p.getNombre(),
				p.getPedido_id()
			);
		
		return id;	
	}

	@Override
	public int modificar(Cliente p) {
		String query = "update cliente SET EDAD=?, NOMBRE=?, PEDIDO_ID=? where id=?";
		
		//Al final el update sive para modificar la BBDD
		int id = jdbcTemplate.update(query,
				p.getEdad(),
				p.getNombre(),
				p.getPedido_id(),
				p.getId()
			);
		
		return id;
	}

	@Override
	public int borrar(int id) {
		String query = "delete from cliente where id=?";
		return jdbcTemplate.update(query, id);
	}

	@Override
	public Cliente buscar(int id) {
		String query = "select * from cliente where id=?";
		
		Cliente cliente = null;
		
		try {
			cliente = jdbcTemplate.queryForObject(query, clienteRowMapper,id);
		}catch(EmptyResultDataAccessException e) {
			//Este tipo de excepciones ocurren cuando esperamos un objeto y nos devuelve
			//0.
			System.out.println("EmptyResultDataAccessException: " + e.getMessage());
		}
		
		return cliente;
	}

	@Override
	public ArrayList<Cliente> listar() {
		String query = "select * from cliente";
		//Como son varios elementos ejecutamos el metodo "query"
		return (ArrayList<Cliente>) jdbcTemplate.query(query, clienteRowMapper);
	}
	
	public void crearTablaCliente() {
		jdbcTemplate.execute("CREATE TABLE cliente (" + 
				"id int NOT NULL AUTO_INCREMENT," + 
				"edad int," + 
				"nombre varchar(255)," +  
				"pedido_id int," +
				"PRIMARY KEY (id)," + 
				"FOREIGN KEY (pedido_id) REFERENCES pedido(id)" + 
				"); ");
	}

}
