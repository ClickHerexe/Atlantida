import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		// Introducción
		double suma = 0;
		double nota = 0;
		boolean hacerPromedio = true;
		String notaFinal = "null";

		Scanner scanner = new Scanner(System.in);

		// Nudo
		for (int i = 1; i <= 5; i++) {
			System.out.print("Dime tu " + i + "º" + " nota: (0 al 100) ");
			nota = scanner.nextDouble();

			if (nota >= 0 && nota <= 100) {
				suma = nota + suma;
			} else {
				System.out.println("Debes introducir un valor entre 0 y 100");
				hacerPromedio = false;
				break;
			}
		}

		scanner.close();
		double promedio = suma / 5;

		// Desenlace
		if (hacerPromedio == true) {
			if (promedio >= 90) {
				notaFinal = "A";
			} else if (promedio >= 80) {
				notaFinal = "B";
			} else if (promedio >= 70) {
				notaFinal = "C";
			} else if (promedio >= 60) {
				notaFinal = "D";
			} else {
				notaFinal = "F";
			}
			System.out.println("Tu nota media es: " + notaFinal + " (" + promedio + ")");
		} else {
			System.out.println("No se pudo calcular el promedio debido a notas inválidas");
		}
	}
}
