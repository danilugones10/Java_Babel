package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Modificar {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";
			
		// Paso 2: Interactuar con la BD 
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);){
			
			String sql = "update coche set MARCA=?, AÑOS=?, KM=? WHERE ID=?";
			
			String marca = "Fiat";
			int años = 6;
			double km = 89007;
			int id = 0;
			
			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);
			
			PreparedStatement sentencia = con.prepareStatement(sql);
			
			sentencia.setString(1, marca);
			sentencia.setInt(2, años);
			sentencia.setDouble(3, km);
			sentencia.setInt(4, id);
			
			//como estamos cambiando datos de la BBDD, hacemos un executeUpdate
			int afectados = sentencia.executeUpdate();
			System.out.println("Sentencia SQL ejecutada con éxito");
			System.out.println("Registros afectados: "+afectados);
		} catch (SQLException e) {
			System.out.println("Error al añadir nuevo cliente");
			System.out.println(e.getMessage());
			
		}		

	}

}
