package org.masterjava.codechallenge;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeros {
    public static int[] moveZeros(int[] arr) {
        // Creamos un arreglo del mismo tamaño que el arreglo de entrada
        int[] result = new int[arr.length];
        // Inicializamos un contador para llevar la cuenta de los elementos diferentes de cero
        int count = 0;
        // Inicializamos un contador para llevar la cuenta de los elementos iguales a cero
        int n = 0;
        // Iteramos sobre el arreglo de entrada
        for (int i = 0; i < arr.length; i++) {
            // Si el elemento actual es diferente de cero
            if (arr[i] != 0) {
                // Guardamos el elemento en el arreglo de resultado en la posición indicada por el contador
                result[count] = arr[i];
                // Incrementamos el contador
                count++;
            } else {
                // Si el elemento actual es cero, incrementamos el contador de ceros
                n++;
            }
        }
        // Iteramos sobre los ceros contados
        for (int i = 0; i < n; i++) {
            // Agregamos ceros al final del arreglo de resultado
            result[count] = 0;
            // Incrementamos el contador
            count++;
        }
        // Devolvemos el arreglo de resultado
        return result;
    }
    
    public static int[] moveZerosFunctional(int[] arr) {
        // Filtramos los elementos diferentes de cero y los guardamos en un arreglo
        int[] filtered = Arrays.stream(arr).filter(i -> i != 0).toArray();
        // Contamos los ceros en el arreglo de entrada utilizando el método count() de la clase Stream
        int numZeros = (int) Arrays.stream(arr).filter(i -> i == 0).count();
        // Generamos un arreglo de ceros del tamaño de los ceros contados utilizando el método generate() de la clase IntStream
        // y el método limit() de la clase Stream
        int[] zeros = IntStream.generate(() -> 0).limit(numZeros).toArray();
        // Concatenamos los arreglos de elementos diferentes de cero y de ceros, utilizando el método concat()
        // y los guardamos en un arreglo de resultado
        return IntStream.concat(Arrays.stream(filtered), Arrays.stream(zeros)).toArray();
    }
    

    public static void main(String[] args) {
        int[] arr = {1,0,4,6,0,2,5};
        int[] result = moveZeros(arr);
        int[] resultFunctional = moveZerosFunctional(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(resultFunctional));
    }
}

