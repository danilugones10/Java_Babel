package es.curso.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.curso.entity.Pedido;

@Repository
public class DaoCrearTablaPedido implements DaoPedido{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DaoPedidoRowMapper pedidoRowMapper;
	
	@Override
	public int insertar(Pedido p) {
		String query = "insert into pedido (FECHA, IMPORTE) values (?, ?)";
		
		//Le pasamos la query y los valores de las "?" en orden
		int id = jdbcTemplate.update(query,
				p.getFecha(),
				p.getImporte()
			);
		
		return id;		
	}
	
	@Override
	public int modificar(Pedido p) {
		String query = "update pedido SET FECHA=?, IMPORTE=? where id=?";
		
		//Al final el update sive para modificar la BBDD
		int id = jdbcTemplate.update(query,
				p.getFecha(),
				p.getImporte(),
				p.getId()
			);
		
		return id;
	}
	
	@Override
	public int borrar(int id) {
		String query = "delete from pedido where id=?";
		return jdbcTemplate.update(query, id);
	}
	
	@Override
	public Pedido buscar(int id) {
		String query = "select * from pedido where id=?";
		
		Pedido pedido = null;
		
		try {
			pedido = jdbcTemplate.queryForObject(query, pedidoRowMapper,id);
		}catch(EmptyResultDataAccessException e) {
			//Este tipo de excepciones ocurren cuando esperamos un objeto y nos devuelve
			//0.
			System.out.println("EmptyResultDataAccessException: " + e.getMessage());
		}
		
		return pedido;
		
	}
	
	@Override
	public List<Pedido> listar() {
		String query = "select * from pedido";
		//Como son varios elementos ejecutamos el metodo "query"
		return jdbcTemplate.query(query, pedidoRowMapper);
	}
	
	public void crearTablaPedido() {
		jdbcTemplate.execute("CREATE TABLE pedido (" + 
				"id int NOT NULL AUTO_INCREMENT," + 
				"fecha date," + 
				"importe int," +  
				"PRIMARY KEY (id)" + 
				"); ");
	}
}
