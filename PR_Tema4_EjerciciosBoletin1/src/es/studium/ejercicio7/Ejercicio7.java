package es.studium.ejercicio7;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class Ejercicio7 {

	Frame ventana = new Frame("Lista");
	List Lista = new List(5, false);
	String[] equipos = { "Seleccione un equipo", "Real Madrid", "Barça", "Iberoestar Tenerife", "TD Systems Baskonia",
			"Hereda San Pablo Burgos", "Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia",
			"Baxi Manresa", "MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro", "Movistar Estudiantes",
			"Casademont Zaragoza", "Urbas Fuenlabrada", "Coosur Real Betis", "RETAbet Bilbao Basket",
			"Acunsa Gipuzkoa Basket" };

	public Ejercicio7() 
	{
		ventana.setLayout(new FlowLayout());
		// Añadir elementos a la lista:
		for (String equipo: equipos)
		{
			Lista.add(equipo);
		}
		ventana.add(Lista);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(200, 150);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio7();
	}

}
