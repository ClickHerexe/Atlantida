import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		// Introducción
		int n = -1;
		String manoJava = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Elige (piedra, papel, tijeras, lagarto, spock): ");
		String manoUsuario = scanner.next();
		scanner.close();

		// Validamos la palabra
		manoUsuario = manoUsuario.toLowerCase();

		Random random = new Random();
		n = random.nextInt(5);

		// 0 = piedra
		// 1 = papel
		// 2 = tijeras
		// 3 = lagarto
		// 4 = spock

		// Nudo
		switch (n) {
			case 0:
				manoJava = "piedra";
				break;
			case 1:
				manoJava = "papel";
				break;
			case 2:
				manoJava = "tijeras";
				break;
			case 3:
				manoJava = "lagarto";
				break;
			case 4:
				manoJava = "spock";
				break;
			default:
				break;
		}

		System.out.println("Yo uso " + manoJava);

		// Desenlace
		switch (manoUsuario) {
			case "tijeras":
				// gana a papel y lagarto
				if (n == 1 || n == 3) {
					System.out.println("¡Ganaste!");
				} else if (n == 2) {
					System.out.println("¡Empate!");
				} else {
					System.out.println("¡Perdiste!");
				}
				break;
			case "papel":
				// gana a piedra y spock
				if (n == 0 || n == 4) {
					System.out.println("¡Ganaste!");
				} else if (n == 1) {
					System.out.println("¡Empate!");
				} else {
					System.out.println("¡Perdiste!");
				}
				break;
			case "piedra":
				// gana a lagarto y tijeras
				if (n == 2 || n == 3) {
					System.out.println("¡Ganaste!");
				} else if (n == 0) {
					System.out.println("¡Empate!");
				} else {
					System.out.println("¡Perdiste!");
				}
				break;
			case "lagarto":
				// gana a spock y papel
				if (n == 1 || n == 4) {
					System.out.println("¡Ganaste!");
				} else if (n == 3) {
					System.out.println("¡Empate!");
				} else {
					System.out.println("¡Perdiste!");
				}
				break;
			case "spock":
				// gana a tijeras y piedra
				if (n == 0 || n == 2) {
					System.out.println("¡Ganaste!");
				} else if (n == 4) {
					System.out.println("¡Empate!");
				} else {
					System.out.println("¡Perdiste!");
				}
				break;

			default:
				System.out.println("Valor no válido");
				break;
		}
	}
}
