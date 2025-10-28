import java.util.Scanner;

public class actividad1 {
    public static void main(String[] args) {

        // Introducción
        double radio;
        double area; // pi * radio al cuadrado
        double perimetro; // 2 * pi * radio
        double pi = 3.14159265;

        // Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame el radio de la circunferencia: ");
        radio = scanner.nextDouble();
        scanner.close();

        // Desenlace
        area = pi * Math.pow(radio, 2);
        System.out.printf("El area es: %.2f%n", area);
        perimetro = 2 * pi * radio;
        System.out.printf("El perimetro es: %.2f%n", perimetro);
    }
}