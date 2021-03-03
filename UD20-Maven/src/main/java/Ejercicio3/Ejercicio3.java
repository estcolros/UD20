package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Creamos los componente y guardamos información
		JLabel boton1 = new JLabel("Boton 1:");
		boton1.setBounds(53, 66, 77, 16);
		contentPane.add(boton1);
		
		//Mostrará el resultado de la acción desencadenada por el boton 1
		final JLabel res1 = new JLabel("");
		res1.setBounds(106, 66, 102, 16);
		contentPane.add(res1);
		
		// Creamos los componente y guardamos información

		JLabel boton2 = new JLabel("Boton 2:");
		boton2.setBounds(229, 66, 77, 16);
		contentPane.add(boton2);
		
		//Mostrará el resultado de la acción desencadenada por el boton 2
		final JLabel res2 = new JLabel("");
		res2.setBounds(285, 66, 102, 16);
		contentPane.add(res2);
		
		// Creamos los componentes, en estos casos los botones desencadenaran ciertas acciones
		//Boton 1 y 2, misma función: contabilizan las veces que se presiononaron
		JButton resbot1 = new JButton("Boton 1");
		resbot1.addActionListener(new ActionListener() {
		int numVeces=1;
			
			public void actionPerformed(ActionEvent e) {	
				JButton boton = (JButton) e.getSource();
				res1.setText(numVeces + " veces");
				numVeces++;
				;}
		});
		resbot1.setBounds(53, 128, 117, 29);
		contentPane.add(resbot1);
		
		JButton resbot2 = new JButton("Boton 2");
		resbot2.addActionListener(new ActionListener() {
			int numVeces=1;
			public void actionPerformed(ActionEvent e) {
				JButton boton = (JButton) e.getSource();
				res2.setText(numVeces + " veces");
				numVeces++;
				;}
			
		});
		resbot2.setBounds(229, 128, 117, 29);
		contentPane.add(resbot2);
	}

}
