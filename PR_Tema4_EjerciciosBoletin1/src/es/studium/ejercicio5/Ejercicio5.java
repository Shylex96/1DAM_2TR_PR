package es.studium.ejercicio5;
import java.awt.*;

public class Ejercicio5 {
	
	
	// Atributos:
	Frame window = new Frame("Vehículos");
	
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
	
	Button btnCalcular = new Button("Calcular presupuesto");
	
	Ejercicio5() 
	{
		window.setSize(400, 300);
		window.setLayout(new FlowLayout());
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
		window.setLocationRelativeTo(null);

		window.setVisible(true);
		
		
		
	}

	public static void main(String[] args) 
	{
		new Ejercicio5();
	}

}
