
## Descripción

Ejercicios pensados para practicar el uso de lambdas.

### Tecnologias usadas

- Java 23

- IntelliJ


***

Para todos los ejercicios se debe utilizar la API de Java Lambdas and Streams de Java 8+.

## Nivel 1

<br>

EJERCICIO 1:

A partir de una lista de Strings, escribe un método que devuelve una lista de todas las cadenas que contienen la letra 'o'. Imprime el resultado.

<br>

EJERCICIO 2:

Ahora, el método debe devolver una lista con los Strings que, además de contener la letra 'o', también tienen más de 5 letras. Imprime el resultado.

<br>

EJERCICIO 3:

Crea una lista con los nombres de los meses del año. Imprime todos los elementos de la lista con una lambda.

<br>

EJERCICIO 4:

Hacer la misma impresión del punto anterior, pero mediante method reference.

<br>

EJERCICIO 5:

Crea una Functional Interface con un método llamado getPiValue() que debe devolver un double. Desde el main() de la clase principal, instancia la interfaz y asígnale el valor 3.1415. Invoca el método getPiValue() e imprime el resultado.

<br>

EJERCICIO 6:

Crea una lista con números y cadenas de texto y ordena la lista con las cadenas de más corta a más larga.

<br>

EJERCICIO 7:

Con la lista del ejercicio anterior, ahora ordénala al revés, de cadena más larga a más corta.

<br>

EJERCICIO 8:

Crea una Functional Interface que contenga un método llamado reverse(). Este método debe recibir y debe retornar un String. En el main() de la clase principal, inyecta en la interfaz creada mediante una lambda, el cuerpo del método, de manera que devuelva la misma cadena que recibe como parámetro pero al revés. Invoca la instancia de la interfaz pasándole una cadena y comprueba si el resultado es correcto.

<br>

***

## Nivel 2

<br>

EJERCICIO 1:

Crea una lista de cadenas con nombres propios. Escribe un método que retorne una lista de todas las cadenas que comienzan con la letra 'A' (mayúscula) y tienen exactamente 3 letras. Imprime el resultado.

<br>

EJERCICIO 2:

Programa un método que retorna una cadena separada por comas, basada en una lista de Integers. Cada elemento ha de ir precedido por la letra "e" si el número es par, o por la letra "o" si el número es impar. Por ejemplo, si la lista de entrada es (3, 55, 44), la salida ha de ser "o3, o55, e44". Imprimeix el resultado.

<br>

EJERCICIO 3:

Crea una Functional Interface que contenga un método llamado operacio(). Este método ha de retornar un float. Injecta a la interfaz creada mediante una lambda, el cuerpo del método, de manera que se pueda transformar la operación con una suma, una resta, una multiplicación y una división.

<br>

EJERCICIO 4:

Crea una lista que contenga algunas cadenas de texto y nombres.

Ordena-los por:

- Alfabéticamente por el primer carácter. (Nota: charAt(0) retorna el código numérico del primer carácter)
- Las cadenas que contienen una "e" primero, el resto de cadenas después. Posa el código directamente en la lambda.
- Modifica todos los elementos de la lista que tienen una 'a'. Modifica la 'a' por un '4'.
- Muestra solo los elementos que son numéricos. (Aunque estén guardados como Strings).

<br>

***


## Cómo ejecutarlo
Clona el repositorio o descarga el archivo zip, luego ábrelo en tu entorno de desarrollo integrado (IDE) preferido.