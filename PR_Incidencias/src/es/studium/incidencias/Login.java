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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login implements ActionListener, WindowListener, KeyListener {

	Frame windowLogin = new Frame("Login");
	Dialog dlgWindow = new Dialog(windowLogin, "Error", true);

	Label lblUsuario = new Label ("Usuario:");
	Label lblClave = new Label ("Clave:    ");
	Label lblMensaje = new Label ("Credenciales incorrectas.");

	TextField txtUsuario = new TextField(10);
	TextField txtClave = new TextField(10);

	Button btnAcceder = new Button("Acceder");
	Conexion conexion = new Conexion ();

	Login() {

		windowLogin.setLayout(new FlowLayout());
		windowLogin.addWindowListener(this);
		windowLogin.setResizable(false);
		windowLogin.setSize(220, 130); 
		windowLogin.setLocationRelativeTo(null);
		windowLogin.setBackground(Color.orange);

		windowLogin.add(lblUsuario);
		//txtUsuario.setForeground(Color.red);
		windowLogin.add(txtUsuario);
		//txtClave.setForeground(Color.red);
		windowLogin.add(lblClave);
		txtClave.setEchoChar('•'); // ASCII 7
		windowLogin.add(txtClave);
		windowLogin.add(btnAcceder);
		btnAcceder.addActionListener(this);

		// --- Key Listener ---
		txtUsuario.addKeyListener(this);
		txtClave.addKeyListener(this);
		
		windowLogin.setVisible(true);
	}


	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		if (dlgWindow.isActive()) 
		{
			dlgWindow.setVisible(false);
		}else {
			System.exit(0);
		}
	}
	@Override
	public void windowClosed(WindowEvent e) {	}
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
		if (e.getSource().equals(btnAcceder)) 
		{
			String usuario = txtUsuario.getText();
			String clave = txtClave.getText();

			// Credenciales:
			if (conexion.comprobarCredenciales(usuario, clave)) {
				new MenuPrincipal();
				windowLogin.setVisible(false);
			}
			else {
				dlgWindow.setLayout(new FlowLayout());
				dlgWindow.addWindowListener(this);
				dlgWindow.setResizable(false);
				dlgWindow.setLocationRelativeTo(null);
				dlgWindow.setSize(220, 80); 
				dlgWindow.setBackground(Color.orange);
				dlgWindow.add(lblMensaje);
				txtUsuario.setText("");
				txtClave.setText("");

				dlgWindow.setVisible(true);
			}


		}
	}



	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			String usuario = txtUsuario.getText();
			String clave = txtClave.getText();

			// Credenciales:
			if (conexion.comprobarCredenciales(usuario, clave)) {
				new MenuPrincipal();
				windowLogin.setVisible(false);
			}
			else {
				dlgWindow.setLayout(new FlowLayout());
				dlgWindow.addWindowListener(this);
				dlgWindow.setResizable(false);
				dlgWindow.setLocationRelativeTo(null);
				dlgWindow.setSize(220, 80); 
				dlgWindow.setBackground(Color.orange);
				dlgWindow.add(lblMensaje);
				txtUsuario.setText("");
				txtClave.setText("");

				dlgWindow.setVisible(true);
			}
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {}
}

