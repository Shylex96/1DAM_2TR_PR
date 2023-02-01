package testing1.calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator1 implements ActionListener, WindowListener, KeyListener
{

	Frame window = new Frame("Calc");
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

	Dialog dlgWindow = new Dialog(window, "Math Error", true);
	Label lblMessage = new Label ("Error: \nIt is not possible to divide by zero.");


	public float firstNumber;
	public float secondNumber;
	public String operator;
	public String noDecimalsWithInt;

	Calculator1() {
		// Crear la distribución
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		window.setLayout(gridbag);

		window.setSize(210, 180); 
		window.setBackground(Color.orange);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.addWindowListener(this);
		txtResult.addKeyListener(this);

		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnEqual.addActionListener(this);
		btnDot.addActionListener(this);
		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
		btnMultiply.addActionListener(this);
		btnDivide.addActionListener(this);
		btnCE.addActionListener(this);




		dlgWindow.setSize(250, 70);
		dlgWindow.setLayout(new FlowLayout());
		dlgWindow.addWindowListener(this);
		dlgWindow.add(lblMessage);
		dlgWindow.setLocationRelativeTo(null);
		dlgWindow.setResizable(false);

		// Add elements:
		// Apply restrictions to every button.

		gbc.gridx = 0; // Position 0 - Column
		gbc.gridy = 0; // Position 0 - Row
		gbc.gridwidth = 4; // Width in Columns
		gbc.gridheight = 1; // Height in Rows
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Relative Width | Takes all it can.
		gridbag.setConstraints(txtResult,gbc );
		window.add(txtResult);
		txtResult.setEditable(false);


		gbc.gridx = 0; 
		gbc.gridy = 1; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btnCE,gbc);
		window.add(btnCE);

		gbc.gridx = 1; 
		gbc.gridy = 1; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btnDivide,gbc);
		window.add(btnDivide);

		gbc.gridx = 2; 
		gbc.gridy = 1; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btnMultiply,gbc);
		window.add(btnMultiply);

		gbc.gridx = 3; 
		gbc.gridy = 1; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btnSubtract,gbc);
		window.add(btnSubtract);

		gbc.gridx = 0; 
		gbc.gridy = 2; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn7,gbc);
		window.add(btn7);

		gbc.gridx = 1; 
		gbc.gridy = 2; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn8,gbc);
		window.add(btn8);

		gbc.gridx = 2; 
		gbc.gridy = 2; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn9,gbc);
		window.add(btn9);

		gbc.gridx = 3; 
		gbc.gridy = 2; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 2; 

		gridbag.setConstraints(btnAdd,gbc);
		window.add(btnAdd);

		gbc.gridx = 0; 
		gbc.gridy = 3; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn4,gbc);
		window.add(btn4);

		gbc.gridx = 1; 
		gbc.gridy = 3; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn5,gbc);
		window.add(btn5);

		gbc.gridx = 2; 
		gbc.gridy = 3; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn6,gbc);
		window.add(btn6);

		gbc.gridx = 0; 
		gbc.gridy = 4; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn1,gbc);
		window.add(btn1);

		gbc.gridx = 1; 
		gbc.gridy = 4; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn2,gbc);
		window.add(btn2);

		gbc.gridx = 2; 
		gbc.gridy = 4; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn3,gbc);
		window.add(btn3);

		gbc.gridx = 3; 
		gbc.gridy = 4; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 2; 

		gridbag.setConstraints(btnEqual,gbc);
		window.add(btnEqual);

		gbc.gridx = 0; 
		gbc.gridy = 5; 
		gbc.gridwidth = 2; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btn0,gbc);
		window.add(btn0);

		gbc.gridx = 2; 
		gbc.gridy = 5; 
		gbc.gridwidth = 1; 
		gbc.gridheight = 1; 

		gridbag.setConstraints(btnDot,gbc);
		window.add(btnDot);

		window.setVisible(true);

	}



	public static void main(String[] args) {
		new Calculator1();
	}


	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		if (dlgWindow.isActive()) 
		{
			dlgWindow.setVisible(false);
		}else {
			System.out.println("\nApplication has been closed.");
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

		try {
			// If press any button from 0 to 9, it will be added to "textResult" field.
			if (e.getSource().equals(btn0)) {
				txtResult.setText(txtResult.getText() + "0");
			} else if (e.getSource().equals(btn1)) {
				txtResult.setText(txtResult.getText() + "1");
			} else if (e.getSource().equals(btn2)) {
				txtResult.setText(txtResult.getText() + "2");
			} else if (e.getSource().equals(btn3)) {
				txtResult.setText(txtResult.getText() + "3");
			} else if (e.getSource().equals(btn4)) {
				txtResult.setText(txtResult.getText() + "4");
			} else if (e.getSource().equals(btn5)) {
				txtResult.setText(txtResult.getText() + "5");
			} else if (e.getSource().equals(btn6)) {
				txtResult.setText(txtResult.getText() + "6");
			} else if (e.getSource().equals(btn7)) {
				txtResult.setText(txtResult.getText() + "7");
			} else if (e.getSource().equals(btn8)) {
				txtResult.setText(txtResult.getText() + "8");
			} else if (e.getSource().equals(btn9)) {
				txtResult.setText(txtResult.getText() + "9");
			} else if (e.getSource().equals(btn0)) {
				txtResult.setText(txtResult.getText() + "0");
			} else if (e.getSource().equals(btnCE)) {
				txtResult.setText("");
				// If the "equals" btn is pressed, it will perform the operation designated 
				// according to the mathematical sign after parse the string.
			} else if (e.getSource().equals(btnEqual)) {
				this.secondNumber = Float.parseFloat(this.txtResult.getText());
				switch (this.operator) {
				case "+": this.txtResult.setText(noDecimalsWithInt(this.firstNumber + this.secondNumber));
				break;
				case "-": this.txtResult.setText(noDecimalsWithInt(this.firstNumber - this.secondNumber));
				break;
				case "*": this.txtResult.setText(noDecimalsWithInt(this.firstNumber * this.secondNumber));
				break;
				case "/": if(this.secondNumber == 0) {
					this.txtResult.setText("");
					dlgWindow.setVisible(true);
				} else {
					this.txtResult.setText(noDecimalsWithInt(this.firstNumber / this.secondNumber));
					break;
				}

				} 
				// If "add" btn is pressed, it take the current number in textfield and parse it into a float.
			} else if (e.getSource().equals(btnAdd)) {
				this.firstNumber = Float.parseFloat(this.txtResult.getText());
				this.operator = "+";
				this.txtResult.setText("");
			} else if (e.getSource().equals(btnSubtract)) {
				this.firstNumber = Float.parseFloat(this.txtResult.getText());
				this.operator = "-";
				this.txtResult.setText("");
			} else if (e.getSource().equals(btnMultiply)) {
				this.firstNumber = Float.parseFloat(this.txtResult.getText());
				this.operator = "*";
				this.txtResult.setText("");
			} else if (e.getSource().equals(btnDivide)) {
				this.firstNumber = Float.parseFloat(this.txtResult.getText());
				this.operator = "/";
				this.txtResult.setText("");
			} else if (e.getSource().equals(btnDot)) {
				if (!txtResult.getText().contains(".")) {
					txtResult.setText(this.txtResult.getText() + ".");
				}
			}
		} catch (NumberFormatException  nfe) {
			System.out.println("Error: An operator has been pressed with no elements to operate.");
		} catch (NullPointerException npe) {
			System.out.println("Error: Operation can't be resolve because there is no second number to operate.");
		}



	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_ENTER:

		}
	}
	@Override
	public void keyReleased(KeyEvent e) {

	}


	public String noDecimalsWithInt (float result) {
		String returnFunc = "";

		returnFunc = Float.toString(result);

		if (result%1==0) {
			returnFunc = returnFunc.substring(0, returnFunc.length() - 2);
		}
		return returnFunc;
	}
}