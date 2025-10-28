import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		// Introducción
		Scanner scanner = new Scanner(System.in);

		// Nudo
		System.out.print("Dame el primer lado: ");
		double A = scanner.nextDouble();
		System.out.print("Dame el segundo lado: ");
		double B = scanner.nextDouble();
		System.out.print("Dame el tercer lado: ");
		double C = scanner.nextDouble();
		scanner.close();

		// Desenlace
		if (A > 0 && B > 0 && C > 0) {
			if (A == B && B == C) {
				System.out.println("Este triángulo es un equilátero");
			} else if (A == B || B == C || A == C) {
				System.out.println("Este triángulo es un isóceles");
			} else {
				System.out.println("Este triángulo es un escaleno");
			}
		} else {
			System.out.println("El valor introducido es incorrecto");
		}
	}
}
