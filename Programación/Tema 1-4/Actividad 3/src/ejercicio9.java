import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		// Introducción
		int opcion;
		double n1 = 0, n2 = 0, resultado = 1;
		boolean continuar = true;
		String respuesta = "n";

		Scanner scanner = new Scanner(System.in);

		// Nudo
		while (continuar == true) {
			System.out.println("-----CALCULADORA-----");
			System.out.println("1) Sumar");
			System.out.println("2) Restar");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			System.out.println("5) Potencia");
			System.out.println("6) Raíz");
			System.out.println("7) Factorial");
			System.out.println("8) Salir\n");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			if (opcion <= 5) {
				System.out.print("Número 1: ");
				n1 = scanner.nextInt();
				System.out.print("Número 2: ");
				n2 = scanner.nextInt();
			} else if (opcion <= 7) {
				System.out.print("Número: ");
				n1 = scanner.nextInt();
			} else if (opcion == 8) {
				break;
			} else {
				System.out.println("Opción no válida");
				continue;
			}

			switch (opcion) {
				case 1:
					resultado = n1 + n2;
					System.out.println("Resultado de la suma: " + resultado);
					break;
				case 2:
					resultado = n1 - n2;
					System.out.println("Resultado de la resta: " + resultado);
					break;
				case 3:
					resultado = n1 * n2;
					System.out.println("Resultado de la multiplicación: " + resultado);
					break;
				case 4:
					if (n2 != 0) {
						resultado = n1 / n2;
						System.out.println("Resultado de la división: " + resultado);
					} else {
						System.out.println("No se puede dividir entre 0");
					}
					break;
				case 5:
					if (n1 >= 0 && n2 >= 0) {
						resultado = Math.pow(n1, n2);
						System.out.println(n1 + " elevado a " + n2 + " es: " + resultado);
					} else {
						System.out.println("No se puede hacer potencias negativas");
					}
					break;
				case 6:
					if (n1 >= 0) {
						resultado = Math.sqrt(n1);
						System.out.println("Resultado de la raíz: " + resultado);
					} else {
						System.out.println("No se puede hacer raíces negativas");
					}
					break;
				case 7:
					resultado = 1;
					long n1_int = (long) n1;
					if (n1_int < 0) {
						System.out.println("No se puede calcular números negativos");
					} else {
						for (long i = 1; i <= n1_int; i++) {
							resultado = resultado * i;
						}
						System.out.println("Resultado del factorial: " + resultado);
					}
					break;

				default:
					break;
			}

			// Desenlace
			System.out.print("¿Continuar usando la calculadora? (s/n): ");
			respuesta = scanner.next();

			if (respuesta.equals("n")) {
				continuar = false;
			}
		}
		scanner.close();
	}
}
