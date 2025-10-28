import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		// Introducción
		double valor = 0;
		double num = 0;
		boolean hacerMedia = true;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce tus cinco notas (0-10):");

		// Nudo
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ": ");
			valor = scanner.nextDouble();

			if (valor >= 0 && valor <= 10) {
				num = num + valor;
			} else {
				System.out.println("No puedes poner notas por debajo de 0 ni por encima de 10");
				hacerMedia = false;
				break;
			}
		}

		scanner.close();

		// Desenlace
		if (hacerMedia == true) {
			double resultado = num / 5;
			System.out.println("Tu media es: " + resultado);
		}
	}
}
