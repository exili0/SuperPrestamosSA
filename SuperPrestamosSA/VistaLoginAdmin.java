package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VistaLoginAdmin extends JFrame implements Vista {

	public VistaLoginAdmin() {

		pack();
		setTitle("Página login administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("LOGIN ADMINISTRADOR");
		lblTitulo.setBounds(215, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().add(lblTitulo);
		
		JButton btnEntrarAdmin = new JButton("INICIAR SESIÓN");
		btnEntrarAdmin.setBackground(new Color(255, 255, 255));
		btnEntrarAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEntrarAdmin.setBounds(216, 210, 343, 47);
		getContentPane().add(btnEntrarAdmin);
		btnEntrarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VistaRecursos vistaRecursos = new VistaRecursos();
				vistaRecursos.setVisible(true);
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
