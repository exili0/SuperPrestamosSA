package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
		
		JButton btnAltaSE = new JButton("REGISTRARSE");
		btnAltaSE.setBackground(new Color(255, 255, 255));
		btnAltaSE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAltaSE.setBounds(216, 210, 343, 47);
		getContentPane().add(btnAltaSE);
		btnAltaSE.addActionListener(new ActionListener() {
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
