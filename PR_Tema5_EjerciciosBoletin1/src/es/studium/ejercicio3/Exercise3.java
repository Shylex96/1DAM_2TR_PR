package es.studium.ejercicio3;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise3 implements ActionListener, WindowListener {

	// Atributos:
	Frame window = new Frame("Calcular el porcentaje");
	Label lbltext1 = new Label("Introduzca la cantidad");
	Label lbltext2 = new Label("Introduzca el porcentaje");
	TextField txtCantidad = new TextField(10);
	TextField txtPorcentaje = new TextField(10);
	Button btnCalcular = new Button("Calcular");
	Label lbltext3 = new Label("Resultado");
	Button btnFahtoCel = new Button("Fahrenheit a Celsius ");
	TextField txtResultado = new TextField(10);
	
	// Dialogo:
	// El constructor necesita 3 parámetros: 
	// Debe estar asociado a un frame, título del dialogo e indicar si es modal o no.
	// Con true indicamos que es modal, lo que quiere decir que cuando sale el diálogo no permite seguir
	// ejecutando el programa a no ser que interactue con el diálogo primero.
	Dialog dlgWindow = new Dialog(window, "Error Message", true);
	Label lblMessage = new Label ("Format error.");

	Exercise3() 
	{

		window.setSize(1000, 70);
		window.setLayout(new GridLayout(1, 7)); 
		window.addWindowListener(this);
		btnCalcular.addActionListener(this);

		window.add(lbltext1);
		window.add(txtCantidad);

		window.add(lbltext2);
		window.add(txtPorcentaje);
		window.add(btnCalcular);

		window.add(lbltext3);
		window.add(txtResultado);

		txtResultado.setEditable(false);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		dlgWindow.setSize(70, 70);
		dlgWindow.addWindowListener(this);
		dlgWindow.setLayout(new FlowLayout());
		dlgWindow.add(lblMessage);
		dlgWindow.setLocationRelativeTo(null);
		dlgWindow.setResizable(false);
		
	}


	public static void main(String[] args) {
		new Exercise3();
		
	
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		if (dlgWindow.isActive()) 
		{
			dlgWindow.setVisible(false);
			txtCantidad.setText("");
			txtPorcentaje.setText("");
			txtResultado.setText("");
			
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

		if (e.getSource().equals(btnCalcular)) {
			if ( (!txtCantidad.getText().equals("")) | (!txtPorcentaje.getText().equals("")) )
			{
				
				try {
					float cantidad = Float.parseFloat(txtCantidad.getText());
					float porcentaje = Float.parseFloat(txtPorcentaje.getText());

					float resultado = ((cantidad * porcentaje) / 100f);
					txtResultado.setText(resultado+"");
					// txtResultado.setText(String.format("%.2f", resultado));
				} catch (NumberFormatException nfe) {
					txtResultado.setText("Format error.");
					System.out.println("Format error.");
					dlgWindow.setVisible(true);	
				}
				

			}
		}
	}
}
