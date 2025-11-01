import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		// Introducción
		String cadena;
		char letra;
		int contador = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una cadena de texto: ");
		cadena = scanner.nextLine();
		System.out.print("Introduce la letra a buscar: ");
		letra = scanner.next().charAt(0);
		scanner.close();

		// Nudo
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				contador++;
			}
		}

		// Desenlace
		System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena");
	}
}
