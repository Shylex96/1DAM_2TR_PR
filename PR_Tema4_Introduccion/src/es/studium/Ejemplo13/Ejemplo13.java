package es.studium.Ejemplo13;

import java.awt.*;

public class Ejemplo13 {

	Frame ventana = new Frame("AwtTextArea");
	// Crear un TextArea vacío con tamaño 5 filas y 20 columnas
	TextArea areaTexto = new TextArea("", 15, 40);

	public Ejemplo13() {
		ventana.setLayout(new FlowLayout());
		ventana.add(areaTexto);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 400);
		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejemplo13();
	}

}
