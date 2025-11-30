public class Main {
	public static void main(String[] args) throws Exception {

		Lavadora lavadoraAEG = new Lavadora(400, Colores.Plateado, "PK", 30, 7);
		Television tvSamsung = new Television();

		// Lavadora
		System.out.println("");
		lavadoraAEG.precioFinal();
		System.out.println("Lavadora = " + lavadoraAEG);

		// TV Samsung
		System.out.println("");
		tvSamsung.precioFinal();
		System.out.println("Televisión Samsung = " + tvSamsung);
		System.out.println("");

		// Cambiar atributos TV Samsung
		tvSamsung.setPrecio_base(190);
		tvSamsung.setColor(Colores.Negro);
		tvSamsung.setConsumo("A+");
		tvSamsung.setPeso(10);
		tvSamsung.setResolucion(24);
		tvSamsung.setNetflix(true);
		tvSamsung.precioFinal();

		// TV Samsung con atributos cambiados
		System.out.println("Nuevo precio Televisión = " + tvSamsung);
	}
}