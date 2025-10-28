import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        //Introducción
        int dia, mes, anio, numsuerte, numsuerte1, numsuerte2, numsuerte3, numsuerte4; 

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame el día en número: ");
        dia = scanner.nextInt();
        System.out.print("Dame el mes en número: ");
        mes = scanner.nextInt();
        System.out.print("Dame el año en número: ");
        anio = scanner.nextInt();
        scanner.close();

        //Desenlace
        numsuerte = dia + mes + anio;
        numsuerte1 = numsuerte / 1000;
        int resto = numsuerte % 1000;
        numsuerte2= resto / 100;
        resto = numsuerte % 100;
        numsuerte3= resto / 10;
        numsuerte4 = numsuerte % 10;
        numsuerte = numsuerte1 + numsuerte2 + numsuerte3 + numsuerte4;
        System.out.println("Tu numero de la suerte es: " + numsuerte);
    }
}