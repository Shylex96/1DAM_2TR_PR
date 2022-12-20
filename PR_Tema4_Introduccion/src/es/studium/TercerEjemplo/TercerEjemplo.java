package es.studium.TercerEjemplo;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TercerEjemplo
{
	// Atributos:
	Frame window = new Frame();
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20); // El número indica el ancho del cuadro de texto, no el número de caracteres.
	
	TercerEjemplo()
	{
		window.setTitle("Componentes");
		window.setSize(500, 300);
		window.setLayout(new FlowLayout());
//		lblNombre.setLocation(200, 300);
		window.setBackground(Color.cyan);
		window.add(lblNombre);
		window.add(txtNombre);
		window.add(btnAceptar);
		
//		window.setLocationRelativeTo(null);
//		window.setResizable(false);

		window.setVisible(true);
	}
		
		

	public static void main(String[] args)
	{
		new TercerEjemplo();
	}

}
