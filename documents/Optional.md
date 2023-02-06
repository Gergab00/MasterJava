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

2. *Método __`ifPresent()`__*: Este método toma un objeto **[Consumer](/documents/InterfacesFuncionales.md#consumer)** como argumento y ejecuta el método **accept()** del objeto **[Consumer](/documents/InterfacesFuncionales.md#consumer)**  si el objeto **Optional** contiene un valor. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    optional.ifPresent(s -> System.out.println(s));
    ```

3. *Método __`orElse()`__*: Este método toma un valor como argumento y devuelve el valor almacenado en el objeto **Optional** si el objeto **Optional** contiene un valor. Si el objeto **Optional** está vacío, se devolverá el valor proporcionado como argumento. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    String value = optional.orElse("World");
    ```

3. *Método __`orElseGet()`__*: Este método toma un objeto **Supplier** como argumento y devuelve el valor almacenado en el objeto **Optional** si el objeto **Optional** contiene un valor. Si el objeto **Optional** está vacío, se devolverá el valor devuelto por el método **get()** del objeto **Supplier**. Por ejemplo:

    ```java
    Optional<String> optional = Optional.of("Hello");
    String value = optional.orElseGet(() -> "World");
    ```
### Método orElseThrow()

## Métodos de transformación de Optional

### Método map()
### Método flatMap()
### Método filter()

## Uso de Optional con streams

### Uso de Optional en combinación con map() y flatMap()
### Uso de Optional con reduce() y collect()

## Consideraciones y buenas prácticas para el uso de Optional

### Evite el anidamiento de Optionals
### No abuse de Optional para cubrir problemas de diseño
### Evite el uso de Optional con tipos primitivos
### Considere usar Optional sólo cuando sea necesario