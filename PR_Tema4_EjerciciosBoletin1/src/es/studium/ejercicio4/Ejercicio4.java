package es.studium.ejercicio4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

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
	
	Ejercicio4() 
	{
		window.setSize(400, 300);
		window.setLayout(new FlowLayout());
		window.add(caja1);
		window.add(caja2);
		window.add(caja3);
		window.add(caja4);
		window.add(caja5);
		window.add(caja6);
		window.add(caja7);
		window.add(caja8);
		window.add(caja9);
		window.add(caja10);
		
		window.add(btnComprobar);	
		window.setLocationRelativeTo(null);

		window.setVisible(true);
		
		
		
	}

	public static void main(String[] args) 
	{
		new Ejercicio4();
	}

}
