public class Television extends Electrodomestico {

	int resolucion;
	boolean netflix;

	public Television() {
		this.resolucion = 20;
		this.netflix = false;
	}

	public Television(double precio_base, Colores color, String consumo, double peso, int resolucion, boolean netflix) {
		super(precio_base, color, consumo, peso);
		this.resolucion = resolucion;
		this.netflix = netflix;
	}

	@Override
	public String toString() {
		return "Precio Base: " + precio_original + "€" + ", Resolucion: " + resolucion + ", Consumo: " + consumo
				+ ", Netflix: " + netflix + ", Peso: " + peso + " Kg" + ", Color: " + color + ", Precio Final: " + precio_base
				+ "€";
	}

	@Override
	public void precioFinal() {
		super.precioFinal();

		if (resolucion > 20) {
			precio_base += precio_original * 0.30;
		}

		if (netflix == true) {
			precio_base += 60;
		}
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isNetflix() {
		return netflix;
	}

	public void setNetflix(boolean netflix) {
		this.netflix = netflix;
	}
}