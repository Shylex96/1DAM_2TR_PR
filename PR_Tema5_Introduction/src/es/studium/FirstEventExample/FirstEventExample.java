package es.studium.FirstEventExample;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FirstEventExample implements ActionListener, WindowListener
{
	Frame window = new Frame("Events");
	Button btnMessage = new Button("Message");
	Button btnClose = new Button("Cerrar");
	

	FirstEventExample()
	{
		window.setLayout(new FlowLayout ());
		window.addWindowListener(this);
		window.setSize(250,150);
		btnMessage.addActionListener(this);
		window.add(btnMessage);
		btnClose.addActionListener(this);	
		window.add(btnClose);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}


	public static void main(String[] args) 
	{
		new FirstEventExample();
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource().equals(btnMessage)) {
			System.out.println("Console message.");
		} 
		else if (e.getSource().equals(btnClose)){
			System.out.println("Application has been closed.");	
			System.exit(0);
		}
		else {
			
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
