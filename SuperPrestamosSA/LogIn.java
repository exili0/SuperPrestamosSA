package SuperPrestamosSA;

import java.util.Scanner;

public class LogIn extends Registro {

	protected String nickname, contrasenya;

	public void bienvenida() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("✦ Bienvenido a SuperPrestamos S.A! ✦");
		System.out.println("1. Iniciar sesión como administrador\n2. Iniciar sesión como superempresa");
		
		String opcionLogin;

	

		do {
			System.out.printf("➤");
			opcionLogin = sc.next(); // INTRODUCIR OPCION DE LOGIN

			if (opcionLogin.equals("1")) {
				
				Administrador admin1= new Administrador();
				admin1.loginAdministrador(nickname, contrasenya); // LLAMA AL METODO QUE ESTÁ EN ADMINISTRADOR	
				opcionLogin="salir"; //𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄 Salir del programa
			}
			
			else if (opcionLogin.equals("2")) { //𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄 LOS BUCLES DE CONTRASEÑA Y NICKNAME FUNCIONAN IGUAL QUE ANTES
				
				SuperEmpresa empresa1= new SuperEmpresa();
				empresa1.loginSuperEmpresa(nickname, contrasenya); // LLAMA AL METODO QUE ESTÁ EN SUPEREMPRESA
				opcionLogin="salir";//𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄 Salir del programa
			} 
			else {
				System.out.print("𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄 Opción no válida 𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄\n");
			}
			
		} while (!opcionLogin.equals("salir")); 
		
		//	Por lo que sea (!opcionLogin.equals("1") || !opcionLogin.equals("1")) no funciona
		// 	Es por ello que saldrá cuando se detecte el valor "salir"
		
		System.out.println("𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄 [ TE HAS REGISTRADO CORRECTAMENTE ] 𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄𝙄");
	}

	public boolean verificarContrasenya(String contrasenya) {
		boolean contieneMayus = false;
		boolean contieneMinus = false;
		boolean contieneNum = false;
		boolean valida;
		
		for (int i = 0; i < contrasenya.length(); i++) {
			char caracter = contrasenya.charAt(i);
			if (Character.isUpperCase(caracter)) {
				contieneMayus = true;
			} else if (Character.isLowerCase(caracter)) {
				contieneMinus = true;
			} else if (Character.isDigit(caracter)) {
				contieneNum = true;
			}
		}
		
		valida = (contieneMayus && contieneMinus && contieneNum); // Solo será true si las 3 lo son
		
		if(valida == false) {
			System.out.println("Contraseña incorrecta ✖\n \n[ La contraseña debe contener al menos un número, una mayúscula y una minúscula ]\n");
		}
		else {
			System.out.println("Contraseña validada ✔");
		}
		return valida;
	}
	
	public boolean verificarNickname(String nickname) {
		boolean valida = true;
		
		for (int i = 0; i < nickname.length(); i++) {
			char caracter = nickname.charAt(i);
			
			if (caracter >= 128 && caracter <= 255){ // Este rango en ASCII es el de los cáracteres que no son anglosajones
				valida = false;
			}
			else {
				valida = true;
			}
		}
		return valida;
	}
}
