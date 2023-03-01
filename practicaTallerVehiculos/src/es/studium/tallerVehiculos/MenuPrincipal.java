package es.studium.tallerVehiculos;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuPrincipal
{
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
}
