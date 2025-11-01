import java.util.Random;
import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		// Introducción
		String contrasena = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Presiona Enter para generar una contraseña: ");
		scanner.nextLine();
		scanner.close();

		// Nudo
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			boolean tipo = random.nextBoolean();

			if (tipo == true) {
				char caracterAleatorio = (char) ('a' + random.nextInt(26));
				contrasena = contrasena + caracterAleatorio;
			} else {
				int numeroAleatorio = random.nextInt(10);
				contrasena = contrasena + numeroAleatorio;
			}
		}

		// Desenlace
		System.out.println("Contraseña generada: " + contrasena);
	}
}
