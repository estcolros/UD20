package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {
	
	// Nombre de las variables que le hemos asignado a los diferentes elementos del diseño
	private JPanel contentPane;
	private JLabel label;
	private JLabel usr;
	private JLabel res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setTitle("Ventana con interaccion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Creamos los componente y guardamos información
		usr = new JLabel("Has pulsado:");
		usr.setBounds(151, 76, 89, 21);
		contentPane.add(usr);
		
		// Creamos los componentes, dependiendo del botón desencadenará una acción u otra
		//Mostrará que botón a seleccionado el usuario
		//Boton 1
		JButton boton1 = new JButton("Boton 1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton boton = (JButton) e.getSource();
				res.setText(boton.getText());
			}
		});
		boton1.setBounds(83, 147, 117, 29);
		contentPane.add(boton1);
		//Boton 2
		JButton boton2 = new JButton("Boton 2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton boton = (JButton) e.getSource();
				res.setText(boton.getText());
			}
		});
		boton2.setBounds(236, 147, 117, 29);
		contentPane.add(boton2);
		
		//Se mostrará el botón seleccionado
		res = new JLabel("");
		res.setBounds(236, 76, 76, 21);
		contentPane.add(res);
		
	
		
	}
}
