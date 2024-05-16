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

		pack();
		setTitle("Página principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setVisible(true);
		getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("SUPER PRÉSTAMOS S.A.");
		lblTitulo.setBounds(215, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().add(lblTitulo);

		JButton btnLogin = new JButton("LOG IN");
		btnLogin.setBounds(276, 203, 170, 44);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaLogin vistaLogin = new VistaLogin();
				vistaLogin.setVisible(true);
			}
		});

		JButton btnRegistro = new JButton("REGISTRO");
		btnRegistro.setBounds(276, 299, 170, 44);
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaRegistro vistaRegistro = new VistaRegistro();
				vistaRegistro.setVisible(true);
			}
		});
		getContentPane().add(btnRegistro);

		JButton btnFaq = new JButton("PREGUNTAS FRECUENTES");
		btnFaq.setBounds(276, 388, 170, 44);
		getContentPane().add(btnFaq);
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
