import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        //Introducción
        int horas, minutos, segundos, horas2, minutos2, segundos2;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame las horas: ");
        horas = scanner.nextInt();
        System.out.print("Dame los minutos: ");
        minutos = scanner.nextInt();
        System.out.print("Dame los segundos: ");
        segundos = scanner.nextInt();
        System.out.print("Dame las horas del segundo: ");
        horas2 = scanner.nextInt();
        System.out.print("Dame los minutos del segundo: ");
        minutos2 = scanner.nextInt();
        System.out.print("Dame los segundos del segundo: ");
        segundos2 = scanner.nextInt();
        scanner.close();

        //Desenlace
        horas = horas * 3600;
        minutos = minutos * 60;
        segundos = horas + minutos + segundos;
        horas2 = horas2 * 3600;
        minutos2 = minutos2 * 60;
        segundos2 = horas2 + minutos2 + segundos2;
        segundos = segundos2 - segundos;
        System.out.println("La diferencia es de " + segundos + " segundos");
        
    }
}
