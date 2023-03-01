package es.studium.tallerVehiculos;

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

	// --- General components used ---
	Frame windowLogin = new Frame("Login");
	Label lblUser = new Label ("Usuario:");
	Label lblPassword = new Label ("Clave:");
	TextField txtUser = new TextField(10);
	TextField txtPassword = new TextField(10);
	Button btnAccess = new Button("Acceder");

	// --- Error Dialog ---
	Dialog dlgWindow = new Dialog(windowLogin, "Error", true);
	Label lblMessage = new Label ("Credenciales incorrectas.");

	Conexion conexion = new Conexion ();

	Login() {

		// --- Main panel configuration ---
		windowLogin.setLayout(null);

		// --- Main window settings ---
		windowLogin.addWindowListener(this);
		windowLogin.setResizable(false);
		windowLogin.setSize(300, 200); 
		windowLogin.setLocationRelativeTo(null);
		windowLogin.setBackground(Color.cyan);

		// Component Configuration:
		// --- User ---
		lblUser.setBounds(20, 60, 80, 25);
		windowLogin.add(lblUser);
		txtUser.setBounds(100, 60, 160, 25);
		txtUser.addActionListener(this);
		windowLogin.add(txtUser);

		// --- Password ---
		lblPassword.setBounds(20, 90, 80, 25);
		windowLogin.add(lblPassword);
		txtPassword.setBounds(100, 90, 160, 25);
		txtPassword.setEchoChar('•'); // ASCII 7
		txtPassword.addActionListener(this);
		windowLogin.add(txtPassword);

		// --- Access Button ---
		btnAccess.setBounds(130, 140, 100, 25);
		btnAccess.addActionListener(this);
		windowLogin.add(btnAccess);

		// --- Key Listener ---
		txtUser.addKeyListener(this);
		txtPassword.addKeyListener(this);

		// --- Visible Window --- 
		windowLogin.setVisible(true);


	}

	public static void main(String[] args) 
	{
		new Login();
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
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

		// --- Check if btnAccess was clicked ---
		if (e.getSource().equals(btnAccess)) {
			checkCredentials();
		}
	}

	// --- Check if the credentials are correct ---
	private void checkCredentials()
	{
		String user = txtUser.getText();
		String password = txtPassword.getText();

		// --- Check credentials using the Conexion object ---
		if (conexion.checkCredentials(user, password)) 
		{
			// --- Open the Main Menu and close login window ---
			new MenuPrincipal();
			windowLogin.setVisible(false);
		}
		// --- If credentials wrong: display error dialog ---
		else {
			dlgWindow.setLayout(new FlowLayout());
			dlgWindow.addWindowListener(this);
			dlgWindow.setSize(250, 75); 
			dlgWindow.setResizable(false);
			dlgWindow.setLocationRelativeTo(null);

			dlgWindow.setBackground(Color.BLACK);
			lblMessage.setForeground(Color.red);
			dlgWindow.add(lblMessage);
			txtUser.setText("");
			txtPassword.setText("");

			dlgWindow.setVisible(true);
		}

	}

	@Override
	public void keyTyped(KeyEvent e){}
	@Override
	public void keyReleased(KeyEvent e){}
	@Override
	public void keyPressed(KeyEvent e)
	{
		// --- Run method if Enter Key was pressed ---
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			checkCredentials();
		}
	}

}



