import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		// Introducción
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		long numero = scanner.nextLong();
		scanner.close();

		// Nudo
		long n = Math.abs(numero);
		int suma = 0;
		while (n > 0) {
			suma += n % 10;
			n = n / 10;
		}

		// Desenlace
		System.out.println("La suma es: " + suma);
	}
}
