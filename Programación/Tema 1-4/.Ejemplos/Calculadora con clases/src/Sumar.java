public class Sumar extends Calculadora {

	public Sumar(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double ejecutar() {
		return n1 + n2;
	}
}