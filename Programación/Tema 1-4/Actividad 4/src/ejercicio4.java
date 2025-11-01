import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		// Introducción
		int longitud;
		String cadenaAleatoria = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("¿De cuantos caracteres quieres que sea la cadena aleatoria? ");
		longitud = scanner.nextInt();
		scanner.close();

		// Nudo
		Random random = new Random();

		for (int i = 0; i < longitud; i++) {
			int numeroAleatorio = random.nextInt(26);
			char caracterAleatorio = (char) ('a' + numeroAleatorio);
			cadenaAleatoria = cadenaAleatoria + caracterAleatorio;
		}

		// Desenlace
		System.out.println("Cadena aleatoria generada: " + cadenaAleatoria);
	}
}
