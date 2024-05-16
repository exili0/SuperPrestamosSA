package SuperPrestamosSA;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class VistaRegistroAdmin extends JFrame implements Vista {

	public VistaRegistroAdmin() {

		pack();
		setTitle("Página registro administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 329);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("REGISTRO ADMINISTRADOR");
		lblTitulo.setBounds(215, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().add(lblTitulo);
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
