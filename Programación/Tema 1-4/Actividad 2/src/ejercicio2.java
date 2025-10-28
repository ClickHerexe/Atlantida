import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
     
        //Introducción
        int horas, salarioDiario, salarioSemanal;
        int salarioHora = 12;
        int diasTrabajadosSemana = 5;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas al día: ");
        horas = scanner.nextInt();
        scanner.close();
        
        //Desenlace
        salarioDiario = horas * salarioHora;
        salarioSemanal = salarioDiario * diasTrabajadosSemana;
        System.out.println("El empleado gana: " + salarioSemanal + " € a la semana");
    }
}