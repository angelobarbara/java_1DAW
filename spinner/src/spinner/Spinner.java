package spinner;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;

public class Spinner extends JDialog {
	private static final String DD_MM_YYYY = "dd/MM/yyyy";
	private final JPanel contentPanel = new JPanel();
	private Locale locale = Locale.getDefault();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Spinner dialog = new Spinner();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Spinner() {
		setBounds(100, 100, 730, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		JSpinner spinner = new JSpinner();
		spinner.setBounds(291, 75, 91, 34);
		{
			spinner.setModel(new SpinnerDateModel(new Date(1491688800000L), null, null, Calendar.DAY_OF_YEAR));
			spinner.setEditor(new JSpinner.DateEditor(spinner, Spinner.DD_MM_YYYY));
			contentPanel.add(spinner);
		}
		{
			JButton btnHoyEs_1 = new JButton("Hoy Es");
			btnHoyEs_1.setBounds(10, 164, 91, 23);
			contentPanel.add(btnHoyEs_1);
			{
				JButton btnYoNac = new JButton("Fecha Nacimiento");
				btnYoNac.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LocalDate fechaDeNacimiento = getFechaNacimiento(spinner);
						try {
							JOptionPane.showMessageDialog(null,
									"Nací en " + Fecha.getDiaDeLaSemanaFechaPasada(fechaDeNacimiento)
											.getDisplayName(TextStyle.FULL, locale));
						} catch (HeadlessException | FechaNoValidaException e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}

					}
				});
				btnYoNac.setBounds(136, 164, 138, 23);
				contentPanel.add(btnYoNac);
			}
			{
				JButton btnDasParaTu = new JButton("Días Para Tu Cumpleaño");
				btnDasParaTu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LocalDate fechaDeNacimiento = getFechaNacimiento(spinner);
						JOptionPane.showMessageDialog(null, Fecha.cuentaAtrasCumpleannos(fechaDeNacimiento));
					}
				});
				btnDasParaTu.setBounds(307, 164, 222, 23);
				contentPanel.add(btnDasParaTu);
			}
			{
				JButton btnCumpleaos = new JButton("25 Cumpleaño");
				btnCumpleaos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LocalDate fechaDeNacimiento = getFechaNacimiento(spinner);
						LocalDate veinticincoCumpleannios = fechaDeNacimiento.plusYears(25);
						JOptionPane.showMessageDialog(null, "Mi 25 Cumpleaño "
								+ (veinticincoCumpleannios.isBefore(LocalDate.now()) ? " fue " : " será ") + " un "
								+ veinticincoCumpleannios.getDayOfWeek().getDisplayName(TextStyle.FULL, locale) + ".");
					}
				});
				btnCumpleaos.setBounds(567, 164, 126, 23);
				contentPanel.add(btnCumpleaos);
			}
			btnHoyEs_1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					LocalDate localDate = LocalDate.now();
					JOptionPane.showMessageDialog(null,
							"Hoy es" + localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, locale) + ", "
									+ localDate.getDayOfMonth() + " de "
									+ localDate.getMonth().getDisplayName(TextStyle.FULL, locale) + " de "
									+ localDate.getYear() + ".");
				}
			});
		}

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(1);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private LocalDate getFechaNacimiento(JSpinner spinner) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime((Date) spinner.getModel().getValue());
		LocalDate fecha = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH));
		return fecha;
	}

}
