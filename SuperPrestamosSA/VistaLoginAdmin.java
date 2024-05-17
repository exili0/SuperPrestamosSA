package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class VistaLoginAdmin extends JFrame implements Vista {

	public VistaLoginAdmin() {

		JFrame frame3 = new JFrame("Ventana Login admin");
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setBounds(100, 100, 815, 635);
		frame3.getContentPane().setLayout(null);
		

		JLabel lblTitulo = new JLabel("LOGIN ADMINISTRADOR");
		lblTitulo.setBounds(215, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame3.getContentPane().add(lblTitulo);
		
		JButton btnEntrarAdmin = new JButton("INICIAR SESIÓN");
		btnEntrarAdmin.setBackground(new Color(255, 255, 255));
		btnEntrarAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEntrarAdmin.setBounds(283, 254, 189, 49);
		frame3.getContentPane().add(btnEntrarAdmin);
		btnEntrarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				VistaRecursos vistaRecursos = new VistaRecursos();
//				vistaRecursos.setVisible(true);
			}
		});
		
		frame3.setVisible(true);
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
