package org.masterjava.codechallenge;

import java.util.HashMap;
import java.util.stream.Collectors;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String inputString = "occurrence";

        CharacterOccurrence characterOccurrence = new CharacterOccurrence();
        characterOccurrence.countOccurrence(inputString);
        characterOccurrence.countOccurrenceFunctional(inputString);
    }

    public void countOccurrence(String inputString) {
        // Crea un mapa para almacenar los caracteres y sus cantidades. 
        // El mapa utiliza un objeto `Character` como clave y un objeto `Integer` como valor.
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Itera sobre cada carácter en la cadena de entrada.
        for (int i = 0; i < inputString.length(); i++) {
            // Extrae el carácter actual.
            char ch = inputString.charAt(i);

            // Si el mapa ya contiene una entrada para el carácter actual, aumenta su cantidad en uno.
            if (charCountMap.containsKey(ch)) {
                // Extrae la cantidad actual del mapa.
                // El método `get` devuelve un objeto `Integer`, por lo que debemos convertirlo a un valor primitivo `int`.
                int count = charCountMap.get(ch);
                // Aumenta la cantidad en uno. Y luego, vuelve a agregar la entrada al mapa.
                charCountMap.put(ch, count + 1);
            } else {
                // Si el mapa no contiene una entrada para el carácter actual, agrega una entrada con valor inicial uno.
                charCountMap.put(ch, 1);
            }
        }
        
        for (char ch : charCountMap.keySet()) {
            System.out.println(ch + " - " + charCountMap.get(ch));
        }
    }

    public void countOccurrenceFunctional(String inputString) {
        // Crea un mapa para almacenar los caracteres y sus cantidades.
        HashMap<Character, Integer> charCountMap = inputString
                                                    // En primer lugar, se convierte la cadena de entrada en un stream de 
                                                    // caracteres utilizando el método chars() de la clase String.
                                                    .chars()
                                                    // A continuación, se utiliza el método mapToObj() para convertir 
                                                    // cada valor del stream de enteros en un carácter.
                                                    .mapToObj(c -> (char) c)
                                                    // Después, se utiliza el método collect() para recopilar los caracteres
                                                    // en un mapa que almacena el recuento de cada letra en la cadena.
                                                    // El método toMap() se utiliza para crear un nuevo mapa con la clave como carácter
                                                    // y el valor como un entero igual a 1.
                                                    .collect(
                                                        Collectors.toMap(ch -> ch, ch -> 1,
                                                        // Si hay más de una ocurrencia de la misma clave, se utiliza la función Integer::sum
                                                        // para sumar los valores y, finalmente, se utiliza el constructor HashMap::new para
                                                        // crear un objeto HashMap.
                                                        Integer::sum, HashMap::new));

        charCountMap.forEach((ch, count) -> System.out.println(ch + " - " + count));

    }
}

