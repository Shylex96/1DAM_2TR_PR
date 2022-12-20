package es.studium.CuartoEjemplo;
import java.awt.Button;
import java.awt.Color;
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
		window.setBackground(Color.cyan);
		window.setLayout(null);
		lblNombre.setBounds(30, 50, 50, 20); 
		// Primer número es la 'x' (izquierda hacia derecha), el segundo número es la 'y' (arriba hacia abajo)
		// Tercer número es el ancho y el cuarto número es el alto.
		window.add(lblNombre);
		txtNombre.setBounds(85, 50, 105, 20);
		window.add(txtNombre);
		btnAceptar.setBounds(200, 43, 50, 30);
		window.add(btnAceptar);
		
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{	
		new CuartoEjemplo();
	}

}
