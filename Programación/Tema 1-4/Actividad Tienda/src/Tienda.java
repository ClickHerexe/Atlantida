import java.util.Random;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {

        String cargadorTypeC = "Cargador tipo C";
        String bateriaExterna = "Batería Externa";
        String mouse = "Ratón";
        String teclado = "Teclado";
        String pantalla = "Pantalla";
        double cargadorTypeCPrecio = 11.99;
        double bateriaExternaPrecio = 36.95;
        double mousePrecio = 25.11;
        double tecladoPrecio = 79.97;
        double pantallaPrecio = 209.99;
        int iva = 21;

        System.out.println("                                ____  _                           _     _       ");
        System.out.println("                               |  _ \\(_)                         (_)   | |      ");
        System.out.println("                               | |_) |_  ___ _ ____   _____ _ __  _  __| | ___  ");
        System.out.println("                               |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\ ");
        System.out.println("                               | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) |");
        System.out.println("                               |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/ ");
        System.out.println(" ");
        System.out.println("   ▄████████ ███▄▄▄▄      ▄██████▄     ▄████████  ▄█          ▄████████    ▄█    █▄     ▄██████▄     ▄███████▄ ");
        System.out.println("  ███    ███ ███▀▀▀██▄   ███    ███   ███    ███ ███         ███    ███   ███    ███   ███    ███   ███    ███ ");
        System.out.println("  ███    ███ ███   ███   ███    █▀    ███    █▀  ███         ███    █▀    ███    ███   ███    ███   ███    ███ ");
        System.out.println("  ███    ███ ███   ███  ▄███         ▄███▄▄▄     ███         ███         ▄███▄▄▄▄███▄▄ ███    ███   ███    ███ ");
        System.out.println("▀███████████ ███   ███ ▀▀███ ████▄  ▀▀███▀▀▀     ███       ▀███████████ ▀▀███▀▀▀▀███▀  ███    ███ ▀█████████▀  ");
        System.out.println("  ███    ███ ███   ███   ███    ███   ███    █▄  ███                ███   ███    ███   ███    ███   ███        ");
        System.out.println("  ███    ███ ███   ███   ███    ███   ███    ███ ███▌    ▄    ▄█    ███   ███    ███   ███    ███   ███        ");
        System.out.println("  ███    █▀   ▀█   █▀    ████████▀    ██████████ █████▄▄██  ▄████████▀    ███    █▀     ▀██████▀   ▄████▀      ");
        System.out.println(" ");

        System.out.println("                                          ┌──────────────────────────────┐");
        System.out.println("                                          │ " + cargadorTypeC + " .. »  " + cargadorTypeCPrecio + "€ │");
        System.out.println("                                          │ " + bateriaExterna + " .. »  " + bateriaExternaPrecio + "€ │");
        System.out.println("                                          │ " + mouse + " ............ »  " + mousePrecio + "€ │");
        System.out.println("                                          │ " + teclado + " .......... »  " + tecladoPrecio + "€ │");
        System.out.println("                                          │ " + pantalla + " ......... » " + pantallaPrecio + "€ │");
        System.out.println("                                          └──────────────────────────────┘");

        //Solicitud de productos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad deseada de " + cargadorTypeC + " : ");
        int cantidadCargadorTypeC = scanner.nextInt();
        System.out.print("Cantidad deseada de " + bateriaExterna + " : ");
        int cantidadBateriaExterna = scanner.nextInt();
        System.out.print("Cantidad deseada de " + mouse + " : ");
        int cantidadMouse = scanner.nextInt();
        System.out.print("Cantidad deseada de " + teclado + " : ");
        int cantidadTeclado = scanner.nextInt();
        System.out.print("Cantidad deseada de " + pantalla + " : ");
        int cantidadPantalla = scanner.nextInt();
        scanner.nextLine(); //Limpiamos buffer
        System.out.print("Escriba su nombre completo: ");
        String nombre = scanner.nextLine();
        scanner.close();

        //Logo resumen
        System.out.println(" ");
        System.out.println("  _____                                          __           _                   ");
        System.out.println(" |  __ \\                                        / _|         | |                  ");
        System.out.println(" | |__) |___  ___ _   _ _ __ ___   ___ _ __    | |_ __ _  ___| |_ _   _ _ __ __ _ ");
        System.out.println(" |  _  // _ \\/ __| | | | '_ ` _ \\ / _ \\ '_ \\   |  _/ _` |/ __| __| | | | '__/ _` |");
        System.out.println(" | | \\ \\  __/\\__ \\ |_| | | | | | |  __/ | | |  | || (_| | (__| |_| |_| | | | (_| |");
        System.out.println(" |_|  \\_\\___||___/\\__,_|_| |_| |_|\\___|_| |_|  |_| \\__,_|\\___|\\__|\\__,_|_|  \\__,_|");
        System.out.println(" ");

        //Mensaje resumen con solo el nombre inicial
        int espacio = nombre.indexOf(" ");
        if (nombre.contains(" ")) {
            String nombreSeparado = nombre.substring(0, espacio);
            System.out.println("Sr/Sra " + nombreSeparado + " aquí tiene el resumen de la factura:");
        } else {
            System.out.println("Sr/Sra " + nombre + " aquí tiene el resumen de la factura:");
        }
        //Se imprime el nombre convirtiendolo en mayus
        String nombreMayus = nombre.toUpperCase();
        System.out.println("Nombre cliente: " + nombreMayus);
        //Salen las cantidades de los productos
        System.out.println(cargadorTypeC + ": " + cantidadCargadorTypeC);
        System.out.println(bateriaExterna + ": " + cantidadBateriaExterna);
        System.out.println(mouse + ": " + cantidadMouse);
        System.out.println(teclado + ": " + cantidadTeclado);
        System.out.println(pantalla + ": " + cantidadPantalla);
        //Se calcula la suma de los productos
        double precioSinIVA = cargadorTypeCPrecio * cantidadCargadorTypeC + bateriaExternaPrecio * cantidadBateriaExterna + mousePrecio * cantidadMouse + tecladoPrecio * cantidadTeclado + pantallaPrecio * cantidadPantalla;
        System.out.println("Total sin IVA: " + precioSinIVA + "€");
        //Se calcula el IVA
        System.out.println("IVA aplicado: " + iva + "%");
        double ivaRepercutido = precioSinIVA / 100 * iva;
        System.out.println("IVA repercutido: " + ivaRepercutido + "€");
        double precioConIVA = precioSinIVA + ivaRepercutido;
        System.out.println("Total con IVA: " + precioConIVA + "€");
        //Se aplica el descuento por primera vez
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(6)+5;
        System.out.println("Descuento por 1º vez: " + numAleatorio + "%");
        //Se calcula el descuento
        double precioDescontado = precioConIVA / 100 * numAleatorio;
        System.out.println("Valor descontado: " + precioDescontado + "€");
        //Da el precio final
        double precioFinal = precioConIVA - precioDescontado;
        System.out.println("Total final: " + precioFinal + "€");
        System.out.println(" ");

        //Logo final
        System.out.println("   _____                _                                                                                   ");
        System.out.println("  / ____|              (_)                                                                                  ");
        System.out.println(" | |  __ _ __ __ _  ___ _  __ _ ___    _ __   ___  _ __    ___ _   _     ___ ___  _ __ ___  _ __  _ __ __ _ ");
        System.out.println(" | | |_ | '__/ _` |/ __| |/ _` / __|  | '_ \\ / _ \\| '__|  / __| | | |   / __/ _ \\| '_ ` _ \\| '_ \\| '__/ _` |");
        System.out.println(" | |__| | | | (_| | (__| | (_| \\__ \\  | |_) | (_) | |     \\__ \\ |_| |  | (_| (_) | | | | | | |_) | | | (_| |");
        System.out.println("  \\_____|_|  \\__,_|\\___|_|\\__,_|___/  | .__/ \\___/|_|     |___/\\__,_|   \\___\\___/|_| |_| |_| .__/|_|  \\__,_|");
        System.out.println("                                      | |                                                  | |              ");
        System.out.println("                                      |_|                                                  |_|              ");
    }
}