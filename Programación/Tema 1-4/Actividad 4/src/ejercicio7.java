import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {

		// Introducción
		Scanner scanner = new Scanner(System.in);

		// Nudo
		System.out.print("¿Hasta cuanto quieres que cuente?");
		int contar = scanner.nextInt();
		scanner.close();

		// Desenlace
		for (int i = 0; i <= contar; i++) {
			System.out.println(i);
		}
	}

}
