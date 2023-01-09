package es.studium.Ejemplo14;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejemplo14 {

	Frame ventana = new Frame("Ejemplo14");
	// En primer lugar creamos la barra de menú
	MenuBar barraMenu = new MenuBar();
	// Ahora creamos los elementos principales del menú
	Menu menuArchivo = new Menu("Archivo");
	Menu menuEdicion = new Menu("Edición");
	// Y Ahora los elementos de cada opción del menú principal
	// Primero los de Archivo
	// menuArchivoNuevo contendrá otros elementos, por lo que es tipo Menu
	Menu menuArchivoNuevo = new Menu("Nuevo");
	// Los siguientes son MenuItem pues dentro no tienen submenús
	MenuItem mniArchivoAbrir = new MenuItem("Abrir");
	MenuItem mniArchivoGuardar = new MenuItem("Guardar");
	MenuItem mniArchivoSalir = new MenuItem("Salir");
	// Luego los de Edición
	MenuItem mniEdicionCortar = new MenuItem("Cortar");
	MenuItem mniEdicionCopiar = new MenuItem("Copiar");
	MenuItem mniEdicionPegar = new MenuItem("Pegar");
	// Por último, creamos los elementos dentro de Nuevo
	MenuItem mniArchivoNuevoVentana = new MenuItem("Ventana");
	MenuItem mniArchivoNuevoDialogo = new MenuItem("Diálogo");

	public Ejemplo14() {
		ventana.setLayout(new FlowLayout());
		// Establecemos la barra de menú
		ventana.setMenuBar(barraMenu);
		// Empezamos a añadirle los elementos
		// Primero a menuArchivoNuevo, le añadimos sus submenús
		menuArchivoNuevo.add(mniArchivoNuevoVentana);
		menuArchivoNuevo.add(mniArchivoNuevoDialogo);
		// Seguimos con los elementos de archivo
		menuArchivo.add(menuArchivoNuevo);
		menuArchivo.add(mniArchivoAbrir);
		menuArchivo.add(mniArchivoGuardar);
		// Añadimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(mniArchivoSalir);
		// Y ahora a edicion los suyos
		menuEdicion.add(mniEdicionCortar);
		menuEdicion.add(mniEdicionCopiar);
		menuEdicion.add(mniEdicionPegar);
		// Por último agregamos los elementos archivo y edicion a la barra
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(200, 200);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejemplo14();
	}

}
