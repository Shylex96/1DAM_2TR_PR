package es.studium.ejercicio2;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise2 implements ActionListener, WindowListener {

	// Atributos:
	Frame window = new Frame("Conversión de Temperaturas");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(10);
	TextField txtFahrenheit = new TextField(10);
	Button btnCeltoFah = new Button("Celsius a Fahrenheit");
	Button btnFahtoCel = new Button("Fahrenheit a Celsius ");

	Exercise2() {

		window.setSize(400, 130);
		window.setLayout(new GridLayout(3, 2));
		window.addWindowListener(this);
		btnCeltoFah.addActionListener(this);
		btnFahtoCel.addActionListener(this);
		window.add(lblCelsius);
		window.add(txtCelsius);
		window.add(lblFahrenheit);
		window.add(txtFahrenheit);
		window.add(btnCeltoFah);
		window.add(btnFahtoCel);

		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

	public static void main(String[] args) {
		new Exercise2();
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


		if (e.getSource().equals(btnCeltoFah)) 
		{
			if (!txtCelsius.getText().equals("")) 
			{
				double celsius = Integer.parseInt(txtCelsius.getText());
				double fahrenheitResult = (celsius * 9 / 5) + 32;
				txtFahrenheit.setText(fahrenheitResult+"");
			} // txtFahrenheit.setText("Error: Campo vacío");


		} else if (e.getSource().equals(btnFahtoCel))  {
			if (!txtFahrenheit.getText().equals(""))
			{
				double fahrenheit = Integer.parseInt(txtFahrenheit.getText());
				double celsiusResult = ((fahrenheit - 32) * 5 / 9);
				txtCelsius.setText(celsiusResult+"");
			} // txtCelsius.setText("Error: Campo vacío");
		}
	}
}
