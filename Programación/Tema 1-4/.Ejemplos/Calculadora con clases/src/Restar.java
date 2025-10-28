public class Restar extends Calculadora {

	public Restar(double num1, double num2) {
		this.n1 = num1;
		this.n2 = num2;
	}

	public double ejecutar() {
		return n1 - n2;
	}
}
