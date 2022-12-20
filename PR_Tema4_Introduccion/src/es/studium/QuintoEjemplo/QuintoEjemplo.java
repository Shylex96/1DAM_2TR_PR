package es.studium.QuintoEjemplo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class QuintoEjemplo
{

	// Atributos:
	Frame window = new Frame("GridLayout");
	Button btnAceptar = new Button("Aceptar");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);
	
	QuintoEjemplo() 
	{
		window.setSize(500, 70);
		window.setBackground(Color.cyan);
		window.setLayout(new GridLayout(1, 3)); 
		// 2 Filas y 3 Columnas
		window.add(lblNombre);
		window.add(txtNombre);
		window.add(btnAceptar);
		
		
		
		
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{	
		new QuintoEjemplo();
	}

}