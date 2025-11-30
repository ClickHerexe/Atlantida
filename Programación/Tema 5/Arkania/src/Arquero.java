public class Arquero extends Personaje {

	public Arquero(int nivel, String nombre) {
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
