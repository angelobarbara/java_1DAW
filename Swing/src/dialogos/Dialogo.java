package dialogos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Dialogo extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dialogo dialog = new Dialogo();
			dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dialogo() {
		// default icon, custom title
		// Object[] opciones = {"Aceptar"};
		JOptionPane.showMessageDialog(null, "Los cambios se han realizado correctamente", "Atención",
				JOptionPane.YES_NO_OPTION,null);

		Object[] options = { "Si", "No" };
		int b = JOptionPane.showOptionDialog(null, "¿Deseas guardar los cambios?", "Guardar Cambios",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, // do not use a custom Icon
				options, // the titles of buttons
				options[0]); // default button title
		
		

		
		
		Object[] opciones = { "Si", "No" };

		JOptionPane opcion3 = new JOptionPane("¿Seguro que desea guardar los cambios?",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.YES_NO_OPTION, null, // do not use a custom Icon
				options, // the titles of buttons
				options[0]); // default button title
				JDialog dialog = opcion3.createDialog(null, "Confirmación");
				
				dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
					dialog.setVisible(true);
				System.exit(0);
	}

}
