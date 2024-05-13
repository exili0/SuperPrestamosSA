package SuperPrestamosSA;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Invitados extends JFrame{


	public Invitados() {
		getContentPane().setLayout(null);

		
		JLabel lblTitulo = new JLabel("SUPER PRÉSTAMOS S.A.");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitulo.setBounds(215, 10, 380, 136);
		getContentPane().add(lblTitulo);
		
		JButton btnLogin = new JButton("LOG IN");
		btnLogin.setBounds(276, 203, 170, 44);
		getContentPane().add(btnLogin);
		
		JButton btnRegistro = new JButton("REGISTRO");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistro.setBounds(276, 299, 170, 44);
		getContentPane().add(btnRegistro);
		
		JButton btnFaq = new JButton("PREGUNTAS FRECUENTES");
		btnFaq.setBounds(276, 388, 170, 44);
		getContentPane().add(btnFaq);
	}

}
