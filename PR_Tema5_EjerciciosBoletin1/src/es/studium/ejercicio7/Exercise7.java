package es.studium.ejercicio7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise7 implements ActionListener, WindowListener, ItemListener {

	Frame window = new Frame("Lista");
	Label lblComunidades = new Label("Ciudad correspondiente:");
	TextField comunidadResult = new TextField(20);
	List lista = new List(5, false);

	String[] Equipos = { "Seleccione un equipo", "Real Madrid", "Barça", "Iberoestar Tenerife", "TD Systems Baskonia",
			"Hereda San Pablo Burgos", "Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia",
			"Baxi Manresa", "MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro", "Movistar Estudiantes",
			"Casademont Zaragoza", "Urbas Fuenlabrada", "Coosur Real Betis", "RETAbet Bilbao Basket",
	"Acunsa Gipuzkoa Basket" };

	String[] Comunidades = { "Seleccione una comunidad", "Andalucía", "Aragón", "Canarias", "Cantabria",
			"Castilla y León", "Castilla-La Mancha", "Cataluña", "Ceuta", "Comunidad Valenciana", "Comunidad de Madrid",
			"Extremadura", "Galicia", "Islas Baleares", "La Rioja", "Melilla", "Navarra", "País Vasco",
			"Principado de Asturias", "Región de Murcia" };

	public Exercise7() {

		window.setLayout(new FlowLayout());
		window.add(lblComunidades);
		window.add(comunidadResult);
		comunidadResult.setEditable(false);

		for (int i = 0; i < Equipos.length; i++) 
		{
			lista.add(Equipos[i]);	
		}

		window.add(lista);

		lista.addItemListener(this);
		window.addWindowListener(this);
		window.setSize(240, 200); 
		window.setVisible(true);
		window.setLocationRelativeTo(null); 
		window.setBackground(Color.CYAN);

	}

	public static void main(String[] args) {
		new Exercise7();

	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Application has been closed.");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void actionPerformed(ActionEvent e) {}
	@Override
	public void itemStateChanged(ItemEvent e) {
		int index = lista.getSelectedIndex();
		comunidadResult.setText(Comunidades[index]);
	}

}