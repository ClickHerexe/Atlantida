public class Guerrero extends Personaje {

	public Guerrero(int nivel, String nombre) {
		super(nivel, nombre);
	}

	@Override
	public void usarHabilidad() {
		System.out.println(nombre + " usa su habilidad especial");
	}

	@Override
	public void atacar() {
		System.out.println(nombre + " usa su ataque");
	}
}
