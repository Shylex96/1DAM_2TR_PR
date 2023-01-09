package es.studium.Ejemplo8;
import java.awt.*;

public class Ejemplo8 {

	Frame ventana = new Frame("Opción Única");
	// En este caso, primero se define un grupo:
	CheckboxGroup chkgrGrupo = new CheckboxGroup();
	// Al crear los checkboxes, se indica la etiqueta, si está o no
	// activo y el grupo al que pertenece. En un grupo, solamente
	// podrá estar activo un checkbox.
	Checkbox chkUno = new Checkbox("Opción Uno", false, chkgrGrupo);
	Checkbox chkDos = new Checkbox("Opción Dos", false, chkgrGrupo);
	Checkbox chkTres = new Checkbox("Opción Tres", false, chkgrGrupo);

	public Ejemplo8()
	{
		ventana.setLayout(new FlowLayout());
		ventana.add(chkUno);
		ventana.add(chkDos);
		ventana.add(chkTres);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(100,150);
		ventana.setVisible(true);
	}


	public static void main(String[] args) 
	{
		new Ejemplo8();
	}

}
