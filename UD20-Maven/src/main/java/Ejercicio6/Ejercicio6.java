package Ejercicio6;

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

public class Ejercicio6 extends JFrame {

	private JPanel contentPane;
	private JTextField allturauser;
	private JLabel peso;
	private JTextField pesouser;
	private JButton IMC;
	private JLabel res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
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
	public Ejercicio6() {
		
		//Añadimos titulo
		setTitle("Indice de masa corporal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Creamos los componentes y guardamos información
		// Mostramos mensaje para que el usuario introduzca los valores deseados en sus respectivos campos
		JLabel altura = new JLabel("Altura (metros)");
		altura.setBounds(61, 48, 104, 26);
		contentPane.add(altura);
		
		allturauser = new JTextField();
		allturauser.setBounds(54, 72, 111, 26);
		contentPane.add(allturauser);
		allturauser.setColumns(10);
		
		peso = new JLabel("Peso (kilos)");
		peso.setBounds(251, 48, 111, 26);
		contentPane.add(peso);
		
		pesouser = new JTextField();
		pesouser.setColumns(10);
		pesouser.setBounds(251, 72, 111, 26);
		contentPane.add(pesouser);
		
		
		// Creamos los componentes, en este caso el botón desencadenará cierta acción
		// Realiza el cálculo IMC de una persona
		IMC = new JButton("Calcular IMC");
		IMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double altura=Double.parseDouble(allturauser.getText());
				Double peso= Double.parseDouble(pesouser.getText());
				Double imc= peso / (altura * altura);
				JButton boton = (JButton) e.getSource();
				res.setText(""+imc);
			}
		});
		IMC.setBounds(54, 121, 111, 29);
		contentPane.add(IMC);
		
		//Muestra el resultado
		res = new JLabel("");
		res.setBounds(172, 121, 163, 26);
		contentPane.add(res);
	}

}
