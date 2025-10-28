import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {

        // Introducción
        double radio, perimetro, area;
        double pi = 3.14;

        // Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        radio = scanner.nextDouble();
        scanner.close();

        // Desenlace
        area = pi * Math.pow(radio, 2);
        System.out.println("El area es: " + area);
        perimetro = 2 * pi * radio;
        System.out.println("El perimetro es: " + perimetro);
    }
}