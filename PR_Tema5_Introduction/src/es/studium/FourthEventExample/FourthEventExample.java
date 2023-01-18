package es.studium.FourthEventExample;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FourthEventExample implements WindowListener, ItemListener {
	Frame window = new Frame("Events");
	Choice choList = new Choice();

	FourthEventExample() {
		window.setLayout(new FlowLayout());
		// window.setBackground(Color.cyan);
		window.addWindowListener(this);
		choList.add("Select a color..");
		choList.add("Red");
		choList.add("Blue");
		choList.add("Green");
		choList.add("Yellow");
		choList.addItemListener(this);
		window.add(choList);

		window.setSize(240, 170);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new FourthEventExample();
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
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
	public void itemStateChanged(ItemEvent e) {
		if (e.getItem().equals("Red")) 
		{
			window.setBackground(Color.red);
		} else if (e.getItem().equals("Blue")) 
		{
			window.setBackground(Color.BLUE);
		} else if (e.getItem().equals("Green")) 
		{
			window.setBackground(Color.GREEN);
		} else if (e.getItem().equals("Yellow")) 
		{
			window.setBackground(Color.YELLOW);
		}
	}
}