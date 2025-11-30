public class Main {
    public static void main(String[] args) throws Exception {

        Coche coche = new Coche("Mercedes", "Benz", 4);

        System.out.println("");
        coche.mostrarDetalles();
        System.out.println("");
        coche.encenderMotor();
        System.out.println("");
        coche.abrirPuertas();
    }
}
