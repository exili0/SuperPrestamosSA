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
		
		JFrame frame2 = new JFrame("Ventana Login");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setBounds(100, 100, 800, 600);
		frame2.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("LOG IN");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(353, 10, 380, 136);
		frame2.getContentPane().add(lblTitulo);
		
		JButton btnLoginAdmin = new JButton("INICIAR SESIÓN COMO ADMINISTRADOR");
		btnLoginAdmin.setBackground(new Color(255, 255, 255));
		btnLoginAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLoginAdmin.setBounds(242, 189, 343, 47);
		frame2.getContentPane().add(btnLoginAdmin);
		btnLoginAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				VistaLoginAdmin vistaLoginAdmin = new VistaLoginAdmin();
//				vistaLoginAdmin.setVisible(true);
			}
		});
		
		JButton btnLoginSE = new JButton("INICIAR SESIÓN COMO SUPEREMPRESA");
		btnLoginSE.setBackground(new Color(255, 255, 255));
		btnLoginSE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLoginSE.setBounds(242, 311, 343, 47);
		frame2.getContentPane().add(btnLoginSE);
		btnLoginSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				VistaLoginSE vistaLoginSE = new VistaLoginSE();
//				vistaLoginSE.setVisible(true);
			}
		});
		
		frame2.setVisible(true);
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
