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
		getContentPane().setLayout(null);
		
		pack();
		setTitle("Página registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("REGISTRO");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(330, 10, 380, 136);
		getContentPane().add(lblTitulo);

		JButton btnRegistroAdmin = new JButton("REGISTRARSE COMO ADMINISTRADOR");
		btnRegistroAdmin.setBackground(new Color(255, 255, 255));
		btnRegistroAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistroAdmin.setBounds(216, 210, 343, 47);
		getContentPane().add(btnRegistroAdmin);
		btnRegistroAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaRegistroAdmin vistaRegistroAdmin = new VistaRegistroAdmin();
				vistaRegistroAdmin.setVisible(true);
			}
		});
		
		JButton btnRegistroSE = new JButton("REGISTRARSE COMO SUPEREMPRESA");
		btnRegistroSE.setBackground(new Color(255, 255, 255));
		btnRegistroSE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegistroSE.setBounds(216, 315, 343, 47);
		getContentPane().add(btnRegistroSE);
		btnRegistroSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaRegistroSE vistaRegistroSE = new VistaRegistroSE();
				vistaRegistroSE.setVisible(true);
			}
		});
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
