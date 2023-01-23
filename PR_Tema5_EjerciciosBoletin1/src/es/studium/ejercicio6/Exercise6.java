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

	Frame window = new Frame("Provincias Espa�olas");
	Label lblgentilicios = new Label("Gentilicio correspondiente:");
	TextField gentelicioResult = new TextField(35);
	Choice choLista = new Choice();
	String[] provincias =
		{ "Seleccione una provincia", "��lava", "Albacete", "Alicante", "Almer�a", "Asturias", "��vila", "Badajoz",
				"Barcelona", "Burgos", "C�ceres", "C�diz", "Cantabria", "Castell�n", "Ciudad Real", "C�rdoba", "La Coru�a",
				"Cuenca", "Gerona", "Granada", "Guadalajara", "Guip�zcoa", "Huelva", "Huesca", "Islas Baleares", "Ja�n",
				"Le�n", "L�rida", "Lugo", "Madrid", "M�laga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas",
				"Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
				"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };

	String[] gentilicios =
		{ "No ha elegido ninguna opci�n", "Alav�s/Alavesa o Babazorro/rra", "Albacete�o/�a o Albacetense", "Alicantino/na",
				"Almeriense, Urcitano/na", "Asturiano/na, Astur", "Abulense, Avil�s/esa",
				"Pacense, Badajocense, Badajoce�o/�a", "Barcelon�s/esa, Barcinonense", "Burgal�s/esa", "Cacere�o/�a",
				"Gaditano/na", "C�ntabro/a", "Castellonense", "Ciudadreale�o/�a", "Cordob�s/esa", "Coru��s", "Conquense",
				"Gerundense, Giron�s/esa", "Granadino/na", "Guadalajar�o/�a, Caracense, Arriacense", "Guipuzcoano/na",
				"Onubense", "Oscense", "Balear", "Jaen�s/esa, Jaenero/ro, Jienense, Giennense", "Leon�s/esa", "Leridano",
				"Lucense", "Madrile�o/�a", "Malague�o/�a", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na",
				"Palmense", "Pontevedr�s/esa", "Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense",
				"Soriano/na", "Tarracconense/a", "Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
				"Pucelano/na", "Vizca�no/na", "Zamorano/na", "Zaragozano/na" };

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
		// No se puede a�adir un ActionListener al objeto Choice.
		// choLista.addActionListener(this); 
		
		// En su lugar, se debe usar el m�todo addItemListener para 
		// agregar un ItemListener al Choice. Esto har� que implementemos
		// ItemListener a la l�nea 15 y con ello, un nuevo @Override.
		// Se cambia el m�todo actionPerformed a itemStateChanged.
		
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
