import java.util.Random;
import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		// Introducción
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int numeroSecreto = random.nextInt(10) + 1;
		int intento = 0;
		boolean adivinado = false;

		// Nudo
		while (!adivinado) {
			System.out.print("Adivina el número: ");
			intento = scanner.nextInt();

			if (intento < 1 || intento > 10) {
				System.out.println("Por favor, introduce un número entre 1 y 10\n");
				continue;
			}

			if (intento < numeroSecreto) {
				System.out.println("Intenta de nuevo.");
			} else {
				adivinado = true;
			}
		}

		scanner.close();

		// Desenlace
		System.out.println("¡Felicidades! ¡Adivinaste el número " + numeroSecreto + "!");
	}
}
