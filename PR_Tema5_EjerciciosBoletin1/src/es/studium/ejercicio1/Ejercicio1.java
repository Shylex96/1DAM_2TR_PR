package es.studium.ejercicio1;
// Tema 5

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements ActionListener, WindowListener
{

	// Atributos:
	Frame window = new Frame("Horas");
	Label lblHH1 = new Label("HH");
	Label lblHH2 = new Label("HH");
	Label lblMM1 = new Label("MM");
	Label lblMM2 = new Label("MM");
	TextField txt1HH1 = new TextField(10);
	TextField txt2HH2 = new TextField(10);
	TextField txt3MM1 = new TextField(10);
	TextField txt4MM2 = new TextField(10);
	Button btnCalc = new Button("Calcular");
	TextField txt5Result = new TextField(10);
	

	Ejercicio1() 
	{
		
		window.setSize(400, 130);
		window.addWindowListener(this);
		btnCalc.addActionListener(this);
		window.setLayout(new GridLayout(3, 4)); 
		window.add(lblHH1);
		window.add(txt1HH1);
		window.add(lblMM1);
		window.add(txt3MM1);
		window.add(lblHH2);
		window.add(txt2HH2);
		window.add(lblMM2);
		window.add(txt4MM2);
		
		txt5Result.setEnabled(false);
		window.add(btnCalc);
		window.add(txt5Result);

		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio1();

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
		int hh1 = Integer.parseInt(txt1HH1.getText());
		int hh2 = Integer.parseInt(txt2HH2.getText());
		
		int mm1 = Integer.parseInt(txt3MM1.getText());
		int mm2 = Integer.parseInt(txt4MM2.getText());
		
		int totalResult = Math.abs((hh1*60+mm1) - (hh2*60+mm2));
		
		txt5Result.setText(String.format("%02d:%02d", totalResult/60, totalResult%60));
	
		
		
	}
}