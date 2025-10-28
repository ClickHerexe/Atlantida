public class Perro extends Animal {
	private int numeroPata;

	@Override
	public void saluda() {
		System.out.println("hola soy un perro");
	}

	public Perro(String nombre, int edad, String raza, int numeroPata) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.numeroPata = numeroPata;

	}
}
