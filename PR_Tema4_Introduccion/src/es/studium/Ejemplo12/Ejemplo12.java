package es.studium.Ejemplo12;

import java.awt.*;

public class Ejemplo12 {

	Frame ventana = new Frame("AwtTextField");
	// Crear un TextField con 20 de ancho
	TextField txtTexto = new TextField(20);

	public Ejemplo12() {
		ventana.setLayout(new FlowLayout());
		ventana.add(txtTexto);
		txtTexto.requestFocus();
		ventana.setLocationRelativeTo(null);
		ventana.setSize(250, 100);
		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejemplo12();
	}

}

