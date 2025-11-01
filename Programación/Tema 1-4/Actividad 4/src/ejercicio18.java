import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
		// Introducción
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce una cadena: ");
		String texto = scanner.nextLine();
		scanner.close();

		// Nudo
		int consonantes = 0;
		texto = texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (Character.isLetter(c)) {
				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					consonantes++;
				}
			}
		}

		// Desenlace
		System.out.println("La cadena tiene " + consonantes + " consonante(s)");
	}
}
