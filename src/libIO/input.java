package libIO;

import java.util.Scanner;

/*
		TODO
			[   ] Necesaria una forma de repetir nuevamente el dato sin finalizar el programa
 			[ X ] Petición de números
 			[ X ] Petición de texto
			[   ] Petición de números decimales
			[ X ] Procedimiento que finalice el Scanner. No debe quedarse cerrado
			[   ] Escribir un README con la documentación

 		CÓDIGOS DE SALIDA
			1. EL PROGRAMA SUFRIÓ UN ERROR INESPERADO
 			2. EL USUARIO INGRESÓ UN CARÁCTER NO VÁLIDO
 */



/*
 * 
 * Librería que simplifica la petición de datos al usuario
 * omite el escribir  un try catch y lo sustituye por un método
 * 
 * Ver eel readme para más información detallada
 */

public class input {

	// Se inicia el teclado
	static Scanner sc = new Scanner(System.in);

	
	// obtiene un número
	// Parámetros: 	msg: Mensaje que se muestra al usuario
	// Devuelve:	el número introducido
	public static int getNumber(String msg) {
		int n = 0;

		try {
			System.out.print(msg);
			n = sc.nextInt(); 
		
		} catch (Exception e) {
			exceptionError();
			System.exit(2);
		}


		return n;
	}

	
	// obtiene un string
	// Parámetros: 	msg: Mensaje que se muestra al usuario
	// Devuelve:	el string introducido
	public static String getString(String msg){
		String txt = "";

		try {
			System.out.print(msg);
			txt = sc.nextLine();
	
		} catch (Exception e){
			exceptionError();
			System.exit(2);
		}

		return txt;
	}


// Cierra la entrada de teclado
	void getNumberClose() {
		sc.close();
	}


	private static void exceptionError () {
		System.out.println("El dato ingresado no es válido");
		System.exit(2);
	}
}
