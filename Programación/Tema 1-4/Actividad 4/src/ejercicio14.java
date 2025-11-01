import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		// Introducción
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce una cadena: ");
		String texto = scanner.nextLine();
		scanner.close();

		// Nudo
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (Character.isUpperCase(c)) {
				resultado += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				resultado += Character.toUpperCase(c);
			} else {
				resultado += c;
			}
		}

		// Desenlace
		System.out.println("Cambiado: " + resultado);
	}
}
