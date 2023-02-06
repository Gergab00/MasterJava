## Interfaces Funcionales {#interfaces-funcionales}

Java 8 introdujo muchas nuevas características, como las Interfaces Funcionales y los Streams. Ambas características son una forma de hacer el código más conciso y fácil de entender.

Una Interfaz Funcional es una interfaz con un solo método abstracto. En Java 8, se pueden utilizar como un tipo de datos y se les puede asignar una implementación con una expresión lambda.

El paquete **_java.util.function_** en Java 8 es un paquete que proporciona un conjunto de interfaces funcionales que se utilizan para representar funciones en una forma que se puede utilizar con las nuevas características de Java 8, como las expresiones lambda y los streams.

Las interfaces funcionales son similares a los tipos de datos que se usan para representar funciones en otros lenguajes de programación funcionales. Estas interfaces están diseñadas para ser utilizadas con expresiones lambda o referencias de métodos para proporcionar una manera de pasar funciones como argumentos a métodos o devolver funciones como resultados de métodos.

El paquete **_java.util.function_** incluye varias interfaces funcionales para diferentes tipos de funciones, tales como:

- **<span id="function">Function:</span>** una interfaz funcional que representa una función que toma un argumento y devuelve un resultado.

- **<span id="consumer">Consumer:</span>** una interfaz funcional que representa una función que toma un argumento y no devuelve un resultado.

- **<span id="predicate">Predicate:** una interfaz funcional que representa una función que toma un argumento y devuelve un valor booleano.

- **<span id="supplier">Supplier:</span>** una interfaz funcional que representa una función que no toma argumentos y devuelve un resultado.

- **Operator:** una interfaz funcional que representa una función que toma un argumento y devuelve un resultado del mismo tipo.

- **<span id="collector">Collector:</span>** una interfaz funcional que representa una función que toma un argumento y devuelve un resultado del mismo tipo.

Estas interfaces funcionales son esenciales para trabajar con expresiones lambda y streams en Java 8 y proporcionan una manera poderosa de escribir código más conciso y legible.

Aquí hay un ejemplo de código que muestra cómo utilizar las interfaces de **_java.util.function_**:

```java
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Operator;

public class FunctionExample {
    public static void main(String[] args) {
        // Function<T, R> example
        // representa una función que acepta un argumento de tipo T y devuelve un resultado de tipo R
        Function<String, Integer> stringToLength = (s) -> s.length();
        System.out.println("Length of 'Hello World': " + stringToLength.apply("Hello World"));

        // Consumer<T> example
        // representa una función que acepta un argumento de tipo T y no devuelve ningún resultado
        Consumer<String> printString = (s) -> System.out.println("Consumed: " + s);
        printString.accept("Hello World");

        // Predicate<T> example
        // representa una función que acepta un argumento de tipo T y devuelve un valor booleano
        Predicate<String> isEmptyString = (s) -> s.isEmpty();
        System.out.println("Is the string empty? " + isEmptyString.test(""));

        // Supplier<T> example
        // representa una función que no acepta argumentos y devuelve un resultado de tipo T
        Supplier<String> getHelloWorld = () -> "Hello World";
        System.out.println("Supplier: " + getHelloWorld.get());

        // Operator<T> example
        // representa una función que toma un argumento de tipo T y devuelve un resultado de tipo T
        Operator<String> toUpperCase = (s) -> s.toUpperCase();
        System.out.println("Operator: " + toUpperCase.apply("Hello World"));

    }
}

```

El paquete **_java.util.function_** es un paquete que contiene una serie de funciones funcionales en Java 8. Hay varias funciones incluidas en este paquete que se pueden usar para realizar operaciones en los objetos funcionales. Aquí hay una descripción de algunas de las funciones más comunes:


* **`apply():`** La función **`apply()`** se utiliza para aplicar una transformación a un objeto. Es una función que se define en la interfaz **`Function<T, R>`** y se usa para transformar un objeto de tipo **`T`** en un objeto de tipo **`R`**. Por ejemplo, podríamos usar una función Function para transformar un String en un Integer.

* **<span id="accept">`accept()`</span>**: La función **`accept()`** se utiliza para realizar una operación sobre un objeto. Es una función que se define en la interfaz **`Consumer<T>`** y se usa para consumir un objeto de tipo **`T`**. Por ejemplo, podríamos usar un Consumer para imprimir el valor de un String.

* **`test()`**: La función **`test()`** se utiliza para verificar si un objeto cumple con ciertas condiciones. Es una función que se define en la interfaz **`Predicate<T>`** y se usa para determinar si un objeto de tipo **`T`** cumple con una condición determinada. Por ejemplo, podríamos usar un Predicate para determinar si un String es un número.

* **<span id="get">`get()`</span>**: La función **`get()`** se utiliza para obtener el valor de un objeto. Es una función que se define en la interfaz **`Supplier<T>`** y se usa para proveer un objeto de tipo **`T`**. Por ejemplo, podríamos usar un Supplier para proveer una instancia de una clase.

Además de las funciones mencionadas anteriormente, hay otras funciones en el paquete **_java.util.function_**, como **`BiFunction<T, U, R>`**, **`BinaryOperator<T>`**, **`UnaryOperator<T>`**, etc. Estas funciones son versiones más específicas de las funciones mencionadas anteriormente y se usan para realizar operaciones específicas en objetos funcionales.

## Consideraciones y buenas prácticas de programación para las interfaces funcionales

Aquí hay algunas consideraciones y buenas prácticas que debes tener en cuenta al trabajar con ellas:

1. Utiliza interfaces funcionales para representar una única operación: Las interfaces funcionales deben ser utilizadas para representar una única operación. Si una interfaz funcional representa más de una operación, es mejor dividirla en múltiples interfaces funcionales.

2. Usa la interfaz funcional apropiada: Java viene con varias interfaces funcionales, como Function, Consumer y Supplier. Es importante elegir la interfaz funcional adecuada para el trabajo.

3. Evita el uso de clases anónimas: En Java 8 y superiores, las clases anónimas se utilizan a menudo para implementar interfaces funcionales. Sin embargo, es mejor evitar su uso y optar por expresiones lambda en su lugar, ya que son más concisas y legibles.

4. Utiliza el método default en la interfaz funcional: La implementación del método default en una interfaz funcional permite agregar un comportamiento por defecto a una interfaz sin tener que crear una nueva clase.

5. Evita el uso de estados compartidos: Cuando se utilizan interfaces funcionales en combinación con streams, es fácil compartir estados accidentalmente. Por lo tanto, es importante tener cuidado y evitar compartir estados.

6. Utiliza una interfaz funcional para representar el tipo de una expresión lambda: Es posible que desees utilizar una expresión lambda para representar una operación en una clase. En este caso, debes utilizar una interfaz funcional para representar el tipo de la expresión lambda.

En general, las interfaces funcionales son una herramienta poderosa para la programación en Java 8 y superiores. Si sigues estas consideraciones y buenas prácticas, te ayudarán a escribir código más legible y eficiente.

## Resumen

Las interfaces funcionales son esenciales para trabajar con expresiones lambda y streams en Java 8 y proporcionan una manera poderosa de escribir código más conciso y legible. También hemos aprendido sobre algunas de las funciones más comunes en el paquete **_java.util.function_**.

## Material de apoyo

* [Interfaces Funcionales en Java 8](https://www.baeldung.com/java-8-functional-interfaces)

[Inicio](/README.md)