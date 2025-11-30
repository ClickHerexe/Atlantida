public class Humano extends Mamifero {
	// Método nuevo de Humano
	public void hablar() {
		System.out.println("El humano habla con palabras");
	}

	@Override
	public void hacerSonido() {
		super.hacerSonido();
		System.out.println("El humano emite un sonido articulado");
	}
}
