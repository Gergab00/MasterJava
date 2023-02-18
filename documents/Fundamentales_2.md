## Estructuras de datos {#estructuras-de-datos}

Las estructuras de datos son una parte fundamental de la programación en Java y en otros lenguajes de programación. Son estructuras que nos permiten almacenar, organizar y manipular datos de forma eficiente. Las estructuras de datos más comunes en Java incluyen arrays, listas, pilas, colas, mapas, árboles y grafos.

### Arrays {#arrays}

Es una estructura de datos lineal que nos permite almacenar varios elementos del mismo tipo de datos en una sola estructura. Los elementos de un array se almacenan en una secuencia contigua de memoria. Cada elemento del array tiene un índice que nos permite acceder a él de forma directa. Los índices de un array comienzan en 0 y terminan en n-1, donde n es el número de elementos del array. Los arrays en Java son objetos, por lo que se crean utilizando el operador new. Los arrays en Java son estáticos, lo que significa que una vez que se crea un array, su tamaño no puede modificarse. Para crear un array de tamaño n, debemos especificar el tipo de datos y el tamaño del array:

```java
int[] numeros = new int[5];
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;
numeros[3] = 4;
numeros[4] = 5;
```

También podemos crear un array de forma más compacta:

```java
int[] numeros = {1, 2, 3, 4, 5};
```

Para acceder a los elementos de un array, podemos utilizar el operador de índice:

```java
int numero = numeros[0];
```

Para obtener el tamaño de un array, podemos utilizar la propiedad length:

```java
int size = numeros.length;
```

Para recorrer un array, podemos utilizar un bucle for:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

> **Nota**: Los arrays en Java son estáticos, lo que significa que una vez que se crea un array, su tamaño no puede modificarse. Si necesitamos un array de tamaño variable, podemos utilizar una lista.

### Arrays multidimensionales {#arrays-multidimensionales}

Un array multidimensional es un array que contiene otros arrays. Los arrays multidimensionales son útiles cuando necesitamos almacenar datos en una estructura de datos bidimensional o tridimensional. Para crear un array multidimensional, debemos especificar el tipo de datos y el tamaño de cada dimensión:

```java
int[][] numeros = new int[2][2];
numeros[0][0] = 1;
numeros[0][1] = 2;
numeros[1][0] = 3;
numeros[1][1] = 4;
```

También podemos crear un array multidimensional de forma más compacta:

```java
int[][] numeros = {{1, 2}, {3, 4}};
```

Para acceder a los elementos de un array multidimensional, podemos utilizar el operador de índice:

```java
int numero = numeros[0][0];
``` 

> **Nota**: Los arrays multidimensionales en Java son estáticos, lo que significa que una vez que se crea un array multidimensional, su tamaño no puede modificarse. Si necesitamos un array multidimensional de tamaño variable, podemos utilizar una matriz.

> **Nota**: Para ver la información sobre el resto de estructuras de datos, puedes consultar el siguiente enlace: [Colecciones](/documents/Colecciones.md)

## Clase Arrays {#clase-arrays}

La clase Arrays es una clase de utilidades que nos permite trabajar con arrays. La clase Arrays incluye métodos para ordenar, buscar y copiar arrays. La clase Arrays también incluye métodos para convertir arrays en listas y viceversa.

### Métodos de la clase Arrays {#metodos-de-la-clase-arrays}

#### sort {#sort} 
Ordena un array de forma ascendente.

#### binarySearch {#binarysearch}
Busca un elemento en un array ordenado.
* **copyOf**: Copia un array.
* **copyOfRange**: Copia un rango de elementos de un array.
* **equals**: Es un método estático que se utiliza para comparar dos arrays para verificar si tienen los mismos elementos en el mismo orden. Este método es muy útil cuando quieres comparar dos arrays para determinar si son iguales o no. Aquí hay un ejemplo de uso:

```java
int[] array1 = {1, 2, 3, 4, 5};
int[] array2 = {1, 2, 3, 4, 5};

boolean areArraysEqual = Arrays.equals(array1, array2);

System.out.println(areArraysEqual);
```
En este ejemplo, la variable areArraysEqual será true porque los elementos de array1 y array2 son los mismos y están en el mismo orden.

También puedes usar Arrays.equals para comparar arrays de otros tipos, como String[] o Object[], y el funcionamiento es el mismo. Por ejemplo:

```java
En este ejemplo, la variable areArraysEqual será true porque los elementos de array1 y array2 son los mismos y están en el mismo orden.

También puedes usar Arrays.equals para comparar arrays de otros tipos, como String[] o Object[], y el funcionamiento es el mismo. Por ejemplo:
```

* **fill**: Rellena un array con un valor.
* **asList**: Convierte un array en una lista.

## Material de apoyo {#material-de-apoyo}

* [Estructuras de datos](https://www.youtube.com/watch?v=9Jrj8YsJc3E)
* [Estructuras de datos en Java](https://www.youtube.com/watch?v=9Jrj8YsJc3E)
* [Arrays](https://www.youtube.com/watch?v=9Jrj8YsJc3E)
