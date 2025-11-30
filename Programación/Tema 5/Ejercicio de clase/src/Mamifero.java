public class Mamifero extends Animal {
	public void amamantar() {
		System.out.println("El mamífero amamanta a sus crías");
	}

	@Override
	public void hacerSonido() {
		super.hacerSonido();
		System.out.println("El mamífero hace un sonido característico");
	}
}