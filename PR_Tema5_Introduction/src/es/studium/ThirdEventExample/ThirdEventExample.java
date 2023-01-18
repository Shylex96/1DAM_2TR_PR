package es.studium.ThirdEventExample;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ThirdEventExample implements WindowListener, MouseListener {
	
	Frame window = new Frame ("Ratón");
	
	
	ThirdEventExample()
	{
		window.setLayout(new FlowLayout());
		window.setBackground(Color.cyan);
		window.addWindowListener(this);
		window.addMouseListener(this);
		window.setSize(300,300);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		new ThirdEventExample();

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
	public void mouseClicked(MouseEvent e) {
		// 8 31 es el inicio de la esquina sup. izquierda.
		// 290 290 es el fin de la esquina inf. derecha
		// Estas medidas son las esquinas absolutas, tener en cuenta que habrá que sumar 
		// o restar sobre las posiciones para obtener el resultado en la posición esperada. 
		System.out.println("X: " + e.getX());
		System.out.println("Y: " + e.getY() + "\n");
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}
