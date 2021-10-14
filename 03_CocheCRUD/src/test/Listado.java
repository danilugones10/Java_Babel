package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Listado {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";
		
		// Paso 2: Interactuar con la BD 
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);){
			PreparedStatement sentencia = con.prepareStatement("SELECT * FROM COCHE");
			ResultSet rs = sentencia.executeQuery();//no cambia registros, se usa para consultas
			while (rs.next()) {//preguntamos si hay mas filas
				System.out.print(rs.getInt("ID"));//DAME EL VALOR DE LA COLUMNA ID
				System.out.print(" - "); 
				System.out.print(rs.getString("MARCA"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("A�OS"));
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
