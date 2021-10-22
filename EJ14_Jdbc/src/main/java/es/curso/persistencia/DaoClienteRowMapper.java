package es.curso.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import es.curso.entity.Cliente;
import es.curso.entity.Pedido;

@Component
public class DaoClienteRowMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cliente p = new Cliente();
		p.setId(rs.getInt("ID"));
		p.setNombre(rs.getString("NOMBRE"));
		p.setEdad(rs.getInt("EDAD"));
		p.setListaPedidos((Pedido) rs.getArray("LISTAPEDIDOS"));
		return p;
	}

}
