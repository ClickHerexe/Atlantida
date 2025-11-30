public class Main {
    public static void main(String[] args) throws Exception {
        int contador = 0;

        Producto prod1 = new Producto("Impresora HP", 100, 21, 5);
        contador++;
        Producto prod2 = new Producto("Ratón Logitech", 20, 4, 15);
        contador++;
        Producto prod3 = new Producto("Libro Java", 20, 4, 15);
        contador++;

        System.out.println("---Tienda---");
        System.out.println("");

        // Mostrar datos de los productos
        System.out.println("Cantidad productos: " + contador);
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println("");

        // Black Friday
        System.out.println("LLegó el black friday");
        System.out.println("");
        prod1.calcularPrecio();
        prod3.calcularPrecio();

        // Precio Logitech cambiado
        prod2.precio = 12;

        // Nuevos precios tras black friday con iva
        System.out.println("Nuevos precios (IVA incluido):");
        System.out.println(prod1.nombre + ": " + prod1.precio + "€");
        System.out.println(prod2.nombre + ": " + prod2.precio + "€");
        System.out.println(prod3.nombre + ": " + prod3.precio + "€");
    }
}
