package testing2.calculator;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CalculatorNoFunc_GridBagLayout implements ActionListener, WindowListener
{

	Frame window = new Frame("My Calculator");
	TextField txtResult = new TextField("");
	Button btnCE = new Button ("CE");
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


	CalculatorNoFunc_GridBagLayout() {
		// Crear la distribución
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		window.setLayout(gridbag);
		// Establecer restricciones generales
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0; 
		gbc.weighty = 1.0;
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;

		// Añadir los elementos:
		// Aplicar restricciones al botón


		gbc.gridwidth = GridBagConstraints.REMAINDER; // Ancho relativo | Coge todo lo que pueda.
		gridbag.setConstraints(txtResult,gbc );
		window.add(txtResult);
		txtResult.setEditable(false);

		gbc.weightx = 1.0; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1;
		gridbag.setConstraints(btnCE,gbc);
		window.add(btnCE);

		gridbag.setConstraints(btnDivide,gbc);
		window.add(btnDivide);

		gridbag.setConstraints(btnMultiply,gbc);
		window.add(btnMultiply);

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(btnSubtract,gbc);
		window.add(btnSubtract);

		gbc.gridwidth = 1;
		gbc.weightx = 0.0;
		gridbag.setConstraints(btn7,gbc);
		window.add(btn7);

		gridbag.setConstraints(btn8,gbc);
		window.add(btn8);

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gridbag.setConstraints(btn9,gbc);
		window.add(btn9);

		gbc.gridwidth = 1; // Ancho de 1 columna
		gbc.gridheight = 2; // Alto de 2 filas
		gbc.weighty = 1.0; // Tamaño relativo
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gridbag.setConstraints(btnAdd,gbc);
		window.add(btnAdd);

		gbc.weighty = 0.0; // Reset

		gbc.gridwidth = 1;
		gbc.gridheight = 1; // Alto de 1 fila
		gridbag.setConstraints(btn4,gbc);
		window.add(btn4);

		gridbag.setConstraints(btn5,gbc);
		window.add(btn5);

		gbc.gridwidth = GridBagConstraints.REMAINDER; // Lo que quede
		gridbag.setConstraints(btn6,gbc);
		window.add(btn6);

		gbc.weighty = 0.0; // Reset
		gbc.gridwidth = 1;

		gridbag.setConstraints(btn1,gbc);
		window.add(btn1);

		gridbag.setConstraints(btn2,gbc);
		window.add(btn2);

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gridbag.setConstraints(btn3,gbc);
		window.add(btn3);

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 2; // Alto de 2 filas
		gbc.weighty = 1.0; // Tamaño relativo
		gridbag.setConstraints(btnEqual,gbc);
		window.add(btnEqual);

		gbc.weighty = 0.0; // Reset
		gbc.gridwidth = 2;
		gridbag.setConstraints(btn0,gbc);
		window.add(btn0);

		gbc.gridwidth = 1;
		gbc.gridwidth = GridBagConstraints.RELATIVE; 
		gridbag.setConstraints(btnDot,gbc);
		window.add(btnDot);

		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.addWindowListener(this);
		window.setSize(300, 230); 
	}



	public static void main(String[] args) {
		new CalculatorNoFunc_GridBagLayout();
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