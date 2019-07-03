package my.numberaddition;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Rectangle;

public class NumberAdditionGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberAdditionGUI window = new NumberAdditionGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumberAdditionGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(30, 24, 386, 192);
		panel.setBorder(new TitledBorder(null, "Number Addition", TitledBorder.LEADING, TitledBorder.TOP, null,
				UIManager.getColor("Desktop.background")));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("First Number:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(43, 40, 90, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Second Number:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(43, 70, 90, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Result:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(43, 100, 90, 14);
		panel.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(218, 37, 150, 20);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(218, 67, 150, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(218, 97, 150, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				// We have to parse the text to a type float.
				try {
					num1 = Float.parseFloat(textField.getText());
					num2 = Float.parseFloat(textField_1.getText());
					// Now we can perform the addition.
					result = num1 + num2;
					// We will now pass the value of result to jTextField3.
					// At the same time, we are going to
					// change the value of result from a float to a string.
					textField_2.setText(String.valueOf(result));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(frame, "Debes introducir valores válidos");
				}
			}
		});
		btnNewButton.setBounds(170, 146, 91, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_1.setBounds(277, 146, 91, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(325, 227, 91, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
