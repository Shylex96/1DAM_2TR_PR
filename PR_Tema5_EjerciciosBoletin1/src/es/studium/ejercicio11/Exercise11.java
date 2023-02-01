package es.studium.ejercicio11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise11 implements ActionListener, WindowListener {

	Frame window = new Frame("Tic Tac Toe");

	Button btn1 = new Button("");
	Button btn2 = new Button("");
	Button btn3 = new Button("");
	Button btn4 = new Button("");
	Button btn5 = new Button("");
	Button btn6 = new Button("");
	Button btn7 = new Button("");
	Button btn8 = new Button("");
	Button btn9 = new Button("");
	
	
	Dialog dlgWindow = new Dialog(window, "Game Finished", true);
	Label lblMessage = new Label ("Winner:");
	TextField txtWinner = new TextField("");

	String[][] board = new String[3][3];
	int turn = 0; 

	Exercise11() {
		
		// 3x3 matrix called "board" in order to save the state of every single button in every turn.
		board = new String[3][3];
		
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        board[i][j] = "";
		    }
		}
		
		window.setLayout(new GridLayout(3, 3));
		window.addWindowListener(this);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);

		window.add(btn1);
		window.add(btn2);
		window.add(btn3);
		window.add(btn4);
		window.add(btn5);
		window.add(btn6);
		window.add(btn7);
		window.add(btn8);
		window.add(btn9);

		window.setBackground(Color.gray);
		window.setSize(250, 250);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setResizable(false);
		
		dlgWindow.setSize(160, 100);
		dlgWindow.setLayout(new FlowLayout());
		dlgWindow.addWindowListener(this);
		dlgWindow.add(lblMessage);
		dlgWindow.add(txtWinner);
		dlgWindow.setLocationRelativeTo(null);
		dlgWindow.setResizable(false);
	}

	public static void main(String[] args) {
		new Exercise11();

	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		if (dlgWindow.isActive()) 
		{
			
			// Set board to Empty
			for (int i = 0; i < 3; i++) {
			    for (int j = 0; j < 3; j++) {
			        board[i][j] = "";
			    }
			}
			
			// Btn Reset:
			btn1.setLabel(""); // Up - Left
			btn2.setLabel(""); // Up - Center
			btn3.setLabel(""); // Up - Right
			btn4.setLabel(""); // Center - Left
			btn5.setLabel(""); // Center - Center
			btn6.setLabel(""); // Center - RighT	
			btn7.setLabel(""); // Down - Left
			btn8.setLabel(""); // Down - Center
			btn9.setLabel(""); // Down - Right
			
			// Establish turn to 0 to a new game.
			turn = 0;
			
			// Set buttons to active listen again.
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
			btn5.addActionListener(this);
			btn6.addActionListener(this);
			btn7.addActionListener(this);
			btn8.addActionListener(this);
			btn9.addActionListener(this);
			
			// Remove Dialog
			dlgWindow.setVisible(false);
			
		}else {
			System.out.println("Application has been closed.");
			System.exit(0);
		}
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
		// It check which button has been pressed and establish the value at current position in "board" array:
		
		// With "e.getSource()" scan if the button was 
		// pressed and it establish the value:("X" or "O")
		
		if (e.getSource().equals(btn1)) 
		{
			if(turn == 0) {
				btn1.setLabel("O");
				board[0][0]="O";
				turn = 1;
			} else {
				btn1.setLabel("X");
				board[0][0]="X";
				turn = 0;	
			}
			// Every turn I remove the current button listener (So player can clic another button).
			btn1.removeActionListener(this);
			// After this, we called "checkWinner" method to verify if any player has won.
			// This will be executed after every round to check if someone has won the game in any row, column or diagonal.
			checkWinner();
		}
		else if (e.getSource().equals(btn2)) 
		{
			if(turn == 0) {
				btn2.setLabel("O");
				board[0][1]="O";
				turn = 1;
			} else {
				btn2.setLabel("X");
				board[0][1]="X";
				turn = 0;
			}
			btn2.removeActionListener(this);
			checkWinner();
		}
		else if (e.getSource().equals(btn3)) 
		{
			if(turn == 0) {
				btn3.setLabel("O");
				board[0][2]="O";
				turn = 1;
			} else {
				btn3.setLabel("X");
				board[0][2]="X";
				turn = 0;
			}
			btn3.removeActionListener(this);
			checkWinner();
		}
		else if (e.getSource().equals(btn4)) 
		{
			if(turn == 0) {
				btn4.setLabel("O");
				board[1][0]="O";
				turn = 1;
			} else {
				btn4.setLabel("X");
				board[1][0]="X";
				turn = 0;
			}
			btn4.removeActionListener(this);
			checkWinner();
		}
		else if (e.getSource().equals(btn5)) 
		{
			if(turn == 0) {
				btn5.setLabel("O");
				board[1][1]="O";
				turn = 1;
			} else {
				btn5.setLabel("X");
				board[1][1]="X";
				turn = 0;
			}
			btn5.removeActionListener(this);
			checkWinner();
		}
		else if (e.getSource().equals(btn6)) 
		{
			if(turn == 0) {
				btn6.setLabel("O");
				board[1][2]="O";
				turn = 1;
			} else {
				btn6.setLabel("X");
				board[1][2]="X";
				turn = 0;
			}
			btn6.removeActionListener(this);
			checkWinner();
		}
		else if (e.getSource().equals(btn7)) 
		{
			if(turn == 0) {
				btn7.setLabel("O");
				board[2][0]="O";
				turn = 1;
			} else {
				btn7.setLabel("X");
				board[2][0]="X";
				turn = 0;
			}
			btn7.removeActionListener(this);
			checkWinner();
		}
		else if (e.getSource().equals(btn8)) 
		{
			if(turn == 0) {
				btn8.setLabel("O");
				board[2][1]="O";
				turn = 1;
			} else {
				btn8.setLabel("X");
				board[2][1]="X";
				turn = 0;
			}
			btn8.removeActionListener(this);
			checkWinner();
		}
		else if (e.getSource().equals(btn9)) 
		{
			if(turn == 0) {
				btn9.setLabel("O");
				board[2][2]="O";
				turn = 1;
			} else {
				btn9.setLabel("X");
				board[2][2]="X";
				turn = 0;
			}
			btn9.removeActionListener(this);
			checkWinner();
		}
	}

	private void checkWinner() {
		// Make a call to "checkWinner" method and verify if any of the possible combinations won the game yet.
		
		// Check rows.
		for (int i = 0; i < 3; i++) {
			if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("")) {
				
				// If it finds a win combinations it establish at "winnerResult" TextField if it was an "X" or "O".
				System.out.println("Winner: " +board[i][0]);
				txtWinner.setText("    " +board[i][0]);
				txtWinner.setEditable(false);
				dlgWindow.setVisible(true);
				return;
			}
		}
		
		// Check columns.
		for (int i = 0; i < 3; i++) {
			if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("")) {
				
				// If it finds a win combinations it establish at "winnerResult" TextField if it was an "X" or "O".
				System.out.println("Winner: " +board[0][i]);
				txtWinner.setText("    " +board[0][i]);
				txtWinner.setEditable(false);
				dlgWindow.setVisible(true);
				return;
			}
		}
		
		// Check diagonals.
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("")) {
			
			System.out.println("Winner: " +board[0][0]);
			txtWinner.setText("    " +board[0][0]);
			txtWinner.setEditable(false);
			dlgWindow.setVisible(true);
			return;
		}
		if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("")) {
			
			System.out.println("Winner: " +board[0][2]);
			txtWinner.setText("    " +board[0][2]);
			txtWinner.setEditable(false);
			dlgWindow.setVisible(true);
			return;
		}
		
		// Check Tie
		boolean Tie = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equals("")) {
					Tie = false;
					break;
				}
			}
		}
		if (Tie) {
			System.out.println("¡Tie!");
			txtWinner.setText("   ¡Tie!");
			txtWinner.setEditable(false);
			dlgWindow.setVisible(true);
			
		}
	}
}




