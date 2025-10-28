import java.util.Scanner;

public class pizarra4 {
    public static void main(String[] args) {

        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i<5; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Dime un numero: ");
            int numero = scanner.nextInt();
            scanner.close();

            if (numero < 0 ) {
                negativos++;
            } else {
                positivos++;
            }
        }

        System.out.println("Hay " + positivos + " positivos");
        System.out.println("Hay " + negativos + " negativos");

    }
}