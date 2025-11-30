Versión A

Desarrollar una clase llamada Tienda.

Las propiedades de la clase son las siguientes:

producto: Nombre del producto
precio: Precio del producto
iva: IVA del producto, en número
descuento: Descuento sobre el precio del producto, en número
Hay que llevar la cuenta del número de productos de la tienda, así como tener un descuento global para todos los productos de la tienda. El número de productos solamente se puede leer desde fuera de la clase. El descuento global es de solo escritura desde fuera de la clase.

En cuanto a los métodos de la clase, son los siguientes:

Se puede crear un producto con todos los datos, o bien pasando solamente el nombre del producto. En ese caso, el precio por defecto será de diez euros, el descuento cero y el iva 21.
calcularPrecio(),  Obtiene el precio del producto, calculado a partir del precio, se aplica el descuento mayor entre el descuento del producto, y el descuento global, y aplicar el iva.
toString(), mostrará por pantalla el nombre del producto y el precio final.
Datos de prueba:

Impresora HP. Precio 100 Euros. IVA 21%. Descuento 5%

Ratón Logitech.

Libro Java. Precio 20 Euros. IVA 4%. Descuento 15%;

Mostrar todos los datos de los productos y número de productos.

Llega el Black Friday, se aplica un descuento a todos los productos del 10%.

El producto ratón Logitech sube a 12 Euros.

Mostrar todos los datos de los productos y número de productos.