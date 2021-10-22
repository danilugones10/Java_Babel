package es.curso.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import es.curso.entity.Pedido;

@Component
public class DaoPedidoRowMapper implements RowMapper<Pedido>{

	@Override
	public Pedido mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pedido p = new Pedido();
		p.setId(rs.getInt("ID"));
		p.setFecha(rs.getDate("FECHA"));
		p.setImporte(rs.getInt("IMPORTE"));
		return p;
	}

}
