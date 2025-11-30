public class Producto {

	String nombre;
	double precio;
	double iva;
	double descuento;

	public Producto() {
		this.nombre = "Producto";
		this.precio = 100;
		this.iva = 21;
	}

	public Producto(String nombre, double precio, double iva, double descuento) {
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.descuento = descuento;
	}

	public void calcularPrecio() {
		double descuentoMenor = descuento / 100;
		double precioMenor = precio * descuentoMenor;
		double precioMenorAplicado = precio - precioMenor;

		double descuentoMayor = 0.1;
		double precioMayor = precioMenorAplicado * descuentoMayor;
		double precioMayorAplicado = precioMenorAplicado - precioMayor;

		double ivacalculado = iva / 100;
		double ivaSuma = precioMayorAplicado * ivacalculado;
		precio = precioMayorAplicado + ivaSuma;
	}

	@Override
	public String toString() {
		return nombre + ". Precio " + precio + " €" + ". IVA " + iva + ". Descuento " + descuento + "%";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

}
