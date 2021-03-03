package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextArea;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		
		// Añadimos titulo
		setTitle("Ventana oyente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Creamos el componente y guardamos información
		JLabel eventos = new JLabel("Eventos");
		eventos.setBounds(20, 118, 61, 21);
		contentPane.add(eventos);

		// Area donde se mostrará la información según la acción que se realice con la ventana instanciada
		final JTextArea res = new JTextArea();
		res.setBounds(89, 17, 344, 230);
		contentPane.add(res);

		// Método que nos permite añadir un escuchador a la ventana instanciada
		// Diferentes acciones
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				res.append("Ventana activada \n");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				res.append("Ventana cerrada \n");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				res.append("Ventana desactivada \n");
			}

			@Override
			public void windowOpened(WindowEvent e) {
				res.append("Ventana abierta \n");
			}
		});

	}
}
