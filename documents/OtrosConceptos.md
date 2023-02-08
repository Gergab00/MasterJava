# Otros conceptos

## Memoria: Stack, Heap y String Pool.

En Java, la memoria se divide en dos partes: Stack y Heap. La memoria Stack es una memoria de tipo LIFO (Last In First Out), es decir, el último elemento que entra es el primero que sale, es una memoria estática, es decir, no se puede expandir o contraer según sea necesario. Cada método en Java tiene su propio stack de llamadas, donde se almacenan los objetos creados dentro del método y se liberan automáticamente cuando el método finaliza. Los objetos en el stack son accedidos rápidamente, ya que están almacenados en la memoria RAM, pero su tamaño es limitado y su tiempo de vida es corto.

Este es un ejemplo de cómo se almacenan los objetos en el stack:

```java
class StackExample {
   public static void main(String args[]) {
      int x = 10;
      int y = 20;
      int result = x + y;
      System.out.println("Result: " + result);
   }
}
```

La memoria Heap es una memoria de tipo FIFO (First In First Out), es decir, el primer elemento que entra es el primero que sale, es una memoria dinámica, es decir, se puede expandir o contraer según sea necesario. Los objetos en el heap tienen un tiempo de vida más largo que los objetos en el stack y su tamaño no está limitado, pero su acceso es más lento. En Java, todos los objetos y las variables de referencia se almacenan en el heap.

Este es un ejemplo de cómo se almacenan los objetos en el heap:

```java
class HeapExample {
   public static void main(String args[]) {
      Integer x = new Integer(10);
      Integer y = new Integer(20);
      Integer result = x + y;
      System.out.println("Result: " + result);
   }
}
```

También existe una tercera memoria, la String Pool, que es una memoria de tipo LIFO (Last In First Out), es decir, el último elemento que entra es el primero que sale, es una memoria estática, es decir, no se puede expandir o contraer según sea necesario. La String Pool es una memoria especial que almacena todos los objetos String en Java. Cuando se crea un objeto String, primero se busca en la String Pool para ver si ya existe un objeto String con el mismo valor. Si existe, se devuelve una referencia al objeto String existente. Si no existe, se crea un nuevo objeto String y se almacena en la String Pool. De esta manera, se reduce el uso de la memoria y se mejora el rendimiento.

Este es un ejemplo de cómo se almacenan los objetos en la String Pool:

```java
class StringPoolExample {
   public static void main(String args[]) {
      String s1 = "Hello";
      String s2 = "Hello";
      String s3 = new String("Hello");
      System.out.println(s1 == s2); // true
      System.out.println(s1 == s3); // false
   }
}
```

### Consideraciones y buenas prácticas de programación sobre el uso de memoria.

El manejo de memoria en Java es un tema importante que debe ser considerado cuidadosamente para garantizar un rendimiento óptimo y evitar errores de memoria. Aquí hay algunas consideraciones y buenas prácticas para manejar la memoria en Java:

1. Evite la creación de objetos innecesarios: Crear objetos innecesarios puede consumir una gran cantidad de memoria y disminuir el rendimiento de la aplicación. Es importante asegurarse de crear objetos solo cuando sea necesario y liberarlos inmediatamente después de que ya no sean necesarios.

2. Utilice objetos de alcance limitado: Es una buena práctica utilizar objetos con un alcance limitado, ya que esto permite que el recolector de basura los libere cuando no sean necesarios. Por ejemplo, en lugar de crear un objeto en el ámbito global, se recomienda crearlo dentro de un método o un bloque.

3. Evite la retención de referencias no utilizadas: Las referencias a objetos no utilizados pueden impedir que el recolector de basura libere la memoria correspondiente. Es importante asegurarse de liberar referencias a objetos que ya no se utilizan.

4. Use la recolección de basura: La recolección de basura es una característica clave de Java que permite liberar automáticamente la memoria ocupada por objetos que ya no son necesarios. Es importante permitir que el recolector de basura haga su trabajo y evitar intentar liberar manualmente la memoria.

5. Utilice objetos con tamaño fijo: Cuando sea posible, utilice objetos con un tamaño fijo en lugar de objetos dinámicos. Por ejemplo, en lugar de utilizar una lista que puede crecer y decrecer dinámicamente, es mejor utilizar un arreglo con un tamaño fijo.

6. Utilice el pool de strings: El pool de strings es una característica de Java que permite que los objetos String sean reutilizados en lugar de crearse constantemente. Para aprovechar este mecanismo, es importante utilizar la clase String de manera adecuada y evitar crear objetos String constantemente.

Estas son solo algunas de las consideraciones y buenas prácticas para manejar la memoria en Java. Es importante tener en cuenta que cada aplicación es única y puede requerir un enfoque diferente en función de sus requisitos específicos.
