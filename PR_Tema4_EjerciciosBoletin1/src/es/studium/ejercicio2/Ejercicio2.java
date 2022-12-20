package es.studium.ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio2
{
		// Atributos:
		Frame window = new Frame("Conversión de Temperaturas");
		Label lblCelsius = new Label("Celsius");
		Label lblFahrenheit = new Label("Fahrenheit");
		TextField txtSpace1 = new TextField(10);
		TextField txtSpace2 = new TextField(10);
		Button btnCeltoFah = new Button("Celsius a Fahrenheit");
		Button btnFahtoCel = new Button("Fahrenheit a Celsius ");
		
		Ejercicio2() 
		{
			
			window.setSize(400, 130);
			window.setLayout(new GridLayout(3, 2)); 
			window.add(lblCelsius);
			window.add(txtSpace1);
			window.add(lblFahrenheit);
			window.add(txtSpace2);
			window.add(btnCeltoFah);
			window.add(btnFahtoCel);

			window.setResizable(false);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
		}
	
	public static void main(String[] args)
	{
		new Ejercicio2();

	}

}
