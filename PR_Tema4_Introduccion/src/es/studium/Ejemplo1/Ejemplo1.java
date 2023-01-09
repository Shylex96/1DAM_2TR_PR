package es.studium.Ejemplo1;
import java.awt.Color;
import java.awt.Frame;

public class Ejemplo1
{	
	// Atributos:
	Frame window = new Frame("T�tulo del programa");

	Ejemplo1()
	{
		// window.setTitle("Título");
		window.setSize(500, 500);
		window.setBackground(Color.DARK_GRAY);
		window.setLocationRelativeTo(null);
		window.setResizable(false);

		window.setVisible(true); // Siempre al final.
	}

	public static void main(String[] args)
	{
		new Ejemplo1();
	}

}
