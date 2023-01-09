package es.studium.Ejemplo6;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ejemplo6 {
	
	// Atributos o componentes:
	Frame window = new Frame("Border Layout");
			
	Button btnNorte = new Button("Norte");
	Button btnSur = new Button("Sur");
	Button btnEste = new Button("Este");
	Button btnOeste = new Button("Oeste");
	Button btnCentro = new Button("Centro");
	
	Panel pnlNorte = new Panel ();
	Panel pnlSur = new Panel ();
	Panel pnlEste= new Panel ();
	Panel pnlOeste = new Panel ();
	Panel pnlCentro = new Panel ();
	
	Ejemplo6()
	{

		window.setSize(200, 140);
		window.setLayout(new BorderLayout()); 
		pnlNorte.add(btnNorte);
		window.add(pnlNorte, "North");
		
		pnlSur.add(btnSur);
		window.add(pnlSur, "South");
		
		pnlEste.add(btnEste);
		window.add(pnlEste, "East");
		
		pnlOeste.add(btnOeste);
		window.add(pnlOeste, "West");
		
		pnlCentro.add(btnCentro);
		window.add(pnlCentro, "Center");
		
		
		
		window.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Ejemplo6();
	}

}
