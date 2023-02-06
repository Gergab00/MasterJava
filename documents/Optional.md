# API Optional

## ¿Qué es Optional?

**"Optional"** es una clase introducida en Java 8 que permite manejar de manera más sencilla los casos en los que un valor puede ser *nulo*. La idea detrás de Optional es proporcionar una forma segura y legible de trabajar con valores que pueden ser nulos, evitando así las excepciones *"NullPointerException"* que a menudo ocurren cuando se intenta acceder a un objeto nulo.

### Introducción a la clase Optional

La clase Optional es un contenedor que puede almacenar un objeto de cualquier tipo o, en su lugar, indicar que no hay ningún objeto presente. Un Optional vacío se puede pensar como un contenedor vacío que representa la ausencia de un valor, mientras que un valor nulo se puede pensar como una referencia a un objeto que no existe

### ¿Por qué se introdujo Optional en Java 8?

La clase Optional se introdujo en Java 8 para mejorar la seguridad y la legibilidad del código al trabajar con valores que pueden ser nulos. Al usar Optional, los desarrolladores pueden indicar explícitamente cuándo un valor puede ser nulo y cómo se debe manejar ese caso, lo que a su vez reduce la probabilidad de errores y mejora la calidad del código

### ¿Cuál es la diferencia entre un valor nulo y un Optional vacío?

La diferencia entre un valor nulo y un Optional vacío es que un valor nulo es una referencia a un objeto que no existe, mientras que un Optional vacío es un contenedor que representa la ausencia de un valor. Al trabajar con un valor nulo, es fácil olvidar que un objeto puede ser nulo y producir una excepción *"NullPointerException"* cuando se intenta acceder a un método o atributo de un objeto nulo. Sin embargo, al trabajar con un Optional vacío, es más fácil detectar y manejar casos en los que un valor puede ser nulo, lo que a su vez reduce la probabilidad de errores.

## Creación de objetos Optional

Para crear objetos de la clase Optional, Java 8 ofrece varios métodos que nos permiten especificar el valor que queremos almacenar en el objeto. Estos métodos incluyen:

1. *Método __`of()`__*: Este método toma un valor no nulo y crea un objeto **Optional** que envuelve ese valor. Si se proporciona un valor nulo, se lanzará una excepción **NullPointerException**. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    ```

2. *Método __`ofNullable()`__*: Este método toma un valor que puede ser nulo o no nulo y crea un objeto **Optional** que envuelve ese valor. Si se proporciona un valor nulo, se creará un objeto **Optional** vacío. Por ejemplo:

    ```java
    Integer value = null;
    Optional<Integer> op = Optional.ofNullable(value);
    ```

3. *Método __`empty()`__*: Este método crea un objeto **Optional** vacío. Por ejemplo:

    ```java
    Optional<String> optional = Optional.empty();
    ```

4. *Uso de la sintaxis de creación por defecto*: La clase **Optional** también proporciona una sintaxis de creación por defecto que nos permite crear objetos **Optional** de manera más sencilla. Por ejemplo:

    ```java
    Optional<String> optional = "Hello";
    ```
Estos son los métodos que se usan para crear objetos **`Optional`**. En general, se recomienda usar **`ofNullable()`** para crear objetos que pueden tener un valor nulo, ya que esto evitará posibles excepciones de **`NullPointerException`**.

## Métodos de manipulación de Optional

Esta clase proporciona métodos que permiten manipular los valores presentes y ausentes de una forma más sencilla y segura que el uso de valores nulos. Estos métodos incluyen:

1. *Método __`isPresent()`__*: Este método devuelve un valor booleano que indica si el objeto **Optional** contiene un valor o no. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    boolean isPresent = optional.isPresent();
    ```

    > **Nota**: Este método es útil para verificar si un objeto **Optional** contiene un valor antes de llamar a un método que puede producir una excepción **NullPointerException**.

2. *Método __`ifPresent()`__*: Este método toma un objeto **[Consumer](/documents/InterfacesFuncionales.md#consumer)** como argumento y ejecuta el método **[accept()](/documents/InterfacesFuncionales.md#accept)** del objeto **[Consumer](/documents/InterfacesFuncionales.md#consumer)**  si el objeto **Optional** contiene un valor. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    optional.ifPresent(s -> System.out.println(s));
    ```

    > **Nota**: Este método es útil para ejecutar un bloque de código si un objeto **Optional** contiene un valor.

3. *Método __`orElse()`__*: Este método toma un valor como argumento y devuelve el valor almacenado en el objeto **Optional** si el objeto **Optional** contiene un valor. Si el objeto **Optional** está vacío, se devolverá el valor proporcionado como argumento. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    String value = optional.orElse("World");
    ```

    > **Nota**: Este método es útil para devolver un valor predeterminado si un objeto **Optional** está vacío.

4. *Método __`orElseGet()`__*: Este método toma un objeto **[Supplier](/documents/InterfacesFuncionales.md#supplier)** como argumento y devuelve el valor almacenado en el objeto **Optional** si el objeto **Optional** contiene un valor. Si el objeto **Optional** está vacío, se devolverá el valor devuelto por el método **[get()](/documents/InterfacesFuncionales.md#get)** del objeto **[Supplier](/documents/InterfacesFuncionales.md#supplier)**. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    String value = optional.orElseGet(() -> "World");
    ```

    > **Nota**: Este método es útil para devolver un valor predeterminado si un objeto **Optional** está vacío.

5. *Método __`orElseThrow()`__*: Este método toma un objeto **[Supplier](/documents/InterfacesFuncionales.md#supplier)** como argumento y devuelve el valor almacenado en el objeto **Optional** si el objeto **Optional** contiene un valor. Si el objeto **Optional** está vacío, se lanzará una excepción devuelta por el método **[get()](/documents/InterfacesFuncionales.md#get)** del objeto **[Supplier](/documents/InterfacesFuncionales.md#supplier)**. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    String value = optional.orElseThrow(() -> new RuntimeException("Value not present"));
    ```
    > **Nota**: Este método es útil para lanzar una excepción si un objeto **Optional** está vacío.

## Métodos de transformación de Optional

Esta clase proporciona métodos que permiten transformar los valores presentes y ausentes de una forma más sencilla y segura que el uso de valores nulos. Estos métodos incluyen:

1. *Método __`map()`__*: Este método toma un objeto **[Function](/documents/InterfacesFuncionales.md#function)** como argumento y devuelve un objeto **Optional** que contiene el valor devuelto por el método **[apply()](/documents/InterfacesFuncionales.md#apply)** del objeto **[Function](/documents/InterfacesFuncionales.md#function)** si el objeto **Optional** contiene un valor. Si el objeto **Optional** está vacío, se devolverá un objeto **Optional** vacío. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    Optional<String> upperCase = optional.map(s -> s.toUpperCase());
    System.out.println(upperCase.get()); // Output: HELLO
    ```

    > **Nota**: Este método es útil para transformar el valor almacenado en un objeto **Optional**.

2. *Método __`flatMap()`__*: Este método toma un objeto **[Function](/documents/InterfacesFuncionales.md#function)** como argumento y devuelve un objeto **Optional** que contiene el valor devuelto por el método **[apply()](/documents/InterfacesFuncionales.md#apply)** del objeto **[Function](/documents/InterfacesFuncionales.md#function)** si el objeto **Optional** contiene un valor. Si el objeto **Optional** está vacío, se devolverá un objeto **Optional** vacío. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    Optional<String> upperCase = optional.flatMap(s -> Optional.of(s.toUpperCase()));
    System.out.println(upperCase.get()); // Output: HELLO
    ```

    > **Nota**: Este método es útil para transformar el valor almacenado en un objeto **Optional**.

3. *Método __`filter()`__*: Este método toma un objeto **[Predicate](/documents/InterfacesFuncionales.md#predicate)** como argumento y devuelve un objeto **Optional** que contiene el valor almacenado en el objeto **Optional** si el objeto **Optional** contiene un valor y el valor cumple con la condición especificada por el objeto **[Predicate](/documents/InterfacesFuncionales.md#predicate)**. Si el objeto **Optional** está vacío o el valor no cumple con la condición especificada por el objeto **[Predicate](/documents/InterfacesFuncionales.md#predicate)**, se devolverá un objeto **Optional** vacío. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    Optional<String> filtered = optional.filter(s -> s.length() > 5);
    System.out.println(filtered.isPresent()); // Output: false
    ```

    > **Nota**: Este método es útil para filtrar el valor almacenado en un objeto **Optional**.

## Uso de Optional con streams

Esta clase proporciona métodos que permiten usar objetos **Optional** con los métodos de la [API de Streams](/documents/Streams.md).

### Uso de Optional en combinación con map() y flatMap()

El método **`map()`** de Optional permite transformar un Optional en otro Optional, de manera similar a cómo se utiliza en streams. La diferencia es que, en este caso, se le aplica una función a un objeto Optional en lugar de a un stream.

El método **`flatMap()`** funciona de manera similar a **`map()`**, pero permite transformar un Optional en otro Optional de forma más compleja. La función que se aplica a través de **`flatMap()`** debe devolver un Optional.

Aquí hay un ejemplo que ilustra el uso de **`map()`** y **`flatMap()`** con Optional:

```java
public class OptionalExample {
  public static void main(String[] args) {
    Optional<String> optString = Optional.of("This is a string.");
    Optional<Integer> optLength = optString.map(String::length);
    System.out.println(optLength.orElse(-1));
 
    Optional<String> optString2 = Optional.of("Another string");
    Optional<Integer> optLength2 = optString2.flatMap(s -> Optional.of(s.length()));
    System.out.println(optLength2.orElse(-1));
  }
}
```

En este ejemplo, utilizamos el método **`map()`** para obtener el tamaño de una cadena de texto contenida en un Optional. Luego, utilizamos el método **`flatMap()`** para realizar una transformación más compleja que también devuelve un Optional con el tamaño de la cadena de texto. 

La función **`orElse()`** se utiliza para obtener el valor almacenado en el Optional. Si el Optional está vacío, se devuelve el valor _-1_.

### Uso de Optional con reduce() y collect()

El método **`reduce()`** de streams permite combinar todos los elementos de un stream en un único objeto. Si el stream está vacío, se puede especificar un valor por defecto que se devolverá en lugar del objeto combinado.

El método **`collect()`** de streams permite agrupar los elementos de un stream en una colección o en un objeto que implementa la interfaz **[Collector](/documents/InterfacesFuncionales.md#collector)**.

Aquí hay un ejemplo que ilustra el uso de **`reduce()`** y **`collect()`** con Optional:

```java
public class OptionalExample {
  public static void main(String[] args) {
    List<Optional<String>> optStrings = Arrays.asList(
      Optional.of("This is a string."),
      Optional.of("Another string"),
      Optional.empty()
    );
 
    Optional<String> reduced = optStrings.stream()
      .reduce((s1, s2) -> s1.isPresent() ?
          Optional.of(s1.get() + " " + s2.orElse("")) : s2);
 
    System.out.println(reduced.orElse("No strings present."));
 
    List<String> strings = optStrings.stream()
      .filter(Optional::isPresent)
      .map(Optional::get)
      .collect(Collectors.toList());
    
    System.out.println(strings);// Prints: [This is a string., Another string]
    }
}
```

En este ejemplo, utilizamos el método **`reduce()`** para combinar todos los elementos de un stream en un único objeto Optional. Si el stream está vacío, se devuelve un Optional vacío. Luego, utilizamos el método **`orElse()`** para obtener el valor almacenado en el Optional. Si el Optional está vacío, se devuelve la cadena de texto _"No strings present."_.

## Consideraciones y buenas prácticas de programación para el uso de Optional

1. Evite retornar Optional vacío: Siempre es mejor retornar un valor no nulo en lugar de un Optional vacío. Si un método no puede encontrar un valor, es mejor retornar un valor por defecto que un Optional vacío. Por ejemplo:

2. No anide Optional: Anidar varios Optional no es una buena práctica. Es mejor manipularlos de forma secuencial mediante una secuencia de map() y flatMap().

3. Evite crear Optional vacío: En lugar de crear un Optional vacío, es mejor retornar un valor por defecto o lanzar una excepción.

4. No confunda Optional con nulos: Optional no es un reemplazo para los valores nulos, sino una forma de manejar los valores nulos de forma más segura y eficiente.

## Resumen

En este documento se ha visto cómo utilizar la clase **Optional** para evitar excepciones **NullPointerException**. Esta clase proporciona métodos que permiten crear objetos **Optional** a partir de valores nulos, comprobar si un objeto Optional está vacío o contiene un valor, obtener el valor almacenado en un objeto Optional, filtrar el valor almacenado en un objeto Optional, transformar un objeto Optional en otro objeto Optional, combinar varios objetos Optional en un único objeto Optional, y utilizar objetos Optional con streams.

## Material de apoyo

* [Java 8 Optional Tutorial by Baeldung](https://www.baeldung.com/java-optional)
* [Java 8 Optional Tutorial by Journaldev](https://www.journaldev.com/2324/java-8-optional-class)
* [Java 8 Optional Tutorial by Callicoder](https://www.callicoder.com/java-8-optional-class-tutorial/)
* [Java 8 Optional Tutorial by Mkyong](https://www.mkyong.com/java8/java-8-optional-in-depth/)
* [Java 8 Optional Tutorial by Java Code Geeks](https://www.javacodegeeks.com/2018/06/java-8-optional-tutorial.html)