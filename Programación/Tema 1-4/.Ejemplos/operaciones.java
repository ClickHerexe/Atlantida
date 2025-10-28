import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) throws Exception {

        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        String operacion;

        //se crea el scanner
        Scanner scanner = new Scanner(System.in);

        // Se introduce el primer numero y se actualiza la variable numero1
        System.out.print("Dime el primer numero: ");
        numero1 = scanner.nextDouble();

        // Se introduce el segundo numero y se actualiza la variable numero2
        System.out.print("Dime el segundo numero: ");
        numero2 = scanner.nextDouble();
        scanner.nextLine();

        // Se dice si quieres sumar o restar con + o - y se actualiza la variable operación
        System.out.print("¿Que quieres hacer? ");
        operacion = scanner.nextLine();

        // Si pusimos +, se suma
        if (operacion.equals("+")) {
            resultado = numero1 + numero2;
            System.out.println("El resultado es " + resultado);
        }

        // Si pusimos -, se resta
        if (operacion.equals("-")) {
            resultado = numero1 - numero2;
            System.out.println("El resultado es " + resultado);
        }

        scanner.close();
    }
}