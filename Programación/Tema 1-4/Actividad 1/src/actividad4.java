import java.util.Scanner;

public class actividad4 {
    public static void main(String[] args) {
        
        //Introducción
        int condicion1;
        int condicion2;
        int condicion3;
        int intercambio;

        //Nudo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce A: ");
        condicion1 = scanner.nextInt();
        System.out.print("Introduce B: ");
        condicion2 = scanner.nextInt();
        System.out.print("Introduce C: ");
        condicion3 = scanner.nextInt();
        scanner.close();

        //Desenlace
        intercambio = condicion1; //I es A
        condicion1 = condicion3; //A es C
        condicion3 = intercambio; // C es A
        intercambio = condicion2; // I es B
        condicion2 = condicion3; // B es A
        condicion3 = intercambio; // C es B

        System.out.println("A es: " + condicion1);
        System.out.println("B es: " + condicion2);
        System.out.println("C es: " + condicion3);
    }
}

// A = A | A = C | A = C | A = C | A = C | A = C |
// B = B | B = B | B = B | B = B | B = A | B = A |
// C = C | C = C | C = A | C = A | C = A | C = B |
// I = A | I = A | I = A | I = B | I = B | I = B |