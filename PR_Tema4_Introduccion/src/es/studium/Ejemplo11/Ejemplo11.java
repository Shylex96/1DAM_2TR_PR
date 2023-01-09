package es.studium.Ejemplo11;
import java.awt.*;

public class Ejemplo11 {

	Frame ventana = new Frame("“AwtScrollbar");
	Scrollbar scrVertical = new Scrollbar(Scrollbar.VERTICAL);
	Scrollbar scrHorizontal = new Scrollbar(Scrollbar.HORIZONTAL);

	public Ejemplo11() {
		ventana.setLayout(new BorderLayout());
		ventana.add("East", scrVertical);
		ventana.add("South", scrHorizontal);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(150, 150);
		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejemplo11();
	}

}
