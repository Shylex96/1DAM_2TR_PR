package es.studium.Ejemplo10;

import java.awt.*;

public class Ejemplo10 {

	Frame ventana = new Frame("AwtList");
	// Creación de una lista con 4 elementos visibles y que no
	// permite multiselección
	List lista = new List(4, false);

	public Ejemplo10() {
		ventana.setLayout(new FlowLayout());
		lista.add("Blanco");
		lista.add("Rojo");
		lista.add("Azul");
		lista.add("Verde");
		lista.add("Amarillo");
		lista.add("Naranja");
		ventana.add(lista);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(150, 150);
		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejemplo10();
	}

}
