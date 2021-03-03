package Ejercicio7;

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

public class Ejercicio7 extends JFrame {

	// Nombre de las variables que le hemos asignado a los diferentes elementos del diseño
	private JPanel contentPane;
	private JTextField mostrarcantidad;
	private JTextField resfinal;
	private final double cambio = 166.386;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
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
	public Ejercicio7() {
		//Añadimos titulo
		setTitle("Calculadora cambio de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Creamos los componentes y guardamos información
		// Mostramos mensaje para que el usuario introduzca los valores deseados en su respectivo campo
		JLabel cantidad = new JLabel("Cantidad a convertir");
		cantidad.setBounds(49, 28, 150, 25);
		contentPane.add(cantidad);

		mostrarcantidad = new JTextField();
		mostrarcantidad.setBounds(49, 54, 130, 26);
		contentPane.add(mostrarcantidad);
		mostrarcantidad.setColumns(10);

		// Creamos los componentes y guardamos información
		// Mostramos mensaje al usuario con el resultado de la conversión
		final JLabel res = new JLabel("Resultado");
		res.setBounds(49, 112, 150, 25);
		contentPane.add(res);

		resfinal = new JTextField();
		resfinal.setColumns(10);
		resfinal.setBounds(49, 136, 130, 26);
		contentPane.add(resfinal);

		// Creamos los componentes, en este caso el botón desencadenará cierta acción
		// Realiza el cambio de euros a pesetas
		JButton eurosaptas = new JButton("Euros a ptas");
		eurosaptas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dinero = Double.parseDouble(mostrarcantidad.getText());
				dinero = dinero * cambio;
				resfinal.setText("" + dinero);
			}
		});
		eurosaptas.setBounds(287, 111, 117, 29);
		contentPane.add(eurosaptas);
		
		// Realiza el cambio de pesetas a euros
		final JButton cambiar = new JButton("Pesetas a euros");
		cambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double dinero = Double.parseDouble(mostrarcantidad.getText());
				dinero = dinero / cambio;
				resfinal.setText("" + dinero);

			}
		});
		cambiar.setBounds(266, 54, 165, 29);
		contentPane.add(cambiar);

	}

}
