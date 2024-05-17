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
		
		JFrame frame8 = new JFrame("Ventana Registro SE");
		frame8.getContentPane().setBackground(new Color(151, 192, 109));
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.setBounds(100, 100, 800, 600);
		frame8.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("REGISTRO SUPEREMPRESA");
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		lblTitulo.setBounds(181, 49, 487, 110);
		frame8.getContentPane().add(lblTitulo);
		
		JButton btnAltaSE = new JButton("REGISTRARSE");
		btnAltaSE.setBackground(new Color(204, 231, 197));
		btnAltaSE.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnAltaSE.setBounds(260, 263, 265, 66);
		frame8.getContentPane().add(btnAltaSE);
		btnAltaSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame8.setVisible(false);
				VistaImp vistaImp = new VistaImp();
//				vistaImp.setVisible(true);
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame8.getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame8.setVisible(false);
				VistaRegistro vistaRegistro = new VistaRegistro();
			}
		});
		
		frame8.setVisible(true);
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
