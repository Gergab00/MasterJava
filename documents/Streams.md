## Streams

El API Stream de Java 8 es una herramienta importante para trabajar con datos en Java. Proporciona una forma más eficiente y expresiva de procesar colecciones de datos.

Un stream es un flujo de datos que se puede procesar de manera secuencial o paralela. Puedes pensar en un stream como una lista de elementos que se pueden procesar de forma eficiente mediante una serie de operaciones. Estas operaciones pueden ser filtrado, transformación, agrupamiento, etc.

Hay dos tipos de operaciones en Stream: operaciones intermedias y operaciones terminales. Las operaciones intermedias producen un nuevo stream como resultado, mientras que las operaciones terminales producen un resultado que no es un stream.

### Operaciones Intermedias

Las operaciones intermedias permiten transformar, filtrar y agrupar los elementos de un Stream. Algunas de las operaciones intermedias más comunes son:

- **`map()`**: transforma cada elemento del Stream a otro elemento.

- **`filter()`**: filtra los elementos del Stream según una condición dada.

- **`limit()`**: limita el número de elementos del Stream a un valor dado.

- **`flat()`**: aplanar un Stream de Streams en un solo Stream.

- **`flatMap()`**: combina múltiples Streams en un solo Stream.

- **`distinct()`**: elimina los elementos duplicados del Stream.

- **`sorted()`**: ordena los elementos del Stream.

- **`peek()`**: permite ver los elementos del Stream a medida que son procesados, sin modificarlos.

- **`limit()`**: limita el número de elementos del Stream a un valor dado.

- **`skip()`**: salta un número determinado de elementos del Stream.`

- **`reduce()`**: combina los elementos del Stream en un solo valor.

A continuación se muestra un ejemplo de uso de algunas de estas operaciones intermedias:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Operación filter()
        Stream<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0);
        evenNumbers.forEach(System.out::println);

        // Operación map()
        Stream<Integer> squareOfNumbers = numbers.stream().map(n -> n * n);
        squareOfNumbers.forEach(System.out::println);

        // Operación flatMap()
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        Stream<Integer> flattenedStream = nestedList.stream().flatMap(list -> list.stream());
        flattenedStream.forEach(System.out::println);
    }
}
```

En este ejemplo, se crea una lista de números enteros y luego se utiliza cada una de las operaciones intermedias mencionadas (**`filter()`**, **`map()`** y **`flatMap()`**) en el Stream correspondiente. La operación **`filter()`** permite filtrar los elementos que cumplen una determinada condición. La operación **`map()`** permite transformar cada elemento en otro según una función especificada. La operación **`flatMap()`** permite aplanar una Stream de Streams en una sola Stream.

### Operaciones Terminales

Las operaciones terminales en la API de Stream en Java son aquellas que producen un resultado o un efecto secundario. Algunos ejemplos de operaciones terminales incluyen:

- **`forEach`**: permite procesar cada elemento de un stream de manera secuencial.

- **`collect`**: permite agrupar los elementos de un stream en una colección, como una lista, un conjunto o un mapa.

- **`reduce`**: permite combinar los elementos de un stream en un solo valor, usando una función de acumulación.

- **`count`**: devuelve el número de elementos en un stream.

- **`min y max`**: devuelven el valor mínimo y máximo, respectivamente, en un stream.

- **`anyMatch, allMatch y noneMatch`**: devuelven si algún, todos o ninguno de los elementos de un stream cumplen con una condición determinada, respectivamente.

- **`findFirst y findAny`**: devuelven el primer o cualquier elemento de un stream, respectivamente.

Estas operaciones terminales son útiles para producir un resultado final a partir de un stream, y también para efectuar acciones como contar elementos, buscar elementos específicos y reducir un stream a un valor único.

A continuación se muestra un ejemplo de uso de algunas de estas operaciones terminales:

```java

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// usamos filter() para filtrar los números pares
List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
System.out.println("Números pares: " + evenNumbers);

// usamos count() para contar el número de elementos en el stream
long count = numbers.stream().filter(x -> x % 2 == 0).count();
System.out.println("Número de números pares: " + count);

// usamos max() y min() para encontrar el máximo y el mínimo número en el stream
Optional<Integer> max = numbers.stream().max(Integer::compare);
System.out.println("Máximo número: " + max.orElse(0));
Optional<Integer> min = numbers.stream().min(Integer::compare);
System.out.println("Mínimo número: " + min.orElse(0));

// usamos forEach() para imprimir cada elemento en el stream
System.out.print("Números impares: ");
numbers.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.print(x + " "));
System.out.println();

// usamos reduce() para combinar los elementos del stream en un solo valor
int sum = numbers.stream().reduce(0, Integer::sum);
System.out.println("Suma de todos los números: " + sum);

// usamos collect() para agrupar los elementos del stream en una lista
List<Integer> numbersList = numbers.stream().collect(Collectors.toList());
System.out.println("Lista de números: " + numbersList);

```

En este ejemplo, creamos una lista de números y luego la convertimos en un stream. Después usamos la operación **`filter()`** para filtrar los números pares, y luego usamos **`collect()`** para convertir el stream en una lista. La operación **`count()`** se usa para contar el número de elementos en el stream después de haber sido filtrados. Las operaciones **`max()`** y **`min()`** se usan para encontrar el máximo y el mínimo número en el stream, respectivamente. Finalmente, usamos la operación **`forEach()`** para imprimir cada elemento en el stream después de haber sido filtrados. También usamos **`reduce()`** para combinar los elementos del stream en un solo valor. Por último, usamos **`collect()`** para agrupar los elementos del stream en una lista.

## Consideraciones y buenas prácticas para el uso de Streams

1. Evite la creación innecesaria de Streams: Crear un Stream cuesta recursos, por lo que es importante evitar crear Streams innecesarios. Por ejemplo, si solo necesita recorrer una lista una sola vez, no tiene sentido crear un Stream. En su lugar, puede usar un simple for o un for-each.

```java
// Incorrecto: Creación innecesaria de un Stream
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().forEach(System.out::println);

// Correcto: Uso de un for-each
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
for (int number : numbers) {
    System.out.println(number);
}
```

2. No almacene un Stream en una variable si no se va a reutilizar: Una vez que se ha consumido un Stream, no se puede volver a usar. Por lo tanto, es inútil almacenar un Stream en una variable si no se va a reutilizar.

```java
// Incorrecto: Almacenamiento inútil de un Stream
Stream<Integer> stream = numbers.stream();
stream.forEach(System.out::println);
stream.forEach(System.out::println); // Esta línea generará un error

// Correcto: Creación de un Stream en el momento de su uso
numbers.stream().forEach(System.out::println);
numbers.stream().forEach(System.out::println);
```

3. No modifique una colección mientras se recorre con un Stream: Modificar una colección mientras se recorre con un Stream puede provocar errores impredecibles. En su lugar, se recomienda usar la operación collect para recopilar los elementos en una colección distinta.

```java
// Incorrecto: Modificación de una colección mientras se recorre con un Stream
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().forEach(number -> numbers.remove(number));

// Correcto: Uso de collect para recopilar los elementos en una colección distinta
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
```

4. No use operaciones intermedias innecesarias: Cada operación intermedia que se aplica a un Stream produce un nuevo Stream. Por lo tanto, es importante evitar operaciones intermedias innecesarias para no desperdiciar recursos.

```java
// Incorrecto: Operaciones intermedias innecesarias
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().filter(number -> number % 2 == 0).filter(number -> number > 3).forEach(System.out::println);

// Correcto: Uso de una sola operación intermedia
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().filter(number -> number % 2 == 0 && number > 3).forEach(System.out::println);
```

5. No use operaciones terminales innecesarias: Cada operación terminal que se aplica a un Stream consume el Stream. Por lo tanto, es importante evitar operaciones terminales innecesarias para no desperdiciar recursos.

```java
// Incorrecto: Operaciones terminales innecesarias
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

// Correcto: Uso de una sola operación terminal
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
``` 

## Resumen

El API de Streams de Java 8 es una herramienta muy poderosa para trabajar con colecciones de datos. Los Streams permiten trabajar con colecciones de datos de una manera declarativa, lo que hace que el código sea más conciso y fácil de entender. Los Streams también son muy eficientes, ya que se pueden ejecutar en paralelo para aprovechar al máximo los recursos de la CPU. Sin embargo, es importante tener en cuenta las consideraciones y buenas prácticas para el uso de Streams, ya que de lo contrario puede provocar errores impredecibles.

## Material de apoyo

* [Java 8 Streams Tutorial by Baeldung](https://www.baeldung.com/java-8-streams)
* [Java 8 Streams Tutorial by Java Code Geeks](https://www.javacodegeeks.com/2015/08/java-8-streams-tutorial.html)
* [Java 8 Streams Tutorial by Journaldev](https://www.journaldev.com/2774/java-8-stream)
* [Java 8 Streams Tutorial by Tutorials Point](https://www.tutorialspoint.com/java8/java8_streams.htm)
* [Java 8 Streams Tutorial by Javatpoint](https://www.javatpoint.com/java-8-stream)

[Inicio](/README.md)