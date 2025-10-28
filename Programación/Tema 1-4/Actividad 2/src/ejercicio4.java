import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        //Introducción
        String nombre;
        double notapractica, notaproblemas, notateorica, notafinal;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno: ");
        nombre = scanner.nextLine();
        System.out.print("Introduce la nota práctica del alumno: ");
        notapractica = scanner.nextInt();
        System.out.print("Introduce la nota de problemas del alumno: ");
        notaproblemas = scanner.nextInt();
        System.out.print("Introduce la nota teórica del alumno: ");
        notateorica = scanner.nextInt();
        scanner.close();

        //Desenlace
        notapractica = notapractica / 10 * 1;
        notaproblemas = notaproblemas / 10 * 5;
        notateorica = notateorica / 10 * 4;
        notafinal = notapractica + notaproblemas + notateorica;
        System.out.println("La nota final de " + nombre + " es " + notafinal);
    }
}
