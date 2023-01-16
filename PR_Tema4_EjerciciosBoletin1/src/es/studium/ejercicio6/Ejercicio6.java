package es.studium.ejercicio6;

import java.awt.*;

public class Ejercicio6 {

	Frame ventana = new Frame("Provincias Españolas");
	Choice choLista = new Choice();
	String[ ] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres",
			"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
			"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
			"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
			"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};

	public Ejercicio6() {
		ventana.setLayout(new FlowLayout());
		// Añadir elementos a la lista:
		for (String provincia: provincias)
		{
			choLista.add(provincia);
		}
		// Añadir la lista:
		ventana.add(choLista);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(200, 120);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new Ejercicio6();
	}

}
