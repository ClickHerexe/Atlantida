public class Electrodomestico {
	double precio_base;
	double precio_original;
	Colores color;
	String consumo;
	double peso;

	// Constructor sin parámetros
	public Electrodomestico() {
		this.precio_base = 100;
		this.color = Colores.Blanco;
		this.consumo = "A";
		this.peso = 10;
		this.comprobarConsumoEnergetico();
	}

	// Constructor con parámetros
	public Electrodomestico(double precio_base, Colores color, String consumo, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		this.comprobarConsumoEnergetico();
	}

	// comprobarComnsumoEnergetico
	private void comprobarConsumoEnergetico() {
		if (!consumo.equals("A+") && !consumo.equals("A") && !consumo.equals("B") && !consumo.equals("C")
				&& !consumo.equals("D") && !consumo.equals("E")
				&& !consumo.equals("F")) {
			consumo = "A";
		}
	}

	// To string
	@Override
	public String toString() {
		return "Precio Base: " + precio_original + ", Color: " + color + ", Consumo: " + consumo + ", Peso: "
				+ peso + ", Precio Final: " + precio_base + "€";
	}

	// Añadir precio final
	public void precioFinal() {
		precio_original = precio_base;

		switch (consumo) {
			case "A+":
				precio_base += 120;
				break;
			case "A":
				precio_base += 100;
				break;
			case "B":
				precio_base += 80;
				break;
			case "C":
				precio_base += 60;
				break;
			case "D":
				precio_base += 50;
				break;
			case "E":
				precio_base += 30;
				break;
			case "F":
				precio_base += 10;
				break;

			default:
				break;
		}

		if (peso > 0 && peso <= 19) {
			precio_base += 10;
		} else if (peso > 20 && peso <= 49) {
			precio_base += 30;
		} else if (peso > 50 && peso <= 79) {
			precio_base += 50;
		} else {
			precio_base += 100;
		}
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
