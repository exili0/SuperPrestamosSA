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

		JFrame frame4 = new JFrame("Ventana Login SE");
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setBounds(100, 100, 800, 600);
		frame4.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("LOGIN SUPEREMPRESA");
		lblTitulo.setBounds(250, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame4.getContentPane().add(lblTitulo);
		
		JButton btnEntrarSE = new JButton("INICIAR SESIÓN");
		btnEntrarSE.setBackground(new Color(255, 255, 255));
		btnEntrarSE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEntrarSE.setBounds(270, 277, 277, 66);
		frame4.getContentPane().add(btnEntrarSE);
		btnEntrarSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4.setVisible(false);
				VistaRecursos vistaRecursos = new VistaRecursos();
//				vistaRecursos.setVisible(true);
			}
		});
		
		frame4.setVisible(true);
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
