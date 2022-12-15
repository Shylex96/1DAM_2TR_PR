package es.studium.CuartoEjemplo;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class CuartoEjemplo
{
	
	// Atributos:
	Frame window = new Frame("Absoluto");
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);
	
	CuartoEjemplo() 
	{
		window.setSize(500, 300);
		lblNombre.setLocation(300, 50);
		window.add(lblNombre);
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		
		new CuartoEjemplo();

	}

}
