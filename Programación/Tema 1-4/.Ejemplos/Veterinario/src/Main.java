public class Main {
    public static void main(String[] args) throws Exception {
        Perro p1 = new Perro("Carlos", 23, "Pastor Aleman", 4);
        Ave a1 = new Ave("Samuel", 20, "Pastor Belga", true);

        System.out.println(a1.getEdad());
        p1.saluda();
        a1.saluda();
    }
}
