package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class VistaRegistroAdmin extends JFrame implements Vista {

	public VistaRegistroAdmin() {

		pack();
		setTitle("Página registro administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("REGISTRO ADMINISTRADOR");
		lblTitulo.setBounds(220, 10, 500, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().add(lblTitulo);
		
		JButton btnAltaAdmin = new JButton("REGISTRARSE");
		btnAltaAdmin.setBackground(new Color(255, 255, 255));
		btnAltaAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAltaAdmin.setBounds(216, 210, 343, 47);
		getContentPane().add(btnAltaAdmin);
		btnAltaAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaImp vistaImp = new VistaImp();
				vistaImp.setVisible(true);
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
