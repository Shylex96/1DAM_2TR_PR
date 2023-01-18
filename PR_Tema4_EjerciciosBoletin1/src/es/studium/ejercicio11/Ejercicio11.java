package es.studium.ejercicio11;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio11 implements ActionListener, WindowListener {
	
	Frame ventana = new Frame("Tres en raya");
	MenuBar barraMenu = new MenuBar();

	Menu menuJugar = new Menu("Jugar");
	Menu menuEstadisticas = new Menu("Estadísticas");
	Menu menuAyuda = new Menu("Ayuda");
	
	// Menú Jugar:
	MenuItem menuJugarIA1 = new MenuItem("Jugar vs IA (Fácil)");
	MenuItem menuJugarIA2 = new MenuItem("Jugar vs IA (Medio)");
	MenuItem menuJugarIA3 = new MenuItem("Jugar vs IA (Difícil)");
	MenuItem menuJugarMulti = new MenuItem("Jugar vs Player (Multijugador)");
	
	// Menú Estadísticas:
	MenuItem menuEstadisticas1 = new MenuItem("Mostrar Estadísticas (Solo)");
	MenuItem menuEstadisticas2 = new MenuItem("Mostrar Estadísticas (Multijugador)");
	
	// Menú Ayuda:
	MenuItem menuAyudaDesplegable = new MenuItem("Aprender a jugar");
	
	Label text1 = new Label("Jugador 1");
	Label text2 = new Label("Jugador 2");
	
	Ejercicio11() {
		ventana.setLayout(new FlowLayout());

		ventana.setMenuBar(barraMenu);
		ventana.addWindowListener(this);

		menuJugar.add(menuJugarIA1);
		menuJugar.add(menuJugarIA2);
		menuJugar.add(menuJugarIA3);
		// Añadimos un separador
		menuJugar.addSeparator();
		menuJugar.add(menuJugarMulti);
		menuEstadisticas.add(menuEstadisticas1);
		menuEstadisticas.add(menuEstadisticas2);
		menuAyuda.add(menuAyudaDesplegable);
		
		barraMenu.add(menuJugar);
		barraMenu.add(menuEstadisticas);
		barraMenu.add(menuAyuda);
		
		// Btn de close
		
		/*
		 * En el ejemplo4 se puede ver los bounds más claros (y medidas)
		 * 
		ventana.add(text1);
		text1.setBounds(85, 50, 105, 20);
		
		ventana.add(text2);
		text2.setBounds(85x, 50y, 105anch, 20alto);
		*/
		
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.cyan);
		ventana.setSize(900, 700);
		ventana.setResizable(false);
		ventana.setVisible(true);
		
		
		
		
	}
	
	

	public static void main(String[] args) 
	{
		new Ejercicio11();
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
		// TODO Auto-generated method stub
		
	}
}

