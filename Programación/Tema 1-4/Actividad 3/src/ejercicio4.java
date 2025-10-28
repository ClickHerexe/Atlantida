import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		// Introducción
		String fecha = "";
		int calendario = 0;
		boolean print = true;

		Scanner scanner = new Scanner(System.in);

		// Nudo
		for (int i = 1; i <= 3; i++) {
			switch (i) {
				// Día
				case 1:
					System.out.print("Día: ");
					calendario = scanner.nextInt();

					if (calendario < 1 || calendario > 31) {
						print = false;
						System.out.println("El valor introducido no es correcto");
						scanner.close();
						return;
					}
					fecha = calendario + "/";
					break;

				// Mes
				case 2:
					System.out.print("Mes: ");
					calendario = scanner.nextInt();

					if (calendario < 1 || calendario > 12) {
						print = false;
						System.out.println("El valor introducido no es correcto");
						scanner.close();
						return;
					}
					fecha = fecha + calendario + "/";
					break;

				// Año
				case 3:
					System.out.print("Año: ");
					calendario = scanner.nextInt();

					if (calendario < 1900 || calendario > 2100) {
						print = false;
						System.out.println("El valor introducido no es correcto");
						scanner.close();
						return;
					}
					fecha = fecha + calendario;
					break;

				default:
					break;
			}
		}

		scanner.close();

		// Desenlace
		if (print == true) {
			System.out.println("La fecha válida introducida es: " + fecha);
		}
	}
}
