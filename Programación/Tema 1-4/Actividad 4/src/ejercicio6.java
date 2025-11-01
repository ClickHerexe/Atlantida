import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		// Introducción
		String vocales;
		int contador = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Escribe una palabra para contar sus vocales: ");
		vocales = scanner.next();

		scanner.close();

		// Nudo
		for (int i = 0; i < vocales.length(); i++) {

			char letra = vocales.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}
		}

		// Desenlace
		System.out.println("Hay " + contador + " vocales en " + vocales);

	}
}