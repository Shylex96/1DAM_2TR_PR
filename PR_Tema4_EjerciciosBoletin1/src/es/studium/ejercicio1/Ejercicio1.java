package es.studium.ejercicio1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1
{

	// Atributos:
	Frame window = new Frame("Horas");
	Label lblHH1 = new Label("HH");
	Label lblHH2 = new Label("HH");
	Label lblMM1 = new Label("MM");
	Label lblMM2 = new Label("MM");
	TextField txtSpace1 = new TextField(10);
	TextField txtSpace2 = new TextField(10);
	TextField txtSpace3 = new TextField(10);
	TextField txtSpace4 = new TextField(10);
	Button btnAceptar = new Button("Calcular");
	TextField txtSpace5 = new TextField(10);
	

	Ejercicio1() 
	{
		
		window.setSize(400, 130);
		window.setLayout(new GridLayout(3, 4)); 
		window.add(lblHH1);
		window.add(txtSpace1);
		window.add(lblMM1);
		window.add(txtSpace3);
		window.add(lblHH2);
		window.add(txtSpace2);
		window.add(lblMM2);
		window.add(txtSpace4);
		
		txtSpace5.setEnabled(false);
		//txtSpace5.setEditable(false); <--- Haría lo mismo que el setEnable pero dejaría clicar el campo.
		window.add(btnAceptar);
		window.add(txtSpace5);

		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio1();

	}

}
