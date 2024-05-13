package SuperPrestamosSA;

import javax.swing.JFrame;

public class Test {

	private Test() {
		super();
	}

	private void empezar() {
		
		// Patrón MVC

		Controlador controlador = new ControladorImp();
		Modelo modelo = new ModeloImp();
		Vista vista = new VistaImp();

		// Para que se conozcan entre ellos

		controlador.setModelo(modelo);
		controlador.setVista(vista);
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		modelo.setVista(vista);

		JFrame ventana = new JFrame("Bienvenido a Super Prést	amos S.A.");
		ventana.setContentPane(vista.getContenedor());
		ventana.pack();

		ventana.setTitle("Registro");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ventana.setBounds(100, 100, 751, 648);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		LogIn login = new LogIn();
		login.bienvenida();
//		PreguntasFrecuentes FAQ = new PreguntasFrecuentes();
		// System.out.println(FAQ.imprimirFAQ());
		Menu menu = new Menu();
		// menu.imprimirMenu();

//		new Test().empezar();

	}

}
