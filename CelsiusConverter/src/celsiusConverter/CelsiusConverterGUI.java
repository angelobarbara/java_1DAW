/**
 * 
 * @author Angelo Barbara
 * @version 1.0
 */

package celsiusConverter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

public class CelsiusConverterGUI extends JFrame {
	
	//GUI: Graphical User Interface o Interfaz gráfica de usuario
	//Tipo Layout: Absolute
	//Objetos swing utilizados:

	private JPanel contentPane;
	private JTextField tempTextField;
	private JLabel lblNewLabel;
	private JLabel fahrenheitLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelsiusConverterGUI frame = new CelsiusConverterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CelsiusConverterGUI() {
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tempTextField = new JTextField();
		tempTextField.setBounds(10, 21, 86, 20);
		contentPane.add(tempTextField);
		tempTextField.setColumns(10);
		tempTextField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				try {
					Float.parseFloat(tempTextField.getText());
				}catch(NumberFormatException e) {
					tempTextField.setForeground(Color.RED);
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				tempTextField.setForeground(Color.BLACK);
			}
		});

		lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setBounds(102, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		fahrenheitLabel = new JLabel("Fahrenheit");
		fahrenheitLabel.setBounds(102, 56, 119, 14);
		contentPane.add(fahrenheitLabel);

		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tempFahr;
				try {
					tempFahr = (int) ((Double.parseDouble(tempTextField.getText())) * 1.8 + 32);
					fahrenheitLabel.setText(tempFahr + " Fahrenheit");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(new JFrame(), "Introduzca valores númericos");
				}
			}
		});
		btnNewButton.setBounds(10, 52, 86, 23);
		contentPane.add(btnNewButton);

	}
}
