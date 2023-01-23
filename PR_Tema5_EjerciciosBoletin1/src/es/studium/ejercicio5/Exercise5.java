package es.studium.ejercicio5;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Exercise5 implements ActionListener, WindowListener
{

	// Atributos:
	Frame window = new Frame("Vehículos");

	// Grupo de CheckBoxes para poder seleccionar Ãºnicamente uno de cada grupo:
	CheckboxGroup chkgrGrupo1 = new CheckboxGroup();
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();
	CheckboxGroup chkgrGrupo3 = new CheckboxGroup();
	Label l1 = new Label("Tipo de motorización:");
	Checkbox chk1 = new Checkbox("Gasolina", false, chkgrGrupo1);
	Checkbox chk2 = new Checkbox("Diésel", false, chkgrGrupo1);
	Checkbox chk3 = new Checkbox("Híbrido", false, chkgrGrupo1);
	Checkbox chk4 = new Checkbox("Eléctrico", false, chkgrGrupo1);
	Label l2 = new Label("Número de puertas:");
	Checkbox chk5 = new Checkbox("3 puertas", false, chkgrGrupo2);
	Checkbox chk6 = new Checkbox("4 puertas", false, chkgrGrupo2);
	Checkbox chk7 = new Checkbox("5 puertas", false, chkgrGrupo2);
	Label l3 = new Label("Pintura Metalizada:");
	Checkbox chk8 = new Checkbox("Sí", false, chkgrGrupo3);
	Checkbox chk9 = new Checkbox("No", false, chkgrGrupo3);
	Panel pnlBtn = new Panel();

	// BotÃ³n para calcular y TextField donde poner el total del presupuesto:
	Button btnCalcular = new Button("Calcular presupuesto");
	TextField txtPresupuesto = new TextField(20);

	Exercise5() 
	{
		// Elementos de la ventana:
		window.setSize(425, 240);
		window.setLayout(new FlowLayout());
		window.setResizable(false);
		window.addWindowListener(this);
		btnCalcular.addActionListener(this);
		window.add(l1);
		window.add(chk1);
		window.add(chk2);
		window.add(chk3);
		window.add(chk4);
		window.add(l2);
		window.add(chk5);
		window.add(chk6);
		window.add(chk7);
		window.add(l3);
		window.add(chk8);
		window.add(chk9);
		window.add(pnlBtn);

		pnlBtn.add(btnCalcular);
		window.add(txtPresupuesto);
		txtPresupuesto.setEditable(false);
		window.setLocationRelativeTo(null);

		window.setVisible(true);



	}

	public static void main(String[] args)
	{
		new Exercise5();
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

		int totalPresupuesto = 0;


		if (chk1.getState()) {
			totalPresupuesto += 7000;
		}
		if (chk2.getState()) {
			totalPresupuesto += 8000;
		}
		if (chk3.getState()) {
			totalPresupuesto += 9000;
		}
		if (chk4.getState()) {
			totalPresupuesto += 8500;
		}
		if (chk5.getState()) {
			totalPresupuesto += 2000;
		}
		if (chk6.getState()) {
			totalPresupuesto += 3000;
		}
		if (chk7.getState()) {
			totalPresupuesto += 2500;
		}
		if (chk8.getState()) {
			totalPresupuesto += 1500;
		}
		if (chk9.getState()) {
			totalPresupuesto += 0;
		}

		txtPresupuesto.setText("Total: " +totalPresupuesto+" €");
	}
}

