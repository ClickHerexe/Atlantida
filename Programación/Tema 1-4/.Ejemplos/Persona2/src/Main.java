public class Main {
	public static void main(String[] args) {
		Persona p1 = new Persona("Carlos", 25, "12345L");
		Persona p2 = new Persona("Javi", 22, "54321L");

		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Nombre: " + p2.getNombre());

		p1.setNombre("Canela");
		System.out.println("Nombre: " + p1.getNombre());
	}
}