package es.studium.ejercicio4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ejercicio4 {
	
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
	
	Ejercicio4() 
	{
		window.setSize(350, 130);
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
		new Ejercicio4();
	}

}
