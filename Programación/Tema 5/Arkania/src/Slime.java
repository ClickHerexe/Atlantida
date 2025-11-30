public class Slime implements Enemigo {

	int puntosVida;
	String nombre;

	public Slime(String nombre, int puntosVida) {
		this.nombre = nombre;
		this.puntosVida = puntosVida;
	}

	@Override
	public void atacar() {
		System.out.println("El Slime ataca");
	}

	@Override
	public void huir() {
		System.out.println("El Slime huye");
	}
}
