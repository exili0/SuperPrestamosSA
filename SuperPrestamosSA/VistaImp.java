package SuperPrestamosSA;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VistaImp extends JFrame implements Vista {

	private Modelo modelo;
	private Controlador controlador;

	public VistaImp() {

		JFrame frame1 = new JFrame("Ventana Principal");
		
		frame1.setSize(800, 600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame1.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("SUPER PRÉSTAMOS S.A.");
		lblTitulo.setBounds(215, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame1.getContentPane().add(lblTitulo);

		JButton btnLogin = new JButton("LOG IN");
		btnLogin.setBounds(276, 203, 170, 44);
		frame1.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				VistaLogin vistaLogin = new VistaLogin();
//				vistaLogin.setVisible(true);
			}
		});

		JButton btnRegistro = new JButton("REGISTRO");
		btnRegistro.setBounds(276, 285, 170, 44);
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				VistaRegistro vistaRegistro = new VistaRegistro();
//				vistaRegistro.setVisible(true);
			}
		});
		frame1.getContentPane().add(btnRegistro);

		JButton btnFaq = new JButton("PREGUNTAS FRECUENTES");
		btnFaq.setBounds(276, 375, 170, 44);
		frame1.getContentPane().add(btnFaq);
		
		frame1.setVisible(true);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;

	}

	public Container getContenedor() {

		return null;
	}
}
