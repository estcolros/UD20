package Ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
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
	public Ejercicio5() {
		//Añadimos titulo
		setTitle("Todos los eventos del botón");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Area donde se mostrará la información según la acción que se realice con el mouse
		final JTextArea res = new JTextArea();
		
		// Método que nos permite añadir un escuchador al mouse
		// Diferentes acciones
		res.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				res.append("El mouse se a clicado \n");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				res.append("El mouse se a presionado \n");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				res.append("El mouse se a salido \n");
			}
		});
		res.setBounds(25, 58, 407, 187);
		contentPane.add(res);
		
		// Creamos los componentes, en este caso el botón desencadenará cierta acción
		// Limpiará la información mostrada
		JButton limpiar = new JButton("Limpiar");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res.setText(null);
			}
		});

		limpiar.setBounds(143, 17, 150, 29);
		contentPane.add(limpiar);

	}

}
