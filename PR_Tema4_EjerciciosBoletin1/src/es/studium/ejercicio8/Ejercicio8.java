package es.studium.ejercicio8;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio8 {

	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();

	Menu menuArticulos = new Menu("Artículos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	// Menú Artículos:
	MenuItem menuArticulosNuevo = new MenuItem("Nuevo Artículo");
	MenuItem menuArticulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem menuArticulosConsultar = new MenuItem("Consultar Artículo");
	// Menú Clientes:
	MenuItem menuClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem menuClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem menuClientesConsultar = new MenuItem("Consultar Cliente");
	// Menú Facturas:
	MenuItem menuFacturasNuevo = new MenuItem("Nueva Factura");
	MenuItem menuFacturasConsultar = new MenuItem("Consultar Factura");

	Ejercicio8() {
		ventana.setLayout(new FlowLayout());

		ventana.setMenuBar(barraMenu);

		menuArticulos.add(menuArticulosNuevo);
		menuArticulos.add(menuArticulosEliminar);
		menuArticulos.add(menuArticulosConsultar);

		menuClientes.add(menuClientesNuevo);
		menuClientes.add(menuClientesEliminar);
		menuClientes.add(menuClientesConsultar);

		menuFacturas.add(menuFacturasNuevo);
		menuFacturas.add(menuFacturasConsultar);
		// Por último agregamos los elementos archivo y edicion a la barra
		barraMenu.add(menuArticulos);
		barraMenu.add(menuClientes);
		barraMenu.add(menuFacturas);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(300, 180);
		ventana.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejercicio8();

	}

}
