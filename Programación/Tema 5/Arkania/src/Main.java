public class Main {

	public static void main(String[] args) {

		// Héroes
		Personaje mago = new Mago(10, "Mago");
		Personaje guerrero = new Guerrero(10, "Guerrero");
		Personaje arquero = new Arquero(10, "Arquero");
		Personaje hechicera = new HechiceraSombras(10, "Hechicera");

		// Enemigos
		Slime slime = new Slime("Slime", 5);
		Dragon dragon = new Dragon("Dragoncito", 100);

		guerrero.atacar();
		mago.atacar();

		guerrero.usarHabilidad();
		mago.usarHabilidad();

		slime.huir();
		dragon.atacar();

		arquero.atacar();
		arquero.usarHabilidad();
		hechicera.atacar();
		hechicera.usarHabilidad();

		dragon.huir();

		arquero.subirNivel();
		hechicera.subirNivel();

	}
}
