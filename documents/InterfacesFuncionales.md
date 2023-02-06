## Interfaces Funcionales {#interfaces-funcionales}

Java 8 introdujo muchas nuevas características, como las Interfaces Funcionales y los Streams. Ambas características son una forma de hacer el código más conciso y fácil de entender.

Una Interfaz Funcional es una interfaz con un solo método abstracto. En Java 8, se pueden utilizar como un tipo de datos y se les puede asignar una implementación con una expresión lambda.

El paquete **_java.util.function_** en Java 8 es un paquete que proporciona un conjunto de interfaces funcionales que se utilizan para representar funciones en una forma que se puede utilizar con las nuevas características de Java 8, como las expresiones lambda y los streams.

Las interfaces funcionales son similares a los tipos de datos que se usan para representar funciones en otros lenguajes de programación funcionales. Estas interfaces están diseñadas para ser utilizadas con expresiones lambda o referencias de métodos para proporcionar una manera de pasar funciones como argumentos a métodos o devolver funciones como resultados de métodos.

El paquete **_java.util.function_** incluye varias interfaces funcionales para diferentes tipos de funciones, tales como:

- **Function:** una interfaz funcional que representa una función que toma un argumento y devuelve un resultado.

- **<span id="consumer">Consumer:</span>** una interfaz funcional que representa una función que toma un argumento y no devuelve un resultado.

- **Predicate:** una interfaz funcional que representa una función que toma un argumento y devuelve un valor booleano.

- **<span id="supplier">Supplier:</span>** una interfaz funcional que representa una función que no toma argumentos y devuelve un resultado.

- **Operator:** una interfaz funcional que representa una función que toma un argumento y devuelve un resultado del mismo tipo.

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

* **`accept()`**: La función **`accept()`** se utiliza para realizar una operación sobre un objeto. Es una función que se define en la interfaz **`Consumer<T>`** y se usa para consumir un objeto de tipo **`T`**. Por ejemplo, podríamos usar un Consumer para imprimir el valor de un String.

* **`test()`**: La función **`test()`** se utiliza para verificar si un objeto cumple con ciertas condiciones. Es una función que se define en la interfaz **`Predicate<T>`** y se usa para determinar si un objeto de tipo **`T`** cumple con una condición determinada. Por ejemplo, podríamos usar un Predicate para determinar si un String es un número.

* **`get()`**: La función **`get()`** se utiliza para obtener el valor de un objeto. Es una función que se define en la interfaz **`Supplier<T>`** y se usa para proveer un objeto de tipo **`T`**. Por ejemplo, podríamos usar un Supplier para proveer una instancia de una clase.

Además de las funciones mencionadas anteriormente, hay otras funciones en el paquete **_java.util.function_**, como **`BiFunction<T, U, R>`**, **`BinaryOperator<T>`**, **`UnaryOperator<T>`**, etc. Estas funciones son versiones más específicas de las funciones mencionadas anteriormente y se usan para realizar operaciones específicas en objetos funcionales.