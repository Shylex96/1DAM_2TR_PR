package es.studium.SecondEventExample;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
public class SecondEventExample implements ActionListener, WindowListener
{
	Frame window = new Frame("Exercise 2");
	Button btnSum = new Button("+");
	Button btnRest = new Button("-");
	Button btnDivide = new Button("/");
	Button btnMultiply = new Button("*");
	Button btnClose = new Button("Close");
	Label title = new Label("Calc Program");
	
	TextField text1 = new TextField(25);
	TextField text2 = new TextField(25);
	TextField text3 = new TextField(25);

	SecondEventExample()
	{
		window.setLayout(new FlowLayout());
		window.addWindowListener(this);
		window.setSize(240,240);
		window.add(title);
		window.add(text1);
		window.add(text2);
		btnSum.addActionListener(this);
		window.add(btnSum);	
		btnRest.addActionListener(this);
		window.add(btnRest);
		btnMultiply.addActionListener(this);
		window.add(btnMultiply);
		btnDivide.addActionListener(this);
		window.add(btnDivide);
		window.add(text3);
		text3.setEnabled(false);
		window.add(btnClose);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}


	public static void main(String[] args) 
	{
		new SecondEventExample();
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// Take txt1 value
		int one = Integer.parseInt(text1.getText());
		// Take txt2 value
		int two = Integer.parseInt(text2.getText());
		int sum = one + two;
		int rest = one - two;
		int multiply = one * two;
		int divide = one / two;
		
		if (e.getSource().equals(btnSum)) 
		{
		text3.setText(sum+"");
		}
		else if (e.getSource().equals(btnRest))
		{
		text3.setText(rest+"");
		}
		else if (e.getSource().equals(btnMultiply))
		{
		text3.setText(multiply+"");
		}
		else if (e.getSource().equals(btnDivide))
		{
		text3.setText(divide+"");
		}

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
}
