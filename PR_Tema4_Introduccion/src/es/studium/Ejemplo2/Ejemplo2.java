package es.studium.Ejemplo2;
import java.awt.Color;
import java.awt.Frame;
import java.util.Random;

public class Ejemplo2
{
	
	// Atributos:
	Color colores[] = { Color.red, Color.green, Color.magenta, Color.blue, Color.yellow};
	Random aleatorio = new Random();
	
	Ejemplo2()
	{
		Frame window = new Frame();
		window.setBackground(colores[aleatorio.nextInt(colores.length)]);
		window.setSize(300, 300);
		window.setLocation(aleatorio.nextInt(1000), aleatorio.nextInt(1000));
		window.setResizable(false);
		
		window.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		final int CANTIDAD = 500;
		
		for (int i = 0; i < CANTIDAD; i++) 
		{
			new Ejemplo2();
		}

	}

}
