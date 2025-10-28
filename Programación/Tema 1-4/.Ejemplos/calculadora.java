import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        double numero1;
        double numero2;
        double resultado;
        String operador;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Di el primer numero: ");
        numero1 = scanner.nextDouble();

        System.out.print("Di el segundo numero: ");
        numero2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Pon el operador (+,-,/,*)");
        operador = scanner.nextLine();

        // if (operador.equals("+")) {
        //     resultado = numero1 + numero2;
        //     System.out.println(resultado);
        // } else if (operador.equals("-")) {
        //     resultado = numero1 - numero2;
        //     System.out.println(resultado);
        // } else if (operador.equals("*")) {
        //     resultado = numero1 * numero2;
        //     System.out.println(resultado);
        // } else if (operador.equals("/")) {
        //     resultado = numero1 / numero2;
        //     System.out.println(resultado);
        // }

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            case "/":
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            default:
                break;
        }
        scanner.close();
    }
}