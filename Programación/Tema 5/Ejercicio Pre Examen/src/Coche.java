public class Coche extends Vehiculo {

	private int numPuertas;

	public Coche(String marca, String modelo, int numPuertas) {
		super(marca, modelo);
		this.numPuertas = numPuertas;
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Puertas: " + numPuertas);
	}

	@Override
	public void encenderMotor() {
		System.out.println("Encendiendo motores");
	}

	public void abrirPuertas() {
		for (int i = 1; i <= numPuertas; i++) {
			System.out.println("Abriendo puerta numero " + i);
		}
		if (numPuertas > 2) {
			System.out.println("Este coche tiene más de dos puertas");
		}
	}

	public void crearCochePorConsola() {
	}
}
