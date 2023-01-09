package es.studium.Ejemplo9;

import java.awt.*;

public class Ejemplo9 {

	Frame ventana = new Frame("NovenoEjemplo");
	Choice choLista = new Choice();

	public Ejemplo9() {
		ventana.setLayout(new FlowLayout());
		// Añadir elementos a la lista:
		choLista.add("Seleccionar..");
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
		// Añadir la lista:
		ventana.add(choLista);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(100, 120);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejemplo9();
	}

}
