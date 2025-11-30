Se trata de crear una clase llamada Electrodomestico con las siguientes características (4 puntos): 

Sus atributos son precio base, color, consumo energético (letras entre A+ hasta F) y peso.
Por defecto, el color será blanco, el consumo energético será A, el precio base es de 100 € y el peso por defecto es de 10 kg.
Los colores disponibles son: blanco, negro, plateado, rojo, azul y gris. Utilizar tipos enumerados para los colores.
Los métodos que implementara serán:
Constructor con todos los atributos y vacío.
Métodos get y set de todos los atributos.
comprobarConsumoEnergetico(String letra): comprueba que la letra es correcta, si no es correcta usará la letra por defecto. Este método se invocará al crear el objeto solamente y será privado.
toString(): se muestra el precio base, consumo energético y peso.
precioFinal():  calcula el precio final, según el consumo energético, aumentara su precio (tabla letra y precio), y también según su tamaño (tabla tamaño precio). A continuación, se da la lista de precios y tamaños:
 

LETRA    PRECIO

A+          120 €

A             100 €

B             80 €

C             60 €

D             50 €

E              30 €

F              10 €

TAMAÑO              PRECIO

Entre 0 y 19 kg       10 €

Entre 20 y 49 kg   30 €

Entre 50 y 79 kg   50 €

Mayor que 80 kg 100 €

 

A continuación, creamos una clase derivada llamada Lavadora con las siguientes características: (3 puntos)

Su atributo es carga, además de los atributos heredados.
Por defecto, la carga es de 5 kg.
El constructor lleva la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase madre.
Los métodos que se implementara serán:
Método get de carga.
toString(): se muestra el precio base, consumo energético, peso y carga.
precioFinal(): si tiene una carga mayor de 6 kg, aumentara el precio 50 €, si no es así no se incrementara el precio. Llama al método padre y añade el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

 

Ahora creamos una subclase llamada Television con las siguientes características: (3 puntos)

Sus atributos son resolución (en pulgadas) y Netflix (booleano), además de los atributos heredados.
Por defecto, la resolución será de 20 pulgadas y Netflix será false.
Se implementa un constructor con la resolución, Netflix y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
Método get de resolución y Netflix.
toString(): se muestra el precio base, consumo energético, peso, resolución y Netflix.
precioFinal(): si tiene una resolución mayor de 20 pulgadas, se incrementara el precio un 30% (del precio base) y si viene con Netflix, aumentara 60 €.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

 

Para probar la clase, creamos los siguientes electrodomésticos:

lavadoraAEG: Precio base 400 Euros, Color plateado, Consumo energético PK, Peso 30 Kg, Carga 7 Kg.

El precio final será de 580 Euros (Precio base 400 Euros + Consumo Energético A 100 Euros + Peso 30 Euros + Carga 50 Euros).

tvSamsung: Con todos los valores por defecto.

El precio final será de 210 Euros(Precio base 100 Euros + Consumo Energético A 100 Euros + Peso 10 Euros).

Mostrar por pantalla los atributos de cada objeto.

Después, resulta que tvSamsung tiene las siguientes características: Precio base 190 Euros, Color negro, Consumo energético A+, Peso 10 Kg, 24 pulgadas, con Netflix.

El precio final será de 437 Euros(Precio base 190 Euros + Consumo Energético A+ 120 Euros + Peso 10 Euros + Resolución 30% -> 57 Euros + Netflix 60 Euros).

Nota: Para trabajar con tipos enumerados, se incluye un enlace a un artículo.
https://jarroba.com/enum-enumerados-en-java-con-ejemplos/