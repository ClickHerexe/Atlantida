import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {

        int numero, promedio;
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero a calcular: ");
        numero = scanner.nextInt();
        System.out.print("Ingresa valor a calcular del promedio: ");
        promedio = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <=numero ; i++) {
            resultado = numero / promedio;
        }

        System.out.println("El promedio de " + numero + " es: " + resultado);
    }

}