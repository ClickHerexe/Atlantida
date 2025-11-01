import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		// Introducción
		String cadena;
		int contadorPalabras = 0;
		boolean enPalabra = false;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una cadena de texto: ");
		cadena = scanner.nextLine();
		scanner.close();

		// Nudo
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);

			if (caracterActual != ' ') {
				if (!enPalabra) {
					contadorPalabras++;
					enPalabra = true;
				}
			} else {
				enPalabra = false;
			}
		}

		// Desenlace
		System.out.println("La cadena contiene " + contadorPalabras + " palabras");
	}
}
