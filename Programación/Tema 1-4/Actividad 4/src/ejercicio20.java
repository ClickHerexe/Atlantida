public class ejercicio20 {
	public static void main(String[] args) {
		// Introducción
		int contador = 0;

		// Nudo
		System.out.println("Múltiplos de 5 entre 1 y 100:");
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
				contador++;
			}
		}

		// Desenlace
		System.out.println("\n\nTotal: " + contador);
	}
}
