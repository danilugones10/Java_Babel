package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidad.Coche;
import persistencia.interfaces.DaoCoche;

public class PersonalDaoMySql implements DaoCoche{
private Connection conexion;
	
	public boolean abrirConexion(){
		String url = "jdbc:mysql://localhost:3306/coches";
		String usuario = "root";
		String password = "";
		try {
			conexion = DriverManager.getConnection(url,usuario,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean cerrarConexion(){
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
	public boolean alta(Coche p) {
		if(!abrirConexion()){
			return false;
		}
		boolean alta = true;
		
		String query = "insert into coche (MATRICULA,MARCA,MODELO, KM) "
				+ " values(?,?,?,?)";
		try {
			//preparamos la query con valores parametrizables(?)
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, p.getMatricula());
			ps.setString(2, p.getMarca());
			ps.setString(3, p.getModelo());
			ps.setInt(4, p.getKm());
			
			int numeroFilasAfectadas = ps.executeUpdate();
			if(numeroFilasAfectadas == 0) {
				alta = false;
			}
		} catch (SQLException e) {
			System.out.println("alta -> Error al insertar: " + p);
			alta = false;
			e.printStackTrace();
		} finally{
			cerrarConexion();
		}
		
		return alta;
	}

	public boolean baja(String matricula) {
		if(!abrirConexion()){
			return false;
		}
		
		boolean borrado = true;
		String query = "delete from coche where matricula = ?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			//sustituimos la primera interrgante por la id
			ps.setString(1, matricula);
			
			int numeroFilasAfectadas = ps.executeUpdate();
			if(numeroFilasAfectadas == 0)
				borrado = false;
		} catch (SQLException e) {
			System.out.println("baja -> No se ha podido dar de baja"
					+ " el matricula " + matricula);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return borrado; 
	}

	public boolean modificar(Coche p) {
		if(!abrirConexion()){
			return false;
		}
		boolean modificado = true;
		String query = "update coche set MARCA=?, MODELO=?, "
				+ "KM=? WHERE MATRICULA=?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, p.getMarca());
			ps.setString(2, p.getModelo());
			ps.setInt(3, p.getKm());
			ps.setString(4, p.getMatricula());
			
			int numeroFilasAfectadas = ps.executeUpdate();
			if(numeroFilasAfectadas == 0)
				modificado = false;
			else
				modificado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("modificar -> error al modificar el "
					+ " coche " + p);
			modificado = false;
			e.printStackTrace();
		} finally{
			cerrarConexion();
		}
		
		return modificado;
	}

	public Coche obtener(String matricula) {
		if(!abrirConexion()){
			return null;
		}		
		Coche persona = null;
		
		String query = "select MATRICULA,MARCA,MODELO,KM from coche "
				+ "where matricula = ?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, matricula);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				persona = new Coche();
				persona.setMatricula(rs.getString(1));
				persona.setMarca(rs.getString(2));
				persona.setModelo(rs.getString(3));
				persona.setKm(rs.getInt(4));
			}
		} catch (SQLException e) {
			System.out.println("obtener -> error al obtener el "
					+ "coche con matricula " + matricula);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		
		
		return persona;
	}

	public List<Coche> listar() {
		if(!abrirConexion()){
			return null;
		}		
		List<Coche> listaPersonas = new ArrayList<Coche>();
		
		String query = "select MATRICULA,MARCA,MODELO,KM from coche";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Coche coche = new Coche();
				coche.setMatricula(rs.getString(1));
				coche.setMarca(rs.getString(2));
				coche.setModelo(rs.getString(3));
				coche.setKm(rs.getInt(4));
				
				listaPersonas.add(coche);
			}
		} catch (SQLException e) {
			System.out.println("listar -> error al obtener las "
					+ "personas");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		
		
		return listaPersonas;
	}

}
