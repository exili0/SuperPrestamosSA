package SuperPrestamosSA;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VistaRegistroSE extends JFrame implements Vista {

	public VistaRegistroSE() {
		getContentPane().setLayout(null);

		pack();
		setTitle("Página registro SuperEmpresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("REGISTRO SUPEREMPRESA");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(215, 10, 380, 136);
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
