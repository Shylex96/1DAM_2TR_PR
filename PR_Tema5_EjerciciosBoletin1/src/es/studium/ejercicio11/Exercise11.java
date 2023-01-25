package es.studium.ejercicio11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise11 implements ActionListener, WindowListener {

	Frame window = new Frame("3 en Raya");

	Button boton1 = new Button("");
	Button boton2 = new Button("");
	Button boton3 = new Button("");
	Button boton4 = new Button("");
	Button boton5 = new Button("");
	Button boton6 = new Button("");
	Button boton7 = new Button("");
	Button boton8 = new Button("");
	Button boton9 = new Button("");
	Label ganador = new Label("Ganador:");
	TextField resultGanador = new TextField ("");

	String[][] tablero = new String[3][3];
	int turno = 0; 

	Exercise11() {
		
		// Matriz de 3x3 llamada "tablero" para almacenar el estado de cada botón en cada turno.
		tablero = new String[3][3];
		
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        tablero[i][j] = "";
		    }
		}
		
		window.setLayout(new GridLayout(4, 3));
		window.addWindowListener(this);

		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);
		boton6.addActionListener(this);
		boton7.addActionListener(this);
		boton8.addActionListener(this);
		boton9.addActionListener(this);

		window.add(boton1);
		window.add(boton2);
		window.add(boton3);
		window.add(boton4);
		window.add(boton5);
		window.add(boton6);
		window.add(boton7);
		window.add(boton8);
		window.add(boton9);
		window.add(ganador);
		window.add(resultGanador);

		window.setBackground(Color.CYAN);
		window.setSize(250, 250);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setResizable(false);
	}

	public static void main(String[] args) {
		new Exercise11();

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
		// Se verifica qué botón ha sido presionado y se establece el valor correspondiente en la posición del array "tablero" correspondiente:
		
		// Con e.getSource() se comprueba si se pulsó el botón y se 
		// establece el valor correspondiente ("X" o "O") en la matriz.
		
		if (e.getSource().equals(boton1)) 
		{
			if(turno == 0) {
				boton1.setLabel("O");
				tablero[0][0]="O";
				turno = 1;
			} else {
				boton1.setLabel("X");
				tablero[0][0]="X";
				turno = 0;	
			}
			// Quito la escucha del botón para poder hacer clic en otro y que se ponga donde he marcado.
			boton1.removeActionListener(this);
			// Luego se llama al método "comprobarGanador" para verificar si alguno de los jugadores ha ganado.
			// Se ejecuta después de cada jugada y comprueba si alguno de los jugadores ha ganado en alguna fila, columna o diagonal.
			comprobarGanador();
		}
		else if (e.getSource().equals(boton2)) 
		{
			if(turno == 0) {
				boton2.setLabel("O");
				tablero[0][1]="O";
				turno = 1;
			} else {
				boton2.setLabel("X");
				tablero[0][1]="X";
				turno = 0;
			}
			boton2.removeActionListener(this);
			comprobarGanador();
		}
		else if (e.getSource().equals(boton3)) 
		{
			if(turno == 0) {
				boton3.setLabel("O");
				tablero[0][2]="O";
				turno = 1;
			} else {
				boton3.setLabel("X");
				tablero[0][2]="X";
				turno = 0;
			}
			boton3.removeActionListener(this);
			comprobarGanador();
		}
		else if (e.getSource().equals(boton4)) 
		{
			if(turno == 0) {
				boton4.setLabel("O");
				tablero[1][0]="O";
				turno = 1;
			} else {
				boton4.setLabel("X");
				tablero[1][0]="X";
				turno = 0;
			}
			boton4.removeActionListener(this);
			comprobarGanador();
		}
		else if (e.getSource().equals(boton5)) 
		{
			if(turno == 0) {
				boton5.setLabel("O");
				tablero[1][1]="O";
				turno = 1;
			} else {
				boton5.setLabel("X");
				tablero[1][1]="X";
				turno = 0;
			}
			boton5.removeActionListener(this);
			comprobarGanador();
		}
		else if (e.getSource().equals(boton6)) 
		{
			if(turno == 0) {
				boton6.setLabel("O");
				tablero[1][2]="O";
				turno = 1;
			} else {
				boton6.setLabel("X");
				tablero[1][2]="X";
				turno = 0;
			}
			boton6.removeActionListener(this);
			comprobarGanador();
		}
		else if (e.getSource().equals(boton7)) 
		{
			if(turno == 0) {
				boton7.setLabel("O");
				tablero[2][0]="O";
				turno = 1;
			} else {
				boton7.setLabel("X");
				tablero[2][0]="X";
				turno = 0;
			}
			boton7.removeActionListener(this);
			comprobarGanador();
		}
		else if (e.getSource().equals(boton8)) 
		{
			if(turno == 0) {
				boton8.setLabel("O");
				tablero[2][1]="O";
				turno = 1;
			} else {
				boton8.setLabel("X");
				tablero[2][1]="X";
				turno = 0;
			}
			boton8.removeActionListener(this);
			comprobarGanador();
		}
		else if (e.getSource().equals(boton9)) 
		{
			if(turno == 0) {
				boton9.setLabel("O");
				tablero[2][2]="O";
				turno = 1;
			} else {
				boton9.setLabel("X");
				tablero[2][2]="X";
				turno = 0;
			}
			boton9.removeActionListener(this);
			comprobarGanador();
		}
	}

	private void comprobarGanador() {
		// Llamo al método "comprobarGanador" y verifico las posibles combinaciones ganadoras.
		
		// Comprobar filas
		for (int i = 0; i < 3; i++) {
			if (tablero[i][0].equals(tablero[i][1]) && tablero[i][1].equals(tablero[i][2]) && !tablero[i][0].equals("")) {
				// Si se encuentra combinación ganadora se establece en el TextField "resultGanador" si fue "X" o "O" el ganador.
				resultGanador.setText("¡" + tablero[i][0] + " ha ganado!");
				// También agrego un "Syso" para que salga por consola.
				System.out.println("¡" + tablero[i][0] + " ha ganado!");
				return;
			}
		}
		
		// Comprobar columnas
		for (int i = 0; i < 3; i++) {
			if (tablero[0][i].equals(tablero[1][i]) && tablero[1][i].equals(tablero[2][i]) && !tablero[0][i].equals("")) {
				resultGanador.setText("¡" + tablero[0][i] + " ha ganado!");
				System.out.println("¡" + tablero[0][i] + " ha ganado!");
				return;
			}
		}
		
		// Comprobar diagonales
		if (tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2]) && !tablero[0][0].equals("")) {
			resultGanador.setText("¡" + tablero[0][0] + " ha ganado!");
			System.out.println("¡" + tablero[0][0] + " ha ganado!");
			return;
		}
		if (tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][0]) && !tablero[0][2].equals("")) {
			resultGanador.setText("¡" + tablero[0][2] + " ha ganado!");
			System.out.println("¡" + tablero[0][2] + " ha ganado!");
			return;
		}
		
		// Comprobar empate
		boolean empate = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j].equals("")) {
					empate = false;
					break;
				}
			}
		}
		if (empate) {
			resultGanador.setText("¡Empate!");
			System.out.println("¡Empate!");
		}
	}
}






