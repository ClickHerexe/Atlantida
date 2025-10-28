import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // Introducción
        int variable;

        // Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de x: ");
        variable = scanner.nextInt();
        scanner.close();

        // Desenlace
        variable = (variable * variable * variable * variable * variable)
                + 7 * (variable * variable * variable * variable) - 4 * (variable * variable * variable)
                + 2 * (variable * variable) - variable + 10;
        System.out.println("El resultado es: " + variable);
    }
}
