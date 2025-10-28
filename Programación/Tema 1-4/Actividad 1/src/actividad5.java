import java.util.Scanner;

public class actividad5 {
    public static void main(String[] args) {

        //Intro
        int intro, segundos, minutos, minutos2, horas, horas2;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el tiempo en segundos para convertirlo: ");
        intro = scanner.nextInt();
        scanner.close();

        //Desenlace
        segundos = intro % 60;
        minutos = intro / 60;
        minutos2 = minutos % 60;
        horas = minutos / 60;
        horas2 = horas % 60;
        System.out.println(horas2 + " horas " + minutos2 + " minutos " + segundos + " segundos");
    }
}