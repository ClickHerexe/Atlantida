public abstract class Vehiculo {
	protected String marca, modelo;

	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public abstract void encenderMotor();

	public void mostrarDetalles() {
		System.out.println(marca);
		System.out.println(modelo);
	}
}
