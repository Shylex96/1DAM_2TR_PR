package es.studium.incidencias;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ListadoUsuarios implements ActionListener, WindowListener {
	Frame windowListadoUsuarios = new Frame("Listado Usuarios");
	TextArea areaDatos = new TextArea (10, 35);
	Button btnPDF = new Button ("PDF");
	
	Conexion conexion = new Conexion();

	ListadoUsuarios(){

		windowListadoUsuarios.setLayout(new FlowLayout());
		windowListadoUsuarios.addWindowListener(this);
		windowListadoUsuarios.setResizable(false);
		windowListadoUsuarios.setSize(300, 250); 
		windowListadoUsuarios.setLocationRelativeTo(null);
		windowListadoUsuarios.setBackground(Color.orange);
		
		// Rellenar el TextArea 
		conexion.rellenarListadoUsuarios(areaDatos);
		
		areaDatos.setEditable(false);
		btnPDF.setEnabled(false);
		windowListadoUsuarios.add(areaDatos);
		windowListadoUsuarios.add(btnPDF);
		
		windowListadoUsuarios.setVisible(true);
	}



	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		windowListadoUsuarios.setVisible(false);
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
	public void actionPerformed(ActionEvent e) {}

}