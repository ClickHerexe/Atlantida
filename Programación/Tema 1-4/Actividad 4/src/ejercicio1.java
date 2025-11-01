import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Introducción
        String cadena;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        cadena = scanner.nextLine();
        scanner.close();

        // Nudo
        for (int i = 0; i < cadena.length(); i++) {
            contador++;
        }

        // Desenlace
        System.out.println("La cadena tiene " + contador + " caracteres");
    }
}
