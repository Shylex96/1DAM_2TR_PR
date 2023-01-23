package es.studium.ejercicio3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
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
	}


	public static void main(String[] args) {
		new Exercise3();
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Application has been closed.");
		System.exit(0);
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
				double cantidad = Integer.parseInt(txtCantidad.getText());
				double porcentaje = Integer.parseInt(txtPorcentaje.getText());

				double resultado = ((cantidad * porcentaje) / 100);
				txtResultado.setText(resultado+"€");

			}
		}
	}
}
