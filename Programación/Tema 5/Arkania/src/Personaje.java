public abstract class Personaje implements HabilidadEspecial {

	protected int nivel;
	protected String nombre;

	public Personaje(int nivel, String nombre) {
		this.nivel = nivel;
		this.nombre = nombre;
	}

	public abstract void atacar();

	public void subirNivel() {
		nivel++;
		System.out.println(nombre + " ha subido al nivel " + nivel);
	}

	public int getNivel() {
		return nivel;
	}

	public String getNombre() {
		return nombre;
	}
}