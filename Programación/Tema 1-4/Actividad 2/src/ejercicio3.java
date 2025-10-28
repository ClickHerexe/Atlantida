import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        //Introducción
        int partidosGanados, partidosPerdidos, partidosEmpatados, resultado;
        int puntucacionGanados, puntucacionPerdidos, puntucacionEmpatados;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce los partidos ganados: ");
        partidosGanados = scanner.nextInt();
        System.out.print("Introduce los partidos empatados: ");
        partidosEmpatados = scanner.nextInt();
        System.out.print("Introduce los partidos perdidos: ");
        partidosPerdidos = scanner.nextInt();
        scanner.close();

        //Desenlace
        puntucacionGanados = partidosGanados * 3;
        puntucacionEmpatados = partidosEmpatados * 1;
        puntucacionPerdidos = partidosPerdidos * 0;
        resultado = puntucacionGanados + puntucacionEmpatados + puntucacionPerdidos;
        System.out.println("La puntuación total es: " + resultado);
    }
}
