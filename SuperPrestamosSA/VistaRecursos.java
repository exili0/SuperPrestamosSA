package SuperPrestamosSA;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaRecursos extends JFrame implements Vista{
	
	public VistaRecursos() {

		JFrame frame5 = new JFrame("Ventana Recursos");
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setBounds(100, 100, 868, 605);
		getContentPane().setLayout(null);
		frame5.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("RECURSOS");
		lblTitulo.setBounds(330, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame5.getContentPane().add(lblTitulo);
		
		JButton btnTomarRecurso = new JButton("TOMAR RECURSO");
		btnTomarRecurso.setBounds(300, 156, 200, 50);
		frame5.getContentPane().add(btnTomarRecurso);
		
		JButton btnDejarRecurso = new JButton("DEJAR RECURSO");
		btnDejarRecurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDejarRecurso.setBounds(300, 236, 200, 50);
		frame5.getContentPane().add(btnDejarRecurso);
		
		JButton btnRecursosDisp = new JButton("VER RECURSOS DISPONIBLES");
		btnRecursosDisp.setBounds(252, 408, 300, 50);
		frame5.getContentPane().add(btnRecursosDisp);
		
		JButton btnRegistroRecurso = new JButton("REGISTRAR RECURSO");
		btnRegistroRecurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistroRecurso.setBounds(300, 312, 200, 50);
		frame5.getContentPane().add(btnRegistroRecurso);
		
		frame5.setVisible(true);
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
