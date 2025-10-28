import java.util.Scanner;

public abstract class Main {
	public static void main(String[] args) {
		double numero1, numero2, resultado;
		String opera;

		// Se piden los numeros y la operacion
		Scanner scanner = new Scanner(System.in);
		System.out.print("Numero 1: ");
		numero1 = scanner.nextDouble();
		System.out.print("Numero 2: ");
		numero2 = scanner.nextDouble();
		System.out.print("Operación (+,-,*,/): ");
		opera = scanner.next();

		scanner.close();

		// Usar Switch para los casos del operador
		switch (opera) {
			case "+":
				Sumar suma = new Sumar(numero1, numero2);
				resultado = suma.ejecutar();
				System.out.println("La suma es: " + resultado);
				break;
			case "-":
				Restar resta = new Restar(numero1, numero2);
				resultado = resta.ejecutar();
				System.out.println("La resta es: " + resultado);
				break;
			case "*":
				Multiplicar multi = new Multiplicar(numero1, numero2);
				resultado = multi.ejecutar();
				System.out.println("La multiplicación es: " + resultado);
				break;
			case "/":
				Dividir dividir = new Dividir(numero1, numero2);
				resultado = dividir.ejecutar();
				System.out.println("La división es: " + resultado);
				break;

			default:
				break;
		}
	}
}