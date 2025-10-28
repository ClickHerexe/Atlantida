import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
		int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame el numero que quieres calcular: ");
        int numero = scanner.nextInt();
        scanner.close();

		for (int i = 1; i <= numero; i++)
			factorial = factorial * i;
		
		System.out.println("El factorial del número " + numero +  " es " + factorial);
		
    }
}