package es.studium.ejercicio8;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise8 implements ActionListener, WindowListener {
	Frame window = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();

	Menu menuArticulos = new Menu("Artículos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	// Items Menu:
	MenuItem menuArticulosNuevo = new MenuItem("Nuevo Artículo");
	MenuItem menuArticulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem menuArticulosConsultar = new MenuItem("Consultar Artículo");
	// Clients Menu:
	MenuItem menuClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem menuClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem menuClientesConsultar = new MenuItem("Consultar Cliente");
	// Bills Menu:
	MenuItem menuFacturasNuevo = new MenuItem("Nueva Factura");
	MenuItem menuFacturasConsultar = new MenuItem("Consultar Factura");

	// Dialog:
	Dialog dlgWindow = new Dialog(window, "Item Window", true);
	Label lblItemClicked = new Label ("");

	Exercise8() {
		window.setLayout(new FlowLayout());

		window.setMenuBar(barraMenu);

		menuArticulos.add(menuArticulosNuevo);
		menuArticulos.add(menuArticulosEliminar);
		menuArticulos.add(menuArticulosConsultar);

		menuClientes.add(menuClientesNuevo);
		menuClientes.add(menuClientesEliminar);
		menuClientes.add(menuClientesConsultar);

		menuFacturas.add(menuFacturasNuevo);
		menuFacturas.add(menuFacturasConsultar);

		menuArticulosNuevo.addActionListener(this);
		menuArticulosEliminar.addActionListener(this);
		menuArticulosConsultar.addActionListener(this);

		menuClientesNuevo.addActionListener(this);
		menuClientesEliminar.addActionListener(this);
		menuClientesConsultar.addActionListener(this);
		menuFacturasNuevo.addActionListener(this);
		menuFacturasConsultar.addActionListener(this);

		barraMenu.add(menuArticulos);
		barraMenu.add(menuClientes);
		barraMenu.add(menuFacturas);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setSize(300, 180);
		window.setVisible(true);
		window.addWindowListener(this);

		dlgWindow.setSize(160, 100);
		dlgWindow.setLayout(new FlowLayout());
		dlgWindow.addWindowListener(this);
		dlgWindow.add(lblItemClicked);
		dlgWindow.setLocationRelativeTo(null);
		dlgWindow.setResizable(false);
	}

	public static void main(String[] args) {
		new Exercise8();
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		if (dlgWindow.isActive()) 
		{
			dlgWindow.setVisible(false);

		}else {
			System.out.println("Application has been closed.");
			System.exit(0);
		}
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
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(menuArticulosNuevo)) 
		{
			lblItemClicked.setText("Nuevo Artículo");
			dlgWindow.setVisible(true);

		} else if (e.getSource().equals(menuArticulosEliminar)) 
		{
			lblItemClicked.setText("Eliminar Artículo");
			dlgWindow.setVisible(true);

		} else if (e.getSource().equals(menuArticulosConsultar)) 
		{
			lblItemClicked.setText("Consultar Archivo");
			dlgWindow.setVisible(true);

		}else if (e.getSource().equals(menuClientesNuevo)) 
		{
			lblItemClicked.setText("Nuevo Cliente");
			dlgWindow.setVisible(true);

		}else if (e.getSource().equals(menuClientesEliminar)) 
		{
			lblItemClicked.setText("Elimnar Cliente");
			dlgWindow.setVisible(true);

		}else if (e.getSource().equals(menuClientesConsultar)) 
		{
			lblItemClicked.setText("Consultar Cliente");
			dlgWindow.setVisible(true);

		}else if (e.getSource().equals(menuFacturasNuevo)) 
		{
			lblItemClicked.setText("Nueva Factura");
			dlgWindow.setVisible(true);

		}else if (e.getSource().equals(menuFacturasConsultar)) 
		{
			lblItemClicked.setText("Consultar Factura");
			dlgWindow.setVisible(true);
		}


	}
}


