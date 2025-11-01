import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {

		// Introducción
		int contador = 0;
		String salir = "";

		Scanner scanner = new Scanner(System.in);

		// Nudo
		do {
			System.out.print("Escribe cadenas de texto, cuando quieras acabar pon 'salir': ");
			salir = scanner.next();

			if (!salir.equals("salir")) {
				System.out.println("No escribiste salir, continuando");
				contador++;
			}

		} while (!salir.equals("salir"));

		// Desenlace
		scanner.close();
		System.out.println("Escribiste cadenas de texto antes de salir: " + contador + ", saliendo...");

	}

}
