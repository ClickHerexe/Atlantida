public class Lavadora extends Electrodomestico {

	int carga;

	public Lavadora() {
		this.carga = 5;
	}

	public Lavadora(double precio_base, Colores color, String consumo, double peso, int carga) {
		super(precio_base, color, consumo, peso);
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Precio Base: " + precio_original + "€" + ", Carga: " + carga + " Kg" + ", Consumo: " + consumo + ", Peso: "
				+ peso + " Kg" + ", Precio Final: " + precio_base + "€";
	}

	@Override
	public void precioFinal() {
		super.precioFinal();

		if (carga > 6) {
			precio_base += 50;
		}
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
