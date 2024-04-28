package SuperPrestamosSA;

public class Test {

	public static void main(String[] args) {
		LogIn login = new LogIn();
		login.bienvenida();
		PreguntasFrecuentes FAQ = new PreguntasFrecuentes();
		//System.out.println(FAQ.imprimirFAQ());
		Menu menu = new Menu();
		menu.imprimirMenu();
		
	}

}
