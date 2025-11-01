import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {

		// Introducción
		Scanner scanner = new Scanner(System.in);

		// Nudo
		System.out.print("Hasta que números quiere que cuente (solo pares): ");
		int num = scanner.nextInt();
		scanner.close();

		// Desenlace
		for (int i = 0; i <= num; i += 2) {
			System.out.println(i);
		}
	}
}
