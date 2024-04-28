package SuperPrestamosSA;

import java.util.Scanner;

public class Administrador extends LogIn {

	public void loginAdministrador(String nickname, String contrasenya) {

		boolean nombre_valido;
		boolean contra_valida;
		////////////////////////////

		Scanner sc = new Scanner(System.in);

		do { // BUCLE QUE FUNCIONA HASTA QUE SE INTRODUZCA UN
				// 𝙄𝙄𝙄𝙄𝙄𝙄𝙄NICKNAME𝙄𝙄𝙄𝙄𝙄𝙄𝙄 VÁLIDO
			System.out.printf("Introduzca un nickname\n➤");
			sc = new Scanner(System.in);
			nickname = sc.next();
			nombre_valido = verificarNickname(nickname);
		} while (nombre_valido == false);
		do { // BUCLE QUE FUNCIONA HASTA QUE SE INTRODUZCA UNA
				// 𝙄𝙄𝙄𝙄𝙄𝙄𝙄CONTRASEÑA𝙄𝙄𝙄𝙄𝙄𝙄𝙄 VÁLIDA
			System.out.printf("Introduzca una contraseña\n➤");
			sc = new Scanner(System.in);
			contrasenya = sc.next();
			contra_valida = verificarContrasenya(contrasenya);

		} while (contra_valida == false);
	}

}
