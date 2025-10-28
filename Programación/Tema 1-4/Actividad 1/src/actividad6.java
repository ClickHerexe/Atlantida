import java.util.Scanner;

public class actividad6 {
    public static void main(String[] args) {
        
        //Introducción
        String numero;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de 5 dígitos: ");
        numero = scanner.nextLine();
        scanner.close();

        //Desenlace
        System.out.println("El 1º numero es: " + numero.charAt(0));
        System.out.println("El 2º numero es: " + numero.charAt(1));
        System.out.println("El 3º numero es: " + numero.charAt(2));
        System.out.println("El 4º numero es: " + numero.charAt(3));
        System.out.println("El 5º numero es: " + numero.charAt(4));
    }
}