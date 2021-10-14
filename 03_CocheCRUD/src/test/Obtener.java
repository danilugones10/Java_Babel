package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Obtener {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";
		
		// Paso 2: Interactuar con la BD 
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){
			PreparedStatement sentencia = con.prepareStatement("SELECT * FROM COCHE WHERE ID=0");
//			sentencia.setInt(1, 3);
			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("ID"));
				System.out.print(" - "); 
				System.out.print(rs.getString("MARCA"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("AÑOS"));
				System.out.print(" - "); 
				System.out.print(rs.getDouble("KM"));
				System.out.println(); // Retorno de carro
			}
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}

	}

}
