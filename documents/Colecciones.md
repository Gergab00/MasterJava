# Colecciones

Las colecciones en Java son estructuras de datos que permiten almacenar y organizar elementos. Las colecciones más comunes en Java son List, Set y Map. Otras colecciones menos comunes son Queue y Deque. Todas estas colecciones se pueden encontrar en el paquete _java.util_ y están implementando la interface Collection.

## List

Una List es una colección que permite almacenar elementos en un orden determinado y acceder a ellos por su índice. Por ejemplo, si deseas crear una lista de números enteros, puedes usar la siguiente sintaxis:

```java
List<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
```

En este ejemplo, se crea una lista de números enteros utilizando la clase ArrayList. La clase ArrayList es una implementación de List que permite acceder a los elementos en tiempo constante.

En Java, la interface List es una de las interfaces más comunes de las colecciones y es implementada por varias clases, como ArrayList y LinkedList.

**ArrayList** es una implementación de List que utiliza un array para almacenar los elementos. Es eficiente para acceder a cualquier elemento mediante su índice, pero no tan eficiente para insertar o eliminar elementos en cualquier lugar que no sea el final de la lista. Por ejemplo:

```java
// Crear una List
List<String> names = new ArrayList<>();

// Añadir elementos a la List
names.add("John");
names.add("Jane");
names.add("Jim");

// Acceder a un elemento en la List
System.out.println("El segundo nombre es: " + names.get(1)); // Prints "El segundo nombre es: Jane"
```

**LinkedList** es otra implementación de List que utiliza una lista doblemente enlazada para almacenar los elementos. Es más eficiente para insertar o eliminar elementos en cualquier lugar que no sea el final de la lista, pero menos eficiente para acceder a cualquier elemento mediante su índice. Por ejemplo:

```java
// Crear una List
List<String> names = new LinkedList<>();

// Añadir elementos a la List
names.add("John");
names.add("Jane");
names.add("Jim");

// Acceder a un elemento en la List
System.out.println("El segundo nombre es: " + names.get(1)); // Prints "El segundo nombre es: Jane"
```
La principal diferencia entre **ArrayList** y **LinkedList** es cómo funcionan internamente. **ArrayList** es una colección basada en arreglos, lo que significa que los elementos se almacenan en un arreglo y se accede a ellos por índice. **LinkedList**, por otro lado, es una lista enlazada, lo que significa que los elementos se almacenan en nodos que apuntan el uno al otro.

Cada uno de estos tipos de listas tiene sus propias ventajas y desventajas, y es importante elegir el tipo adecuado en función de las necesidades específicas de su aplicación.

## Set

Un Set es una colección que permite almacenar elementos sin repetidos. Por ejemplo, si deseas crear un conjunto de números enteros, puedes usar la siguiente sintaxis:

```java
Set<Integer> numbers = new HashSet<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(3);
```

En este ejemplo, se crea un conjunto de números enteros utilizando la clase HashSet. La clase HashSet es una implementación de Set que permite acceder a los elementos en tiempo constante. La clase HashSet no permite elementos duplicados, por lo que el número 3 solo se añadirá una vez. Si deseas añadir un elemento duplicado, el método **`add()`** devolverá false.

En Java, la interface Set es una de las interfaces más comunes de las colecciones y es implementada por varias clases, como HashSet y TreeSet.

**HashSet** es una implementación de Set que utiliza un hash table para almacenar los elementos. Es eficiente para añadir, eliminar y buscar elementos. Por ejemplo:

```java
// Crear un Set
Set<String> names = new HashSet<>();

// Añadir elementos al Set
names.add("John");
names.add("Jane");
names.add("Jim");

// Buscar un elemento en el Set
System.out.println("¿Contiene Jim? " + names.contains("Jim")); // Prints "¿Contiene Jim? true"
```
**TreeSet** es otra implementación de Set que utiliza un árbol binario para almacenar los elementos. Es más eficiente para añadir y eliminar elementos, pero menos eficiente para buscar elementos. Por ejemplo:

```java
// Crear un Set
Set<String> names = new TreeSet<>();

// Añadir elementos al Set
names.add("John");
names.add("Jane");
names.add("Jim");

// Buscar un elemento en el Set
System.out.println("¿Contiene Jim? " + names.contains("Jim")); // Prints "¿Contiene Jim? true"
```
La principal diferencia entre **HashSet** y **TreeSet** es cómo funcionan internamente. **HashSet** es una colección basada en hash table, lo que significa que los elementos se almacenan en una tabla hash y se accede a ellos mediante su hash. **TreeSet**, por otro lado, es una colección basada en árbol, lo que significa que los elementos se almacenan en un árbol binario y se accede a ellos mediante su valor.

Cada uno de estos tipos de conjuntos tiene sus propias ventajas y desventajas, y es importante elegir el tipo adecuado en función de las necesidades específicas de su aplicación.

## Map

Un Map es una colección que permite almacenar pares de valores clave-valor. Por ejemplo, si deseas crear un mapa de nombres y edades, puedes usar la siguiente sintaxis:

```java
Map<String, Integer> ages = new HashMap<>();
ages.put("John", 25);
ages.put("Jane", 23);
ages.put("Jim", 30);
ages.put("Jim", 31);
```

En este ejemplo, se crea un mapa de nombres y edades utilizando la clase HashMap. La clase HashMap es una implementación de Map que permite acceder a los elementos en tiempo constante. La clase HashMap no permite claves duplicadas, por lo que la clave "Jim" solo se añadirá una vez. Si deseas añadir una clave duplicada, el método **`put()`** devolverá el valor anterior.

En Java, la interface Map es una de las interfaces más comunes de las colecciones y es implementada por varias clases, como HashMap y TreeMap.

**HashMap** es una implementación de Map que utiliza un hash table para almacenar los elementos. Es eficiente para añadir, eliminar y buscar elementos. Por ejemplo:

```java
// Crear un Map
Map<String, Integer> ages = new HashMap<>();

// Añadir elementos al Map
ages.put("John", 25);
ages.put("Jane", 23);
ages.put("Jim", 30);

// Buscar un elemento en el Map
System.out.println("La edad de Jim es: " + ages.get("Jim")); // Prints "La edad de Jim es: 30"
```

**TreeMap** es otra implementación de Map que utiliza un árbol binario para almacenar los elementos. Es más eficiente para añadir y eliminar elementos, pero menos eficiente para buscar elementos. Por ejemplo:

```java
// Crear un Map
Map<String, Integer> ages = new TreeMap<>();

// Añadir elementos al Map
ages.put("John", 25);
ages.put("Jane", 23);
ages.put("Jim", 30);

// Buscar un elemento en el Map
System.out.println("La edad de Jim es: " + ages.get("Jim")); // Prints "La edad de Jim es: 30"
```

La principal diferencia entre **HashMap** y **TreeMap** es cómo funcionan internamente. **HashMap** es una colección basada en hash table, lo que significa que los elementos se almacenan en una tabla hash y se accede a ellos mediante su hash. **TreeMap**, por otro lado, es una colección basada en árbol, lo que significa que los elementos se almacenan en un árbol binario y se accede a ellos mediante su valor.

Cada uno de estos tipos de mapas tiene sus propias ventajas y desventajas, y es importante elegir el tipo adecuado en función de las necesidades específicas de su aplicación.

## Iterar sobre una colección

Una de las cosas más importantes que puedes hacer con una colección es iterar sobre ella. En Java, puedes iterar sobre una colección utilizando un bucle for-each. Por ejemplo:

```java
List<String> names = new ArrayList<>();
names.add("John");
names.add("Jane");
names.add("Jim");

for (String name : names) {
    System.out.println(name);
}
```

En este ejemplo, se crea una lista de nombres utilizando la clase ArrayList. Luego, se itera sobre la lista utilizando un bucle for-each. El bucle for-each itera sobre cada elemento de la lista y lo asigna a la variable **`name`**. En cada iteración, la variable **`name`** contiene el siguiente elemento de la lista.

## Filtrar una colección

Una de las cosas más comunes que puedes hacer con una colección es filtrarla. En Java, puedes filtrar una colección utilizando un bucle for-each y una expresión lambda. Por ejemplo:

```java
List<String> names = new ArrayList<>();
names.add("John");
names.add("Jane");
names.add("Jim");

List<String> filteredNames = new ArrayList<>();
for (String name : names) {
    if (name.startsWith("J")) {
        filteredNames.add(name);
    }
}

System.out.println(filteredNames); // Prints "[John, Jane, Jim]"
```
> **Nota:** En Java 8, puedes usar la clase **`Stream`** para filtrar una colección. Por ejemplo:

```java
List<String> names = new ArrayList<>();
names.add("John");
names.add("Jane");
names.add("Jim");

List<String> filteredNames = names.stream()
    .filter(name -> name.startsWith("J"))
    .collect(Collectors.toList());

System.out.println(filteredNames); // Prints "[John, Jane, Jim]"
```

En este ejemplo, se crea una lista de nombres utilizando la clase ArrayList. Luego, se crea una nueva lista vacía para almacenar los nombres filtrados. Luego, se itera sobre la lista utilizando un bucle for-each. En cada iteración, la variable **`name`** contiene el siguiente elemento de la lista. Si el nombre comienza con la letra "J", se añade a la lista de nombres filtrados.

## Ordenar una colección

Una de las cosas más comunes que puedes hacer con una colección es ordenarla. En Java, puedes ordenar una colección utilizando el método **`sort()`** de la clase Collections. Por ejemplo:

```java
List<String> names = new ArrayList<>();
names.add("John");
names.add("Jane");
names.add("Jim");

Collections.sort(names);

System.out.println(names); // Prints "[Jane, Jim, John]"
```

En este ejemplo, se crea una lista de nombres utilizando la clase ArrayList. Luego, se ordena la lista utilizando el método **`sort()`** de la clase Collections. El método **`sort()`** ordena la lista en orden alfabético.

## Resumen

La interfaz **`Collection`** representa una colección de objetos. Las clases que implementan la interfaz **`Collection`** incluyen **`ArrayList`**, **`LinkedList`**, **`HashSet`**, **`TreeSet`**, **`HashMap`** y **`TreeMap`**. Puedes iterar sobre una colección utilizando un bucle for-each. Puedes filtrar una colección utilizando un bucle for-each y una expresión lambda. Puedes ordenar una colección utilizando el método **`sort()`** de la clase Collections.

> **Nota:** Es una buena práctica de programación utilizar interfaces en lugar de clases concretas cuando se trabaja con colecciones. El motivo es que las interfaces permiten que el código sea más flexible y reutilizable. Por ejemplo, si tu código utiliza la interfaz **`List`** en lugar de la clase **`ArrayList`**, puedes cambiar la implementación de la lista sin tener que cambiar el código que utiliza la lista.

## Ejercicios

1. Crea una lista de nombres utilizando la clase **`ArrayList`**. Luego, itera sobre la lista utilizando un bucle for-each y muestra cada nombre en la consola.

2. Crea una lista de nombres utilizando la clase **`ArrayList`**. Luego, filtra la lista para obtener solo los nombres que comienzan con la letra "J". Luego, muestra la lista filtrada en la consola.

3. Crea una lista de nombres utilizando la clase **`ArrayList`**. Luego, ordena la lista utilizando el método **`sort()`** de la clase **`Collections`**. Luego, muestra la lista ordenada en la consola.

## Consideraciones y buenas prácticas de programación usando colecciones

Hay algunas consideraciones y buenas prácticas que debes tener en cuenta al trabajar con colecciones en Java:

1. Evita el uso de Arrays cuando sea posible: Aunque los arrays son una estructura de datos eficiente, las colecciones son más flexibles y fáciles de usar. Por lo tanto, es mejor utilizar colecciones en lugar de arrays siempre que sea posible.

2. Usa la interfaz apropiada para cada tarea: Java proporciona diferentes interfaces de colección para diferentes tareas, como List, Set y Map. Es importante elegir la interfaz correcta para cada tarea para aprovechar al máximo las características de la interfaz.

3. Elegir la implementación adecuada: Hay diferentes implementaciones disponibles para cada interfaz de colección, como ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, etc. Es importante elegir la implementación adecuada para cada tarea, teniendo en cuenta las características de rendimiento y funcionalidad de cada implementación.

4. Evita el uso de código repetitivo: Es importante evitar escribir código repetitivo al trabajar con colecciones. Por ejemplo, en lugar de escribir código para recorrer una colección y realizar una tarea para cada elemento, se puede utilizar una operación de alto nivel, como forEach(), que hace el trabajo por ti.

5. Evita la manipulación directa de la colección subyacente: Es importante evitar la manipulación directa de la colección subyacente al trabajar con colecciones, ya que puede provocar errores en tiempo de ejecución. En su lugar, es mejor utilizar las operaciones de la interfaz de colección para manipular la colección de manera segura.

Estas son algunas de las buenas prácticas que debes tener en cuenta al trabajar con colecciones en Java. Espero que te resulten útiles.

## Material de apoyo

* [Java Collections Framework from Oracle](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html)
* [Java Collections Tutorial](https://www.tutorialspoint.com/java/java_collections.htm)
* [Java Collections Framework from Javapoint](https://www.javatpoint.com/java-collections)
* [Java Collections Framework from Geeks for Geeks](https://www.geeksforgeeks.org/collections-in-java/)