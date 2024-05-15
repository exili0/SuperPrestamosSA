package SuperPrestamosSA;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class VistaRegistro extends JFrame implements Vista{
	public VistaRegistro() {
		getContentPane().setLayout(null);
		
		pack();
		setTitle("Página registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 532);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("REGISTRO");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(215, 10, 380, 136);
		getContentPane().add(lblTitulo);

		JButton btnRegistroAdmin = new JButton("REGISTRARSE COMO ADMINISTRADOR");
		btnRegistroAdmin.setBackground(new Color(255, 255, 255));
		btnRegistroAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistroAdmin.setBounds(216, 210, 343, 47);
		getContentPane().add(btnRegistroAdmin);
		
		JButton btnRegistroSuperE = new JButton("REGISTRARSE COMO SUPEREMPRESA");
		btnRegistroSuperE.setBackground(new Color(255, 255, 255));
		btnRegistroSuperE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistroSuperE.setBounds(216, 315, 343, 47);
		getContentPane().add(btnRegistroSuperE);
	}

	@Override
	public void setControlador(Controlador controlador) {
		
	}

	@Override
	public void setModelo(Modelo modelo) {
		
	}

	@Override
	public Container getContenedor() {
		return null;
	} 
}
