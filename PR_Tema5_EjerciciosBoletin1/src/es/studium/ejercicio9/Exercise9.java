package es.studium.ejercicio9;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise9 implements ActionListener, WindowListener
{

	Frame window = new Frame("My Calculator");
	TextField txtResult = new TextField("");
	Button btnDivide = new Button("/");
	Button btnMultiply = new Button("*");
	Button btnSubtract = new Button("-");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btnAdd = new Button("+");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btnEqual = new Button("=");
	Button btn0 = new Button("0");
	Button btnDot = new Button(".");


	Exercise9() {
		// Crear la distribución
		GridBagLayout gridbag = new GridBagLayout();
		// Crear las restricciones
		GridBagConstraints gbc = new GridBagConstraints();
		// Establecer la distribución
		window.setLayout(gridbag);
		// Establecer restricciones generales
		gbc.fill = GridBagConstraints.BOTH;
		// Definir restricciones para el primer botón
		gbc.weightx = 1.0; // Como si fuera 1 columna

		// Añadir los elementos:
		// Aplicar restricciones al botón
	}



	public static void main(String[] args) {
		new Exercise9();
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
	public void actionPerformed(ActionEvent e) {}

}
