import java.util.Scanner;

public class pizarra2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hasta que numero quieres sumar: ");
        int limite = scanner.nextInt();
        scanner.close();

        for (int i=0; i <= limite; i++) {
            System.out.println(i);
        }
    }
}