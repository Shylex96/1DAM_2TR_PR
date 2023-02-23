package es.studium.incidencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Hay que tener en cuenta que esto es para la conexión 
// de la base de datos, no de los usuarios del programa.

public class Conexion {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/incidencias";
	String login = "userIncidencias";
	String password = "Studium2022;";
	String sentence = "";

	Connection connection = null; 
	Statement statement = null; 
	ResultSet rs = null; 

	Conexion() {
		connection = this.conectar();
	}

	public Connection conectar() {
		
		try {
			Class.forName(driver);
			return(DriverManager.getConnection(url, login, password));
		}
		catch (ClassNotFoundException cnfe){
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle) {
			System.out.println("Error 2-"+sqle.getMessage());
		}
		return null;
	}

	public boolean comprobarCredenciales(String u, String c) {

		String cadena = "SELECT * FROM usuarios WHERE nombreUsuario = '"+ u + "' AND claveUsuario = SHA2('"+c+"',256);";
		
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = statement.executeQuery(cadena);
			
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
				
			
		} catch (SQLException sqle) {
			System.out.println("Error 3-"+sqle.getMessage());
		}
		return false;
	}

	public int altaUsuario(String sentencia) {
		try {
			
			// Crear una sentencia
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			statement.executeUpdate(sentencia);
			return 0;
			
			} catch (SQLException sqle) {
				System.out.println("Error 4-"+sqle.getMessage());
				return 1;
			}
	}
}
