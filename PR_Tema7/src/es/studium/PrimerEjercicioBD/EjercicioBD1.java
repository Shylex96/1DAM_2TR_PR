package es.studium.PrimerEjercicioBD;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjercicioBD1 implements ActionListener, WindowListener{

	Frame window = new Frame("Ejercicio 1 BD");
	Label lblIdEmpleado = new Label ("idEmpleado");
	Label lblNombreEmpleado = new Label ("Nombre");
	Label lblSalarioEmpleado = new Label ("Salario");
	TextField txtIdEmpleado = new TextField(17);
	TextField txtNombreEmpleado = new TextField(20);
	TextField txtSalarioEmpleado = new TextField(21);
	Button btnPrevious = new Button ("Anterior");
	Button btnNext = new Button ("Siguiente");

	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/empresa";
	String login = "root";
	String password = "Studium2022;";
	String sentence = "SELECT * FROM empleados";

	Connection connection = null; // Objeto connection para establecer conexión.
	Statement statement = null; // Permite sentencias sql
	ResultSet rs = null; // Array con el resultado extraido de la BD.


	EjercicioBD1() {
		// Create distribution
		window.setLayout(new FlowLayout());

		window.add(lblIdEmpleado);
		window.add(txtIdEmpleado);
		window.add(lblNombreEmpleado);
		window.add(txtNombreEmpleado);
		window.add(lblSalarioEmpleado);
		window.add(txtSalarioEmpleado);
		window.add(btnPrevious);
		window.add(btnNext);
		
		txtIdEmpleado.setEditable(false);
		txtNombreEmpleado.setEditable(false);
		txtSalarioEmpleado.setEditable(false);

		txtIdEmpleado.addActionListener(this);
		txtNombreEmpleado.addActionListener(this);
		txtSalarioEmpleado.addActionListener(this);
		btnPrevious.addActionListener(this);
		btnNext.addActionListener(this);

		window.setSize(300, 200); 
		window.setBackground(Color.orange);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.addWindowListener(this);

		try {
			Class.forName(driver); // Cargando en nuestro proyecto el driver nativo.
			// Establecer la conexión con la BD Empresa
			connection = DriverManager.getConnection(url, login, password);
			// Crear una sentencia
			statement = connection.createStatement();
			// Crear un objeto ResultSet para guardar lo obtenido
			// y ejecutar la sentencia SQL
			rs = statement.executeQuery(sentence);
			rs.next();
			System.out.println(rs.getString("idEmpleado") + " " + rs.getString("nombreEmpleado")+ " " + rs.getString("salarioEmpleado"));
			txtIdEmpleado.setText(rs.getString("idEmpleado"));
			txtNombreEmpleado.setText(rs.getString("nombreEmpleado"));
			txtSalarioEmpleado.setText(rs.getString("salarioEmpleado"));
			

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
		window.setVisible(true);
	}




	public static void main(String[] args) {
		new EjercicioBD1();


	}


	@Override
	public void windowOpened(WindowEvent e) {
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Application has been closed.");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void actionPerformed(ActionEvent e) {

	}

}

