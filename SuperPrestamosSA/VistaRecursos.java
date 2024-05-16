package SuperPrestamosSA;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VistaRecursos extends JFrame implements Vista{
	
	public VistaRecursos() {

		pack();
		setTitle("Página recursos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 605);
		getContentPane().setLayout(null);
		setVisible(true);

		JLabel lblTitulo = new JLabel("RECURSOS");
		lblTitulo.setBounds(330, 10, 380, 136);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		getContentPane().add(lblTitulo);
		
		JButton btnTomarRecurso = new JButton("TOMAR RECURSO");
		btnTomarRecurso.setBounds(320, 170, 200, 50);
		getContentPane().add(btnTomarRecurso);
		
		JButton btnDejarRecurso = new JButton("DEJAR RECURSO");
		btnDejarRecurso.setBounds(320, 240, 200, 50);
		getContentPane().add(btnDejarRecurso);
		
		JButton btnRecursosDisp = new JButton("VER RECURSOS DISPONIBLES");
		btnRecursosDisp.setBounds(280, 310, 300, 50);
		getContentPane().add(btnRecursosDisp);
		
		JButton btnRegistroRecurso = new JButton("REGISTRAR RECURSO");
		btnRegistroRecurso.setBounds(320, 380, 200, 50);
		getContentPane().add(btnRegistroRecurso);
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
