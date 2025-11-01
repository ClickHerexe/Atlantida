import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		// Introducción
		String cadena;
		String cadenaInvertida = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una cadena de texto: ");
		cadena = scanner.nextLine();
		scanner.close();

		// Nudo
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}

		// Desenlace
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + cadenaInvertida);
	}
}
