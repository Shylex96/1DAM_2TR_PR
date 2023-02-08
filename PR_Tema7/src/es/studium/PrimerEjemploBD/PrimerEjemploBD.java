package es.studium.PrimerEjemploBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimerEjemploBD 
{
	public static void main(String[] args) 
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/empresa";
		String login = "root";
		String password = "Studium2022;";
		String sentence = "SELECT * FROM empleados";

		Connection connection = null; // Objeto connection para establecer conexión.
		Statement statement = null; // Permite sentencias sql
		ResultSet rs = null; // Array con el resultado extraido de la BD.

		try {
			Class.forName(driver); // Cargando en nuestro proyecto el driver nativo.
			// Establecer la conexión con la BD Empresa
			connection = DriverManager.getConnection(url, login, password);
			// Crear una sentencia
			statement = connection.createStatement();
			// Crear un objeto ResultSet para guardar lo obtenido
			// y ejecutar la sentencia SQL
			rs = statement.executeQuery(sentence);
			while (rs.next())
			{
				System.out.println(rs.getString("nombreEmpleado") + " - " + rs.getString("salarioEmpleado") + "€");
			} 

		} catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		}
		finally
		{
			try
			{
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch (SQLException e)
			{
				System.out.println("Error 3-"+e.getMessage());
			}
		}
	}
}

