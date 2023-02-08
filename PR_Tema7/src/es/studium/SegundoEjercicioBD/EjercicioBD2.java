package es.studium.SegundoEjercicioBD;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjercicioBD2 implements ActionListener, WindowListener{

	Frame window = new Frame("Ejercicio 2 BD");
	Label lblNombreEmpleado = new Label ("Nombre");
	Label lblIdEmpleado = new Label ("idEmpleado");
	Label lblSalarioEmpleado = new Label ("Salario");
	TextArea txtAreaInfo = new TextArea (10, 40);
	Button btnVolver = new Button ("Volver");

	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/empresa";
	String login = "root";
	String password = "Studium2022;";
	String sentence = "SELECT * FROM empleados";

	Connection connection = null; // Objeto connection para establecer conexión.
	Statement statement = null; // Permite sentencias sql
	ResultSet rs = null; // Array con el resultado extraido de la BD.


	EjercicioBD2() {
		// Create distribution
		window.setLayout(new FlowLayout());

		window.add(lblNombreEmpleado);
		window.add(lblIdEmpleado);
		window.add(lblSalarioEmpleado);
		window.add(txtAreaInfo);
		window.add(btnVolver);

		txtAreaInfo.setEditable(false);
		btnVolver.addActionListener(this);

		window.setSize(350, 300); 
		window.setBackground(Color.orange);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.addWindowListener(this);

		try {
			Class.forName(driver); // Cargando en nuestro proyecto el driver nativo.
			// Establecer la conexión con la BD Empresa
			connection = DriverManager.getConnection(url, login, password);
			// Crear una sentencia
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			// Crear un objeto ResultSet para guardar lo obtenido
			// y ejecutar la sentencia SQL
			rs = statement.executeQuery(sentence);
			while (rs.next())
			{
				txtAreaInfo.setText(txtAreaInfo.getText() + rs.getString("nombreEmpleado"));
				txtAreaInfo.setText(txtAreaInfo.getText() + rs.getString("idEmpleado"));
				txtAreaInfo.setText(txtAreaInfo.getText() + rs.getString("salarioEmpleado") + " €\n");
				// String format
			}


		} catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		}
		window.setVisible(true);
	}




	public static void main(String[] args) {
		new EjercicioBD2();
	}


	@Override
	public void windowOpened(WindowEvent e) {
	}
	@Override
	public void windowClosing(WindowEvent ee) {
		System.out.println("Application has been closed.");
		System.exit(0);
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
		if (e.getSource().equals(btnVolver)) {
			
				System.exit(0);
		}
	}
}