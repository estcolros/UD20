package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	// Nombre de las variables que le hemos asignado a los diferentes elementos del diseño
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Creamos los componentes y guardamos información
		// Mostramos mensaje para que el usuario introduzca los valores deseados con sus respectivos campos
		final JLabel user = new JLabel("Introduce los valores para cambiar mi tamaño");
		user.setBounds(82, 51, 307, 16);
		contentPane.add(user);

		JLabel texto1 = new JLabel("Ancho");
		texto1.setBounds(116, 101, 61, 16);
		contentPane.add(texto1);

		JLabel texto2 = new JLabel("Largo");
		texto2.setBounds(288, 101, 61, 16);
		contentPane.add(texto2);

		textField = new JTextField();
		textField.setBounds(82, 141, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(259, 141, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		// Creamos los componentes, en estos casos el botón desencadenará cierta acción
		// La acción en este caso sería el cambio del tamaño de la ventana
		// Boton cambiar 
		JButton cambio = new JButton("Cambiar");
		cambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ancho = Integer.parseInt(textField.getText());
				int largo = Integer.parseInt(textField_1.getText());
				user.setBounds(124, 50, ancho, largo);
			}
		});
		cambio.setBounds(174, 197, 117, 29);
		contentPane.add(cambio);
	}
}
