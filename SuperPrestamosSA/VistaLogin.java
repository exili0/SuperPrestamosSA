package SuperPrestamosSA;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class VistaLogin extends JFrame implements Vista{
	public VistaLogin() {
		getContentPane().setLayout(null);
		
		pack();
		setTitle("Página log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("LOG IN");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(215, 10, 380, 136);
		getContentPane().add(lblTitulo);
		
		JButton btnLoginAdmin = new JButton("INICIAR SESIÓN COMO ADMINISTRADOR");
		btnLoginAdmin.setBackground(new Color(255, 255, 255));
		btnLoginAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLoginAdmin.setBounds(216, 210, 343, 47);
		getContentPane().add(btnLoginAdmin);
		btnLoginAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaLoginAdmin vistaLoginAdmin = new VistaLoginAdmin();
				vistaLoginAdmin.setVisible(true);
			}
		});
		
		JButton btnLoginSE = new JButton("INICIAR SESIÓN COMO SUPEREMPRESA");
		btnLoginSE.setBackground(new Color(255, 255, 255));
		btnLoginSE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLoginSE.setBounds(216, 315, 343, 47);
		getContentPane().add(btnLoginSE);
		btnLoginSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaLoginSE vistaLoginSE = new VistaLoginSE();
				vistaLoginSE.setVisible(true);
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
