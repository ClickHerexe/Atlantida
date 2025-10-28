import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {

		int descuento = 0;
		int dependientes = 0;
		double ingresos = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresos anuales: ");
		ingresos = scanner.nextDouble();
		System.out.print("Ingresa la cantidad de dependientes: ");
		dependientes = scanner.nextInt();
		scanner.close();

		if (ingresos >= 0 && ingresos < 20000) {
			descuento = 5;
		} else if (ingresos >= 20000 && ingresos < 40000) {
			descuento = 10;
		} else if (ingresos >= 40000 && ingresos < 80000) {
			descuento = 20;
		} else if (ingresos >= 80000) {
			descuento = 30;
		}

		if (dependientes >= 3) {
			descuento = descuento + 5;
		}

		double descuentoFinal = ingresos / 100 * descuento;
		System.out.println("Descuento aplicado: " + descuento + "%");
		double precioFinal = ingresos - descuentoFinal;
		System.out.printf("Precio final: %.2f€ %n", precioFinal);
	}
}