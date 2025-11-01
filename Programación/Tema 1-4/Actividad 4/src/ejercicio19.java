import java.util.Random;

public class ejercicio19 {
	public static void main(String[] args) {
		// Introducción
		Random random = new Random();
		int suma = 0;
		int[] numeros = new int[10];

		// Nudo
		System.out.println("Números aleatorios generados:");
		for (int i = 0; i < 10; i++) {
			numeros[i] = random.nextInt(100) + 1;
			System.out.print(numeros[i] + " ");
			suma += numeros[i];
		}

		double media = suma / 10.0;

		// Desenlace
		System.out.println("\nLa suma de los números es: " + suma);
		System.out.println("La media de los números es: " + media);
	}
}
