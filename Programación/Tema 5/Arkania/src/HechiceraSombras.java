public class HechiceraSombras extends Personaje {

	public HechiceraSombras(int nivel, String nombre) {
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
