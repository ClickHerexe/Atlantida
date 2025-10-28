import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        // Introducción
        Scanner scanner = new Scanner(System.in);

        // Nudo
        System.out.print("Usuario: ");
        String user = scanner.nextLine();
        System.out.print("Contraseña: ");
        String pass = scanner.nextLine();
        String clave = user + ":" + pass;
        scanner.close();

        // Desenlace
        switch (clave) {
            case "admin:1234":
                System.out.println("Acceso para admin concedido");
                break;
            case "user:abcd":
                System.out.println("Acceso para usuario concedido");
                break;
            case "guest:xyz":
                System.out.println("Acceso para invitado concedido");
                break;
            default:
                System.out.println("Acceso denegado");
                break;
        }
    }
}