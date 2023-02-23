package es.studium.incidencias;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class NuevoUsuario implements ActionListener, WindowListener {

	Frame windowNuevoUser = new Frame("Nuevo Usuario");
	Label lblPrincipal = new Label ("------------------ Alta de Usuario ------------------");

	Label lblNombre = new Label ("Nombre:");
	TextField txtNombre = new TextField (20);
	Label lblClave = new Label ("Clave:");
	TextField txtClave = new TextField (21);
	Label lblConfirmarClave = new Label ("Confirmar Clave:");
	TextField txtConfirmarClave = new TextField (13);
	Label lblCorreo = new Label ("Correo:");
	TextField txtCorreo = new TextField (21);
	Button btnAceptar = new Button ("Aceptar");
	Button btnCancelar = new Button ("Cancelar");

	Conexion conexion = new Conexion();

	Dialog dlgWindow = new Dialog(windowNuevoUser, "Aviso", false);
	Label lblAvisos = new Label ("ALTA realizada con éxito.");

	NuevoUsuario(){

		windowNuevoUser.setLayout(new FlowLayout());
		windowNuevoUser.addWindowListener(this);
		windowNuevoUser.setResizable(false);
		windowNuevoUser.setSize(290, 210); 
		windowNuevoUser.setLocationRelativeTo(null);
		windowNuevoUser.setBackground(Color.orange);

		windowNuevoUser.add(lblPrincipal);
		windowNuevoUser.add(lblNombre);
		windowNuevoUser.add(txtNombre);
		windowNuevoUser.add(lblClave);
		windowNuevoUser.add(txtClave);
		windowNuevoUser.add(lblConfirmarClave);
		windowNuevoUser.add(txtConfirmarClave);
		windowNuevoUser.add(lblCorreo);
		windowNuevoUser.add(txtCorreo);
		windowNuevoUser.add(btnAceptar);
		windowNuevoUser.add(btnCancelar);
		txtClave.setEchoChar('•'); // ASCII 7
		txtConfirmarClave.setEchoChar('•'); // ASCII 7

		btnAceptar.addActionListener(this);
		btnCancelar.addActionListener(this);

		windowNuevoUser.addWindowListener(this);

		dlgWindow.setSize(180, 70);
		dlgWindow.setBackground(Color.orange);
		dlgWindow.setLayout(new FlowLayout());
		dlgWindow.addWindowListener(this);
		dlgWindow.setLocationRelativeTo(null);
		dlgWindow.setResizable(false);
		dlgWindow.add(lblAvisos);

		windowNuevoUser.setVisible(true);
	}
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		if (dlgWindow.isActive()) {
			dlgWindow.setVisible(false);
		} else {
			windowNuevoUser.setVisible(false);
		}
		
	}

	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {	}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnAceptar)) {


			// Comprobar las claves
			if (txtClave.getText().equals("") || txtConfirmarClave.getText().equals("") || txtNombre.getText().equals("") || txtCorreo.getText().equals("")) 
			{

				dlgWindow.setLayout(new FlowLayout());
				dlgWindow.setSize(180, 70);
				dlgWindow.addWindowListener(this);

				lblAvisos.setText("Campos vacíos");
				dlgWindow.setVisible(true);

			} else if (txtClave.getText().equals(txtConfirmarClave.getText())){


				// Dar de alta

				String sentencia = "INSERT INTO usuarios VALUES (null, '"+txtNombre.getText()+"', SHA2('"+txtClave.getText()+"',256), '"+txtCorreo.getText()+"');";
				int respuesta = conexion.altaUsuario(sentencia);

				dlgWindow.setLayout(new FlowLayout());
				dlgWindow.setSize(180, 70);
				dlgWindow.addWindowListener(this);

				if (respuesta !=0) {
					// Mostrar mensaje Error
					lblAvisos.setText("Error en Alta");

				}

				dlgWindow.add(lblAvisos);
				dlgWindow.setVisible(true);
				// Diálogo
				dlgWindow.setVisible(true);
				lblAvisos.setVisible(true);

			} else {
				dlgWindow.setLayout(new FlowLayout());
				dlgWindow.setSize(180, 70);
				dlgWindow.addWindowListener(this);

				lblAvisos.setText("La Clave no coincide.");
				dlgWindow.setVisible(true);
			}
			
			
			// Hacer que tengan x length, contengan mayus, numeros, símbolos
			// txtClave.getText().length()==0 ||

		} else if (e.getSource().equals(btnCancelar)) {

			txtNombre.setText("");
			txtClave.setText("");
			txtConfirmarClave.setText("");
			txtCorreo.setText("");
			txtNombre.requestFocus();

		}
	}
}

