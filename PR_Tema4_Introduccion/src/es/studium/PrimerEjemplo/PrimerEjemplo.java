package es.studium.PrimerEjemplo;
import java.awt.Color;
import java.awt.Frame;

public class PrimerEjemplo
{	
	// Atributos:
	Frame window = new Frame("Título del programa");

	PrimerEjemplo()
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
		new PrimerEjemplo();
	}

}
