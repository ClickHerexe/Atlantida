import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Adivina el número en el que estoy pensando: (0 al 100) ");
		int adivina = scanner.nextInt();
		scanner.close();

		Random random = new Random();

		int miNumero = random.nextInt(99);

		if (adivina == miNumero) {
			System.out.println("¡Felicidades adivinaste mi número!");
		} else {
			System.out.println("Nope, el número en el que estaba pensando es: " + miNumero);
		}

	}

}
