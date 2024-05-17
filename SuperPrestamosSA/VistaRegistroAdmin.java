package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VistaRegistroAdmin extends JFrame implements Vista {

	public VistaRegistroAdmin() {

		JFrame frame7 = new JFrame("Ventana Registro Admin");
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.setBounds(100, 100, 800, 600);
		frame7.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("REGISTRO ADMINISTRADOR");
		lblTitulo.setBounds(226, 28, 500, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame7.getContentPane().add(lblTitulo);
		
		JButton btnAltaAdmin = new JButton("REGISTRARSE");
		btnAltaAdmin.setBackground(new Color(255, 255, 255));
		btnAltaAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAltaAdmin.setBounds(308, 298, 210, 58);
		frame7.getContentPane().add(btnAltaAdmin);
		btnAltaAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7.setVisible(false);
				VistaImp vistaImp = new VistaImp();
//				vistaImp.setVisible(true);
			}
		});
		
		frame7.setVisible(true);
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
