import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int numero = scanner.nextInt();
        int suma = 0;
        scanner.close();

        while (numero != 0) {
            suma = suma + numero % 10;
            numero = numero / 10;
        }
        System.out.print("La suma es: " + suma);
    }
}