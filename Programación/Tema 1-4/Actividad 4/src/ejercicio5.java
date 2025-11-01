import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		// Introducción
		String cadena = "", cadenaInvertida = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la cadena para comprobar si es un palindromo: ");
		cadena = scanner.next();

		scanner.close();

		// Nudo
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}

		// Desenlace
		if (cadenaInvertida.equals(cadena)) {
			System.out.println(cadena + " es un palindromo");
		} else {
			System.out.println(cadena + " no es un palindromo");
		}
	}
}
