package my.numberaddition;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class NumberAdition2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberAdition frame = new NumberAdition();
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
	public NumberAdition2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSdfasdf = new JLabel("Primer N\u00FAmero");
		lblSdfasdf.setBackground(Color.WHITE);
		lblSdfasdf.setBounds(57, 40, 76, 14);
		contentPane.add(lblSdfasdf);
		
		JLabel lblSdfsdf = new JLabel("Segundo N\u00FAmero");
		lblSdfsdf.setBounds(57, 86, 95, 14);
		contentPane.add(lblSdfsdf);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(76, 142, 76, 14);
		contentPane.add(lblResultado);
		
		textField = new JTextField();
		textField.setBounds(154, 37, 242, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 83, 242, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(154, 139, 242, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("A\u00F1adir");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// First we define float variables.
			    float num1, num2, result;
			    // We have to parse the text to a type float.
			    num1 = Float.parseFloat(textField.getText());
			    num2 = Float.parseFloat(textField_1.getText());
			   // Now we can perform the addition.
			    result = num1+num2;
			    // We will now pass the value of result to jTextField3.
			    // At the same time, we are going to
			    // change the value of result from a float to a string.
			    textField_2.setText(String.valueOf(result));
			}
		});
		btnAdd.setBounds(199, 182, 91, 23);
		contentPane.add(btnAdd);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(324, 239, 91, 23);
		contentPane.add(btnSalir);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			    textField_1.setText("");
			    textField_2.setText("");
			}
		});
		btnBorrar.setBounds(305, 182, 91, 23);
		contentPane.add(btnBorrar);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
}
