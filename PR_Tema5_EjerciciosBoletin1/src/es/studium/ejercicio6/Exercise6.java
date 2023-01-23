package es.studium.ejercicio6;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise6 implements ActionListener, WindowListener, ItemListener
{

	Frame window = new Frame("Provincias Españolas");
	Label lblgentilicios = new Label("Gentilicio correspondiente:");
	TextField gentelicioResult = new TextField(35);
	Choice choLista = new Choice();
	String[] provincias =
		{ "Seleccione una provincia", "Álava", "Albacete", "Alicante", "Almería", "Asturias", "Ávila", "Badajoz",
				"Barcelona", "Burgos", "Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña",
				"Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva", "Huesca", "Islas Baleares", "Jaén",
				"León", "Lérida", "Lugo", "Madrid", "Málaga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas",
				"Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
				"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };

	String[] gentilicios =
		{ "No ha elegido ninguna opción", "Alavés/Alavesa o Babazorro/rra", "Albaceteño/ña o Albacetense", "Alicantino/na",
				"Almeriense, Urcitano/na", "Asturiano/na, Astur", "Abulense, Avilés/esa",
				"Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", "Burgalés/esa", "Cacereño/ña",
				"Gaditano/na", "Cántabro/a", "Castellonense", "Ciudadrealeño/ña", "Cordobés/esa", "Coruñés", "Conquense",
				"Gerundense, Gironés/esa", "Granadino/na", "Guadalajarño/ña, Caracense, Arriacense", "Guipuzcoano/na",
				"Onubense", "Oscense", "Balear", "Jaenés/esa, Jaenero/ro, Jienense, Giennense", "Leonés/esa", "Leridano",
				"Lucense", "Madrileño/ña", "Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na",
				"Palmense", "Pontevedrés/esa", "Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense",
				"Soriano/na", "Tarracconense/a", "Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
				"Pucelano/na", "Vizcaíno/na", "Zamorano/na", "Zaragozano/na" };

	public Exercise6()
	{
		window.setLayout(new FlowLayout());
		window.add(lblgentilicios);
		window.add(gentelicioResult);
		gentelicioResult.setEditable(false);
		for (int i = 0; i < provincias.length; i++)
		{
			choLista.add(provincias[i]);
		}
		window.add(choLista);
		// No se puede añadir un ActionListener al objeto Choice.
		// choLista.addActionListener(this); 
		
		// En su lugar, se debe usar el método addItemListener para 
		// agregar un ItemListener al Choice. Esto hará que implementemos
		// ItemListener a la línea 15 y con ello, un nuevo @Override.
		// Se cambia el método actionPerformed a itemStateChanged.
		
		choLista.addItemListener(this);
		window.addWindowListener(this);
		window.setSize(330, 280);
		window.setVisible(true);
		window.setLocationRelativeTo(null);

	}

	public static void main(String[] args)
	{
		new Exercise6();
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
	public void itemStateChanged(ItemEvent e)
	{
		int index = choLista.getSelectedIndex();
		gentelicioResult.setText(gentilicios[index]);
		
	}
}
