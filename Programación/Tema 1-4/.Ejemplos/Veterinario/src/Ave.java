public class Ave extends Animal {
	private boolean vuela;

	@Override
	public void saluda() {
		System.out.println("hola soy una ave");
	}

	public Ave(String nombre, int edad, String raza, boolean vuela) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.vuela = vuela;
	}

}