import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		// Introducción
		int numero, sum = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número para saber si es perfecto: ");
		numero = scanner.nextInt();
		scanner.close();

		// Nudo
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				sum = sum + i;
			}
		}

		// Desenlace
		if (sum == numero) {
			System.out.println(numero + " es un número perfecto");
		} else {
			System.out.println(numero + " no es un número perfecto");
		}
	}
}
