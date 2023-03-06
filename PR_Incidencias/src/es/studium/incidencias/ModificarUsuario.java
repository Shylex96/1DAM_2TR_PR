package es.studium.incidencias;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ModificarUsuario implements ActionListener, WindowListener {
	Frame windowModificarUsuario = new Frame("Editar Usuario");
	Label lblElegirUsuario = new Label ("Elegir el usuario a modificar:");
	Choice choUsuarios = new Choice();

	Button btnModificar = new Button ("Modificar");
	Frame windowUpdateUsuario = new Frame ("Modificando usuario");
	Label lblCambiarDatos = new Label ("Modifique los campos del Usuario");
	Label lblNombreNuevo = new Label ("Nuevo nombre:");
	TextField txtNombreNuevo = new TextField (10);
	Label lblClaveNuevo = new Label ("Nueva clave:");
	TextField txtClaveNuevo = new TextField (10);
	Label lblRepetirClaveNuevo = new Label ("Repetir clave:");
	TextField txtRepetirClaveNuevo = new TextField (10);
	Label lblCorreoNuevo = new Label ("Nuevo correo:");
	TextField txtCorreoNuevo = new TextField (10);
	Button btnAceptarModificacion = new Button ("Modificar");
	Button btnCancelarModificacion = new Button ("Cancelar");

	Dialog dlgCancelarModificacion = new Dialog (windowUpdateUsuario, "Cancelar Modificación" , false);
	Label lblCancelarModificacion = new Label ("Modificación cancelada");
	Dialog dlgMensaje = new Dialog (windowUpdateUsuario, "Cancelar Modificación" , false);
	Label lblMensaje = new Label ("");
	String idUsuarios = "";
	
	Conexion conexion = new Conexion();

	ModificarUsuario() {

		windowModificarUsuario.setLayout(new FlowLayout());
		windowModificarUsuario.addWindowListener(this);
		windowModificarUsuario.setResizable(false);
		windowModificarUsuario.setSize(200, 200); 
		windowModificarUsuario.setLocationRelativeTo(null);
		windowModificarUsuario.setBackground(Color.orange);

		windowModificarUsuario.add(lblElegirUsuario);
		// Rellenar choice
		conexion.rellenarChoiceUsuarios(choUsuarios);
		windowModificarUsuario.add(choUsuarios);
		btnModificar.addActionListener(this);
		windowModificarUsuario.add(btnModificar);


		windowModificarUsuario.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		if (dlgCancelarModificacion.isActive()) {
			dlgCancelarModificacion.setVisible(false);
			windowUpdateUsuario.setVisible(false);
		}
		windowModificarUsuario.setVisible(false);
		windowUpdateUsuario.setVisible(false);
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
		// Si haces clic en Eliminar:
		if (e.getSource().equals(btnModificar)) {

			// Si el usuario no es el 0 entonces permitimos borrar.
			if (choUsuarios.getSelectedIndex()!=0) {
				
				windowUpdateUsuario.setLayout(new FlowLayout());
				windowUpdateUsuario.addWindowListener(this);
				windowUpdateUsuario.setResizable(false);
				windowUpdateUsuario.setSize(250, 220); 
				windowUpdateUsuario.setLocationRelativeTo(null);
				windowUpdateUsuario.setBackground(Color.orange);
				windowUpdateUsuario.add(lblCambiarDatos);

				windowUpdateUsuario.add(lblNombreNuevo);
				windowUpdateUsuario.add(txtNombreNuevo);
				windowUpdateUsuario.add(lblClaveNuevo);
				txtClaveNuevo.setEchoChar('*');
				windowUpdateUsuario.add(txtClaveNuevo);
				windowUpdateUsuario.add(lblRepetirClaveNuevo);
				txtRepetirClaveNuevo.setEchoChar('*');
				windowUpdateUsuario.add(txtRepetirClaveNuevo);
				windowUpdateUsuario.add(lblCorreoNuevo);
				windowUpdateUsuario.add(txtCorreoNuevo);

				windowUpdateUsuario.add(btnAceptarModificacion);
				btnAceptarModificacion.addActionListener(this);
				btnCancelarModificacion.addActionListener(this);
				windowUpdateUsuario.add(btnCancelarModificacion);
				// Antes de hacer visible la ventana metemos los datos del usuario
				
				String tabla[] = choUsuarios.getSelectedItem().split("-");
				String resultado = conexion.getDatosEdicion(tabla[0]);
				
				String datos[] = resultado.split("-");
				idUsuarios = datos[0];
				txtNombreNuevo.setText(datos[1]);
				txtClaveNuevo.setText("");
				txtRepetirClaveNuevo.setText("");
				txtCorreoNuevo.setText(datos[3]);
				

				windowUpdateUsuario.setVisible(true);
				
			}

		}
		
		else if (e.getSource().equals(btnAceptarModificacion)) {
			dlgMensaje.setLayout(new FlowLayout());
			dlgMensaje.setSize(250,100);
			dlgMensaje.addWindowListener(this);
			
			if(txtNombreNuevo.getText().length()==0||txtClaveNuevo.getText().length()==0||txtRepetirClaveNuevo.getText().length()==0||txtCorreoNuevo.getText().length()==0)
			{
				lblMensaje.setText("Los campos están vacíos");
			}
			// Comprobar las claves
			else if(!txtClaveNuevo.getText().equals(txtRepetirClaveNuevo.getText()))
			{
				lblMensaje.setText("Las claves no coinciden");
			}
			else
			{
				// Modificar
				String sentencia = "UPDATE usuarios SET nombreUsuario='"+txtNombreNuevo.getText()+"', claveUsuario = SHA2('"+txtClaveNuevo.getText()+"',256), correoUsuario = '"+txtCorreoNuevo.getText()+"' WHERE idUsuarios="+idUsuarios+";";
				int respuesta = conexion.modificarUsuario(sentencia);
				if(respuesta!=0)
				{
					// Mostrar Mensaje Error
					lblMensaje.setText("Error en Modificación");
				}
			}

			lblMensaje.setText("Cambios realizados con éxito.");
			dlgMensaje.setBackground(Color.green);
			dlgMensaje.add(lblMensaje);
			dlgMensaje.setResizable(false);
			dlgMensaje.setLocationRelativeTo(null);
			dlgMensaje.setVisible(true);
		}
	}
}
