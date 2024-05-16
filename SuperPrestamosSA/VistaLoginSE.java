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

public class VistaLoginSE extends JFrame implements Vista {

	public VistaLoginSE() {

		pack();
		setTitle("Página login SuperEmpresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("LOGIN SUPEREMPRESA");
		lblTitulo.setBounds(215, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().add(lblTitulo);
		
		JButton btnEntrarSE = new JButton("INICIAR SESIÓN");
		btnEntrarSE.setBackground(new Color(255, 255, 255));
		btnEntrarSE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEntrarSE.setBounds(216, 210, 343, 47);
		getContentPane().add(btnEntrarSE);
		btnEntrarSE.addActionListener(new ActionListener() {
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
