import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		// Introducción
		double descuento = 0;
		double descontado;
		double precio;
		String cliente;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenido");

		// Nudo
		System.out.print("Introduce el tipo de cliente: (regular, premium, vip) ");
		cliente = scanner.nextLine();
		System.out.print("Introduce el precio: ");
		precio = scanner.nextDouble();
		scanner.close();

		if (precio > 500 && cliente.equals("vip")) {
			System.out.println("5% de descuento extra por compra mayor de 500€ y cliente vip");
			descuento = 25;
		} else {
			switch (cliente) {
				case "regular":
					descuento = 5;
					break;
				case "premium":
					descuento = 10;
					break;
				case "vip":
					descuento = 20;
					break;
				default:
					System.out.println("Tipo de cliente no válido");
					return;
			}
		}

		descontado = precio / 100 * descuento;
		precio = precio - descontado;

		// Desenlace
		System.out.println("Tu descuento es del " + descuento + "%" + " y tu precio nuevo es " + precio + "€");
	}
}
