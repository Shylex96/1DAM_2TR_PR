package es.studium.ejercicio3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio3
{

	// Atributos:
	Frame window = new Frame("Calcular el IVA");
	Label lbltext1 = new Label("Introduzca la cantidad");
	Label lbltext2 = new Label("Introduzca el porcentaje");
	TextField txtSpace1 = new TextField(10);
	TextField txtSpace2 = new TextField(10);
	Button btnCalcular = new Button("Calcular");
	Label lbltext3 = new Label("Resultado");
	Button btnFahtoCel = new Button("Fahrenheit a Celsius ");
	TextField txtSpace3 = new TextField(10);

	Ejercicio3() 
	{
		
		window.setSize(1000, 70);
		window.setLayout(new GridLayout(1, 7)); 
		
		window.add(lbltext1);
		window.add(txtSpace1);
		
		window.add(lbltext2);
		window.add(txtSpace2);
		window.add(btnCalcular);
		
		window.add(lbltext3);
		window.add(txtSpace3);
		
		txtSpace3.setEnabled(false);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio3();

	}

}
