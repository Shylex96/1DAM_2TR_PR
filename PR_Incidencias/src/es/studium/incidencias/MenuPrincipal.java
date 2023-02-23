package es.studium.incidencias;

import java.awt.Color;
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

public class MenuPrincipal implements ActionListener, WindowListener {
	Frame windowPrincipal = new Frame("Menú Principal");
	MenuBar barraMenu = new MenuBar();

	Menu menuUsuarios = new Menu("Usuarios");
	Menu menuElementos = new Menu("Elementos");
	Menu menuIncidencias = new Menu("Incidencias");
	
	// Items Menu Usuarios:
	MenuItem menuUsuarioNuevo = new MenuItem("Nuevo");
	MenuItem menuUsuariosListado = new MenuItem("Listado");
	MenuItem menuUsuariosBaja = new MenuItem("Baja");
	MenuItem menuUsuariosModificar = new MenuItem("Modificar");
	
	// Items Menu Elementos:
	MenuItem menuElementosNuevo = new MenuItem("Nuevo");
	MenuItem menuElementosListado = new MenuItem("Listado");
	MenuItem menuElementosBaja = new MenuItem("Baja");
	MenuItem menuElementosModificar = new MenuItem("Modificar");
	
	// Items Menu Incidencias:
	
	
	MenuPrincipal (){
		windowPrincipal.setLayout(new FlowLayout());

		windowPrincipal.setMenuBar(barraMenu);

		menuUsuarios.add(menuUsuarioNuevo);
		menuUsuarios.add(menuUsuariosListado);
		menuUsuarios.add(menuUsuariosBaja);
		menuUsuarios.add(menuUsuariosModificar);
		
		menuElementos.add(menuElementosNuevo);
		menuElementos.add(menuElementosListado);
		menuElementos.add(menuElementosBaja);
		menuElementos.add(menuElementosModificar);
		
		menuIncidencias.setEnabled(false);

		menuUsuarioNuevo.addActionListener(this);
		menuUsuariosListado.addActionListener(this);
		menuUsuariosBaja.addActionListener(this);
		menuUsuariosModificar.addActionListener(this);
		
		menuElementosNuevo.addActionListener(this);
		menuElementosListado.addActionListener(this);
		menuElementosBaja.addActionListener(this);
		menuElementosModificar.addActionListener(this);

		
		barraMenu.add(menuUsuarios);
		barraMenu.add(menuElementos);
		barraMenu.add(menuIncidencias);
		
		windowPrincipal.setResizable(false);
		windowPrincipal.setSize(400, 400);
		windowPrincipal.setLocationRelativeTo(null);
		windowPrincipal.setBackground(Color.orange);
		windowPrincipal.addWindowListener(this);
		
		windowPrincipal.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {	}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {	}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Nuevo usuario
		if (e.getSource().equals(menuUsuarioNuevo)) {
			new NuevoUsuario();
		}
	}
}
