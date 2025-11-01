import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		// Introducción
		String cadena, salir;
		boolean salida = false;
		int opcion = 0;

		System.out.println("----MENU----");
		System.out.println("1) ");
		System.out.println("2) ");

		Scanner scanner = new Scanner(System.in);

		// Nudo
		while (salida == false) {

			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					int contador = 0;

					System.out.print("Introduce una cadena de texto: ");
					cadena = scanner.next();

					for (int i = 0; i < cadena.length(); i++) {
						contador++;
					}

					System.out.println("La cadena tiene " + contador + " caracteres");
					break;

				case 2:
					String cadenaInvertida = "";

					System.out.print("Introduce una cadena de texto: ");
					cadena = scanner.next();

					for (int i = cadena.length() - 1; i >= 0; i--) {
						cadenaInvertida = cadenaInvertida + cadena.charAt(i);
					}

					System.out.println("Cadena original: " + cadena);
					System.out.println("Cadena invertida: " + cadenaInvertida);
					break;

				default:
					break;
			}

			// Desenlace
			System.out.println("¿Quieres seguir usando la calculadora? (s/n)");
			salir = scanner.next();

			if (!salir.equals("s")) {
				salida = true;
			}
		}
		scanner.close();
	}
}
