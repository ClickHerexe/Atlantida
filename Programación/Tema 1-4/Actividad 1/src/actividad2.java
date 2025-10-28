import java.util.Scanner;

public class actividad2 {
    public static void main(String[] args) {

        //Introducción
        int dato1, dato2, dato3, dato4;
        double multiplicacion, suma, media;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame el primer numero entero: ");
        dato1 = scanner.nextInt();
        System.out.print("Dame el segundo numero entero: ");
        dato2 = scanner.nextInt();
        System.out.print("Dame el tercer numero entero: ");
        dato3 = scanner.nextInt();
        System.out.print("Dame el cuarto numero entero: ");
        dato4 = scanner.nextInt();
        scanner.close();

        //Desenlace
        multiplicacion = dato1 * dato2 * dato3 * dato4;
        System.out.println("La multiplicación de todos los numeros es: " + multiplicacion);
        suma = dato1 + dato2 + dato3 + dato4;
        System.out.println("La suma de todos los numeros es: " + suma);
        media = suma / 4;
        System.out.println("La media es: " + media);
    }
}
