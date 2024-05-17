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
		frame7.getContentPane().setBackground(new Color(151, 192, 109));
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.setBounds(100, 100, 800, 600);
		frame7.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("REGISTRO ADMINISTRADOR");
		lblTitulo.setBounds(174, 36, 500, 108);
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		frame7.getContentPane().add(lblTitulo);
		
		JButton btnAltaAdmin = new JButton("REGISTRARSE");
		btnAltaAdmin.setBackground(new Color(204, 231, 197));
		btnAltaAdmin.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnAltaAdmin.setBounds(288, 255, 210, 58);
		frame7.getContentPane().add(btnAltaAdmin);
		btnAltaAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7.setVisible(false);
				VistaImp vistaImp = new VistaImp();
//				vistaImp.setVisible(true);
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame7.getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7.setVisible(false);
				VistaRegistro vistaRegistro = new VistaRegistro();
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
