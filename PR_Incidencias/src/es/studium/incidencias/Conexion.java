package es.studium.incidencias;

import java.awt.Choice;
import java.awt.TextArea;
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

	public void rellenarListadoUsuarios(TextArea areaDatos) {
		String sentencia = "SELECT idUsuarios, nombreUsuario, correoUsuario FROM incidencias.usuarios;";
		try {

			// Crear una sentencia
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet resultado = statement.executeQuery(sentencia);
			while(resultado.next()) {
				// Append añade
				areaDatos.append(resultado.getString("idUsuarios")+"\t");
				areaDatos.append(resultado.getString("nombreUsuario")+"\n");
				areaDatos.append(resultado.getString("correoUsuario")+"\n----------------------------------------------------------\n");
			}

		} catch (SQLException sqle) {
			System.out.println("Error 5-"+sqle.getMessage());
		}
	}

	public void rellenarChoiceUsuarios(Choice choUsuarios) {
		choUsuarios.removeAll();
		String sentencia = "SELECT idUsuarios, nombreUsuario FROM incidencias.usuarios ORDER BY 1;";
		try {

			// Crear una sentencia
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet resultado = statement.executeQuery(sentencia);
			choUsuarios.add("Elegir usuario..");
			while(resultado.next()) {
				// Append añade
				choUsuarios.add(resultado.getString("idUsuarios")+"-"+resultado.getString("nombreUsuario"));
			}

		} catch (SQLException sqle) {
			System.out.println("Error 6-"+sqle.getMessage());
		}
	}

	public int borrarUsuario(String idUsuarios) {
		String sentencia = "DELETE FROM incidencias.usuarios WHERE idUsuarios = " + idUsuarios;
		// Crear una sentencia
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			statement.executeUpdate(sentencia);
			return 0;

		} catch (SQLException sqle) {
			System.out.println("Error 7-"+sqle.getMessage());
			return 1;

		}
	}

	public String getDatosEdicion(String idUsuarios)
	{
		String resultado = "";
		String sentencia = "SELECT * FROM usuarios WHERE idUsuarios = " + idUsuarios;
		try
		{
			// Crear una sentencia
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// Crear un objeto ResultSet para guardar lo obtenido
			// y ejecutar la sentencia SQL
			ResultSet resultSet = statement.executeQuery(sentencia);
			resultSet.next();
			resultado =(resultSet.getString("idUsuarios")+"-"+resultSet.getString("nombreUsuario")+"-"+resultSet.getString("claveUsuario")+"-"+resultSet.getString("correoUsuario"));
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 8-"+sqle.getMessage());
		}
		return resultado;
	}

	public int modificarUsuario(String sentencia)
	{
		try
		{
			// Crear una sentencia
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// Ejecutar la sentencia SQL
			statement.executeUpdate(sentencia);
			return 0;
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 9-"+sqle.getMessage());
			return 1;
		}
	}
}