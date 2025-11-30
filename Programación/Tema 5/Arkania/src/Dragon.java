public class Dragon implements Enemigo {

	int puntosVida;
	String nombre;

	public Dragon(String nombre, int puntosVida) {
		this.nombre = nombre;
		this.puntosVida = puntosVida;
	}

	@Override
	public void atacar() {
		System.out.println("El Dragon ataca");
	}

	@Override
	public void huir() {
		System.out.println("El Dragon huye");
	}

}
