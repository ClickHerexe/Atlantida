import java.util.Scanner;

public class actividad3 {
    public static void main(String[] args) {

        //Introducción
        double ropa, electro, suma, porcentajeRopa, porcentajeElectro;

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuantas unidades de ropa has vendido? ");
        ropa = scanner.nextDouble();
        System.out.print("¿Cuantas unidades de productos electrónicos has vendido? ");
        electro = scanner.nextDouble();
        scanner.close();

        //Desenlace
        suma = ropa + electro;
        porcentajeRopa = ropa * 100 / suma;
        porcentajeElectro = electro * 100 / suma;
        System.out.println("El porcentaje de la ropa es: " + porcentajeRopa+"%");
        System.out.println("El porcentaje de los productos electrónicos son: " + porcentajeElectro+"%");
    }
}

// si suma es el 100 %
// ropa es el ?%