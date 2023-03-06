package es.studium.incidencias;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BajaUsuarios implements ActionListener, WindowListener {
	Frame windowBajaUsuario = new Frame("Baja Usuario");
	Label lblElegirUsuario = new Label ("Elegir el usuario a eliminar:");
	Choice choUsuarios = new Choice();

	Button btnEliminar = new Button ("Eliminar");
	Dialog dlgSeguro = new Dialog(windowBajaUsuario, "¿Seguro?", false);
	Dialog dlgConfirmacion = new Dialog(windowBajaUsuario, "Confirmación", false);
	Label lblEstarSeguro = new Label ("");
	Label lblConfirmacion = new Label ("");
	Button btnSiSeguro = new Button ("SÍ");
	Button btnNoSeguro = new Button ("NO");
	Button btnCerrarConfirmacion = new Button ("Cerrar");

	Conexion conexion = new Conexion();

	BajaUsuarios() {

		windowBajaUsuario.setLayout(new FlowLayout());
		windowBajaUsuario.addWindowListener(this);
		windowBajaUsuario.setResizable(false);
		windowBajaUsuario.setSize(200, 200); 
		windowBajaUsuario.setLocationRelativeTo(null);
		windowBajaUsuario.setBackground(Color.orange);

		windowBajaUsuario.add(lblElegirUsuario);
		// Rellenar choice
		conexion.rellenarChoiceUsuarios(choUsuarios);
		windowBajaUsuario.add(choUsuarios);
		btnEliminar.addActionListener(this);
		windowBajaUsuario.add(btnEliminar);


		windowBajaUsuario.setVisible(true);
	}


	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		if (dlgSeguro.isActive()) {
			dlgSeguro.setVisible(false);
		}else if (dlgConfirmacion.isActive()){
			dlgConfirmacion.setVisible(false);
			dlgSeguro.setVisible(false);
			windowBajaUsuario.setVisible(false);
		} else {
			windowBajaUsuario.setVisible(false);
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
		// Si haces clic en Eliminar:
		if (e.getSource().equals(btnEliminar)) {

			// Crear diálogo pero sin hacerlo visible.
			dlgSeguro.setSize(250, 100); 
			dlgSeguro.setLayout(new FlowLayout());
			dlgSeguro.addWindowListener(this);
			dlgSeguro.setResizable(false);
			dlgSeguro.setLocationRelativeTo(null);
			dlgSeguro.setBackground(Color.red);
			
			// Si el usuario no es el 0 entonces permitimos borrar.
			if (choUsuarios.getSelectedIndex()!=0) {

				// Diálogo visible de si estamos seguros de borrar.
				lblEstarSeguro.setText("¿Seguro de eliminar a: " +choUsuarios.getSelectedItem()+ "?");
				dlgSeguro.add(lblEstarSeguro);
				btnSiSeguro.addActionListener(this);
				dlgSeguro.add(btnSiSeguro);
				btnNoSeguro.addActionListener(this);
				dlgSeguro.add(btnNoSeguro);

				dlgSeguro.setVisible(true);
			}

		}

		// Si has pulsado "si" a borrar entonces:
		else if (e.getSource().equals(btnSiSeguro)) {

			String tabla[] = choUsuarios.getSelectedItem().split("-");
			int respuesta = conexion.borrarUsuario(tabla[0]);
			if (respuesta==0) {
				
				dlgConfirmacion.setSize(280, 100); 
				dlgConfirmacion.setLayout(new FlowLayout());
				dlgConfirmacion.addWindowListener(this);
				dlgConfirmacion.setResizable(false);
				dlgConfirmacion.setLocationRelativeTo(null);
				dlgConfirmacion.setBackground(Color.green);

				dlgConfirmacion.add(lblConfirmacion);
				lblConfirmacion.setText("Usuario: " +choUsuarios.getSelectedItem() + " eliminado correctamente.");
				btnCerrarConfirmacion.addActionListener(this);
				dlgConfirmacion.add(btnCerrarConfirmacion);
				conexion.rellenarChoiceUsuarios(choUsuarios);
				dlgConfirmacion.setVisible(true);
				
			} else {
				
			}
			
			conexion.borrarUsuario(tabla[0]);
			dlgSeguro.setVisible(false);

			


		} else if (e.getSource().equals(btnNoSeguro)) {

			dlgSeguro.setVisible(false);
			dlgConfirmacion.setVisible(false);
		}

		else if (e.getSource().equals(btnCerrarConfirmacion)) {
			
			dlgConfirmacion.setVisible(false);
			dlgSeguro.setVisible(false);
			windowBajaUsuario.setVisible(false);
		}

	}
}
