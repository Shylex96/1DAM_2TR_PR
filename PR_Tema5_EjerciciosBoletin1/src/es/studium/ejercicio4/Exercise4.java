package es.studium.ejercicio4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise4 implements ActionListener, WindowListener
{

	// Atributos:
	Frame window = new Frame("Aficiones");
	Checkbox caja1 = new Checkbox("Correr");
	Checkbox caja2 = new Checkbox("Nadar");
	Checkbox caja3 = new Checkbox("Andar");
	Checkbox caja4 = new Checkbox("Leer");
	Checkbox caja5 = new Checkbox("Ir al Cine");
	Checkbox caja6 = new Checkbox("Bailar");
	Checkbox caja7 = new Checkbox("Fútbol");
	Checkbox caja8 = new Checkbox("Tenis");
	Checkbox caja9 = new Checkbox("Baloncesto");
	Checkbox caja10 = new Checkbox("Deportes de Vela");


	Button btnComprobar = new Button("Comprobar");
	Panel pnlCheckBoxes = new Panel();
	Panel pnlBtn = new Panel();

	Exercise4() 
	{
		// Elementos de la ventana:
		window.setSize(350, 130);
		window.addWindowListener(this);
		btnComprobar.addActionListener(this);
		pnlCheckBoxes.setLayout(new FlowLayout());
		pnlCheckBoxes.add(caja1);
		pnlCheckBoxes.add(caja2);
		pnlCheckBoxes.add(caja3);
		pnlCheckBoxes.add(caja4);
		pnlCheckBoxes.add(caja5);
		pnlCheckBoxes.add(caja6);
		pnlCheckBoxes.add(caja7);
		pnlCheckBoxes.add(caja8);
		pnlCheckBoxes.add(caja9);
		pnlCheckBoxes.add(caja10);

		pnlBtn.setLayout(new FlowLayout());
		pnlBtn.add(btnComprobar);

		window.add(pnlCheckBoxes, "Center");
		window.add(pnlBtn, "South");


		window.setLocationRelativeTo(null);
		window.setResizable(false);

		window.setVisible(true);
	}	

	public static void main(String[] args)
	{
		new Exercise4();
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

		System.out.print("Aficiones elegidas: \n\n");
		if (caja1.getState()) {
			System.out.print("Correr \n");
		}
		if (caja2.getState()) {
			System.out.print("Nadar \n");
		}
		if (caja3.getState()) {
			System.out.print("Andar \n");
		}
		if (caja4.getState()) {
			System.out.print("Leer \n");
		}
		if (caja5.getState()) {
			System.out.print("Ir al Cine \n");
		}
		if (caja6.getState()) {
			System.out.print("Bailar \n");
		}
		if (caja7.getState()) {
			System.out.print("F�tbol \n");
		}
		if (caja8.getState()) {
			System.out.print("Tenis \n");
		}
		if (caja9.getState()) {
			System.out.print("Baloncesto \n");
		}
		if (caja10.getState()) {
			System.out.print("Deportes de Vela");
		}
		
	}

}


