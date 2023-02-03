## Big O Notation

La notación Big O es una forma de describir la complejidad temporal o espacial de un algoritmo o programa informático. La notación Big O se utiliza para analizar el peor caso del rendimiento de un algoritmo, lo que significa que la complejidad se mide en términos de la cantidad de operaciones que un algoritmo realiza en función del tamaño de la entrada. La notación Big O se utiliza para describir cuánto tiempo un algoritmo tardará en completarse en el peor de los casos.

Por ejemplo, si un algoritmo realiza una cantidad constante de operaciones para cualquier tamaño de entrada, se dice que tiene una complejidad temporal O(1). Si un algoritmo realiza un número de operaciones que es proporcional al tamaño de la entrada, se dice que tiene una complejidad temporal O(n). Y si un algoritmo realiza un número de operaciones que es proporcional al tamaño de la entrada al cuadrado, se dice que tiene una complejidad temporal O(n^2).

> ⚠️ Es **importante** destacar que la notación Big O se utiliza para describir un límite superior de la complejidad de un algoritmo, no su tiempo real de ejecución. Además, se utiliza para comparar diferentes algoritmos y elegir el más adecuado para una tarea específica en función de sus requisitos de tiempo y espacio.

Algunos ejemplos de notaciones comunes de Big O incluyen:

- **O(1)**, que significa que el tiempo de ejecución es constante y no depende del tamaño de la entrada.
    Aquí hay un ejemplo de código Java que ilustra esto:
    
    ```java
    public static int getFirstElement(int[] array) {
        return array[0];
    }
    ```
    En este ejemplo, el método **`getFirstElement`** devuelve el primer elemento en el **`array`**. El método realiza una operación constante, por lo que su complejidad temporal es **O(1)**.

    Esto significa que el tiempo de ejecución del algoritmo no aumentará proporcionalmente a medida que el tamaño de la entrada aumente.

    > 🔑 La clave para determinar si un algoritmo es O(1) es identificar las operaciones que tienen un tiempo constante de ejecución. En este caso, la operación consiste en acceder al primer elemento de un array, lo que siempre se realiza en un tiempo constante.

- **O(n)**, que significa que el tiempo de ejecución es proporcional al tamaño de la entrada. Por ejemplo, si un algoritmo toma 1 segundo para procesar 100 elementos, se esperaría que tome 2 segundos para procesar 200 elementos.

    Un ejemplo de un algoritmo con complejidad **O(n)** es un algoritmo que realiza una operación por cada elemento en una lista. Por ejemplo, podemos escribir un método que sume todos los elementos en una lista como sigue:

    ```java
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
    ```
    En este ejemplo, la complejidad temporal del método es **O(n)**, ya que el tiempo que tarda en ejecutarse es directamente proporcional al tamaño de la lista. <ins>_Para cada elemento en la lista, el método realiza una operación de adición, por lo que el tiempo total de ejecución depende directamente del tamaño de la lista_</ins>.

- **O(n^2)**, que significa que el tiempo de ejecución es proporcional al cuadrado del tamaño de la entrada. Por ejemplo, si un algoritmo toma 1 segundo para procesar 100 elementos, se esperaría que tome 4 segundos para procesar 200 elementos.

    Aquí hay un ejemplo de un algoritmo que tiene una complejidad de **O(n^2)**:

    ```java
    public static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    ```
    En este ejemplo, tenemos dos ciclos for anidados. El primer ciclo for itera a través de todos los elementos en el **`array`**, y el segundo ciclo for itera a través de los elementos restantes después del primer elemento. Por lo tanto, en total, estamos iterando a través de **`array.length * (array.length - 1) / 2`** pares, lo que es equivalente a **`n^2 / 2`** pares, donde **`n`** es el tamaño de **`array`**. Por lo tanto, la complejidad de este algoritmo es **O(n^2)**.

- **O(log n)**, que significa que el tiempo de ejecución aumenta logarítmicamente con el tamaño de la entrada. Por ejemplo, si un algoritmo toma 1 segundo para procesar 1,000 elementos, se esperaría que tome aproximadamente 2 segundos para procesar 10,000 elementos.

    Aquí hay un ejemplo de código Java que representa una operación de complejidad **O(log n)**:
    
    ```java
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == target) {
                return mid;
            }
            if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    ```

    Este código implementa una búsqueda binaria, un algoritmo que permite buscar un elemento en una secuencia ordenada de datos. La complejidad del algoritmo es **O(log n)** porque, en cada iteración, la cantidad de elementos que deben ser revisados se divide a la mitad.

    Por lo tanto, a medida que el tamaño de la secuencia aumenta, la cantidad de iteraciones necesarias para encontrar el elemento target se mantiene constante. En el peor de los casos, se necesitan log2(n) iteraciones para encontrar el elemento.

    > 💡 **NOTA:** Cuando en una entrevista te preguntan sobre la complejidad de un algoritmo, es importante que menciones en una expresion **`Big O`** como el tamaño del conjunto de datos afecta el rendimiento de ese algoritmo.

    