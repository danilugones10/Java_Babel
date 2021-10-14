package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertar {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";
		
		// Paso 2: Interactuar con la BD 
		// try-catch-resource statement. Esto nos ahorra codigo en java ya que
		// los objetos que creemos dentro de los parentesis del try, se ejecutara
		// su metodo close() siempre, cuando salgamos del bloque try-catch, es decir
		// no haría falta poner el bloque finally cerrando las conexiones
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){
			//esta es la manera que hay que hacer si quereis aprobar
			//porque? De momento ganamos en claridad, es mas visual
			String sql = "INSERT INTO COCHE (ID, MARCA, AÑOS, KM) VALUES (?, ?, ?, ?)"; 
			// en vez de poner los valores ponemos interrogantes
			
			int id=2;
			String marca = "Audi";
			int años = 2;
			double km = 1000;
			
			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);
			
			//Notese que usamos PreparedStatement en vez de Statement
			PreparedStatement sentencia;
			sentencia = con.prepareStatement(sql);
			//por un lado mandamos la sql, y por otro mandamos los parametros
			//que la bbdd tiene que sustituir por las "?"
			sentencia.setInt(1, id);
			sentencia.setString(2, marca);//decimos que la primera "?" que se encuentre le ponga el nombre
			sentencia.setInt(3, años);//
			sentencia.setDouble(4, km);
			
			//Ejecutamos la query
			int afectados = sentencia.executeUpdate();
			System.out.println("Sentencia SQL ejecutada con éxito");
			System.out.println("Registros afectados: "+afectados);
			//con.close()
		} catch (SQLException e) {
			System.out.println("Error al añadir una nueva persona");
			System.out.println(e.getMessage());
		}

	}

}
