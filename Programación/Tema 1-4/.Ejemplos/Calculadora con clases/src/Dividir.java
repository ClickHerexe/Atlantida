public class Dividir extends Calculadora {

	public Dividir(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double ejecutar() {
		return n1 / n2;
	}
}
