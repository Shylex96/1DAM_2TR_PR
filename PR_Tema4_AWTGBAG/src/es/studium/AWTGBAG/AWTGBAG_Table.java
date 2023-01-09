package es.studium.AWTGBAG;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class AWTGBAG_Table 
{

	// Contenedor
	Frame window = new Frame("AwtGBag");

	// Componentes
	Button btnBoton0 = new Button("Botón 0");
	Button btnBoton1 = new Button("Botón 1");
	Button btnBoton2 = new Button("Botón 2");
	Button btnBoton3 = new Button("Botón 3");
	Button btnBoton4 = new Button("Botón 4");
	Button btnBoton5 = new Button("Botón 5");
	Button btnBoton6 = new Button("Botón 6");
	Button btnBoton7 = new Button("Botón 7");
	Button btnBoton8 = new Button("Botón 8");
	Button btnBoton9 = new Button("Botón 9");

	AWTGBAG_Table()
	{
		// Crear la distribución
		GridBagLayout gridbag = new GridBagLayout();
		// Crear las restricciones
		GridBagConstraints gbc = new GridBagConstraints();
		// Establecer la distribución
		window.setLayout(gridbag);
		// Establecer restricciones generales
		gbc.fill = GridBagConstraints.BOTH;
		// Definir restricciones para el primer botón
		gbc.weightx = 1.0; // Como si fuera 1 columna
		
		// Añadir los elementos:
		// Aplicar restricciones al botón
		gridbag.setConstraints(btnBoton0,gbc);
		window.add(btnBoton0);
		
		gridbag.setConstraints(btnBoton1,gbc);
		window.add(btnBoton1);
		
		gridbag.setConstraints(btnBoton2,gbc);
		window.add(btnBoton2);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Espacio restante
		gridbag.setConstraints(btnBoton3,gbc);
		window.add(btnBoton3);
		
		gbc.weightx = 0.0; // Reset | Si pusiéramos 1.0 se quedaría igual, porque al final lo que estamos haciendo es definirlo en 1 fila.
		gridbag.setConstraints(btnBoton4,gbc);
		window.add(btnBoton4);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE; // Ancho relativo | Coge todo lo que pueda.
		gridbag.setConstraints(btnBoton5,gbc );
		window.add(btnBoton5);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Ancho restante | Coge todo lo que le queda.
		gridbag.setConstraints(btnBoton6,gbc);
		window.add(btnBoton6);
		
		gbc.gridwidth = 1; // Ancho de 1 columna
		gbc.gridheight = 2; // Alto de 2 filas
		gbc.weighty = 1.0; // Tamaño relativo
		gridbag.setConstraints(btnBoton7,gbc);
		window.add(btnBoton7);
		
		gbc.weighty = 0.0; // Reset
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Lo que quede
		gbc.gridheight = 1; // Alto de 1 fila
		gridbag.setConstraints(btnBoton8,gbc);
		window.add(btnBoton8);
		
		gridbag.setConstraints(btnBoton9,gbc);
		window.add(btnBoton9);
		
		// Tamaño de la window
		window.setSize(300, 200);
		// window centrada
		window.setLocationRelativeTo(null);
		// Hacer visible
		window.setVisible(true); 
	}

	public static void main(String[] args)
	{
		new AWTGBAG_Table();
	}

}
