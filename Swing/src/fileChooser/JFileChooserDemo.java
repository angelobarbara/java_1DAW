package fileChooser;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextArea;
import javax.swing.JSeparator;

public class JFileChooserDemo {

	private JFrame frmFilechooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserDemo window = new JFileChooserDemo();
					window.frmFilechooser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JFileChooserDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFilechooser = new JFrame();
		frmFilechooser.setTitle("FileChooser");
		frmFilechooser.setBounds(100, 100, 450, 300);
		frmFilechooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmFilechooser.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnArchivo.add(mntmOpen);
		
		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);
		
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnArchivo.add(mntmExit);
		frmFilechooser.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 422, 230);
		frmFilechooser.getContentPane().add(textArea);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt", "txt");
		        fileChooser.addChoosableFileFilter(filter);		      
		        int returnValue = fileChooser.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		          try{
		        	  File selectedFile = fileChooser.getSelectedFile();
		        	  textArea.read(new FileReader(selectedFile.getAbsolutePath()),null);
		          }catch(IOException ex){
		        	  System.err.println(ex.getMessage());		        	  
		          }
		        }
			}
		});
		
	}
}
