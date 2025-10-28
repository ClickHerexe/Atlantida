import java.util.Scanner;

public class pizarra3 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime que tabla de multiplicar quieres que haga: ");
        int tabla = scanner.nextInt();

        for (int i=0; i<=10; i++) {
            int numero = tabla * i;
            System.out.println(tabla + " * " + i + " = " + numero);
        }
        scanner.close();
    }
}
