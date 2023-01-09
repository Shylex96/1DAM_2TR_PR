package es.studium.Ejemplo7;
import java.awt.*;

public class Ejemplo7 {

	Frame ventana = new Frame("Opción múltiple");
	//En este caso, se pueden elegir todas las opciones que queramos.
	Checkbox chkUno = new Checkbox("Opción Uno");
	Checkbox chkDos = new Checkbox("Opción Dos");
	Checkbox chkTres = new Checkbox("Opción Tres");

	public Ejemplo7()
	{
		ventana.setLayout(new FlowLayout());
		ventana.add(chkUno);
		ventana.add(chkDos);
		ventana.add(chkTres);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(100,150);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejemplo7();
	}

}
