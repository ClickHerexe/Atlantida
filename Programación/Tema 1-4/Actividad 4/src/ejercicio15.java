import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		// Introducción
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		String numero = scanner.nextLine();
		scanner.close();

		// Nudo
		int contador = 0;
		for (int i = 0; i < numero.length(); i++) {
			char c = numero.charAt(i);
			if (Character.isDigit(c)) {
				contador++;
			}
		}

		// Desenlace
		System.out.println("El número tiene " + contador + " dígitos");
	}
}
