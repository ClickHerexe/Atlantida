import java.util.Scanner;

public class entrada {

        public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Nota media: ");
        double media = scanner.nextDouble();

        System.out.print("Eres estudiante? ");
        boolean esEstudiante = scanner.nextBoolean();

        System.out.println("Hola " + nombre);
        System.out.println("Tienes " + edad + " años");
        System.out.println("Tu media es " + media);

        if (esEstudiante) {
            System.out.println("Eres un estudiante");
        }
        else {
            System.out.println("No eres estudiante");
        }

        scanner.close();
    }
}