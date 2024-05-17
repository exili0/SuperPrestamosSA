package SuperPrestamosSA;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class VistaRegistro extends JFrame implements Vista{
	public VistaRegistro() {
		
		JFrame frame6 = new JFrame("Ventana Registro");
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.setBounds(100, 100, 800, 600);
		frame6.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("REGISTRO");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(309, 41, 183, 122);
		frame6.getContentPane().add(lblTitulo);

		JButton btnRegistroAdmin = new JButton("REGISTRARSE COMO ADMINISTRADOR");
		btnRegistroAdmin.setBackground(new Color(255, 255, 255));
		btnRegistroAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistroAdmin.setBounds(216, 224, 343, 47);
		frame6.getContentPane().add(btnRegistroAdmin);
		btnRegistroAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6.setVisible(false);
				VistaRegistroAdmin vistaRegistroAdmin = new VistaRegistroAdmin();
//				vistaRegistroAdmin.setVisible(true);
			}
		});
		
		JButton btnRegistroSE = new JButton("REGISTRARSE COMO SUPEREMPRESA");
		btnRegistroSE.setBackground(new Color(255, 255, 255));
		btnRegistroSE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistroSE.setBounds(216, 331, 343, 47);
		frame6.getContentPane().add(btnRegistroSE);
		btnRegistroSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6.setVisible(false);
				VistaRegistroSE vistaRegistroSE = new VistaRegistroSE();
//				vistaRegistroSE.setVisible(true);
			}
		});
		
		frame6.setVisible(true);
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
