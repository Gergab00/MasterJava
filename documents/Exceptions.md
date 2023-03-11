# Excepciones en Java

## ¿Qué son las excepciones en Java?

### Introducción a las excepciones en Java

Las excepciones en Java son un mecanismo importante para manejar situaciones inesperadas y garantizar la estabilidad de un programa. Al utilizar adecuadamente las excepciones, los desarrolladores pueden crear aplicaciones más confiables y seguras.

### ¿Por qué usamos las excepciones en Java?

Las excepciones en Java son una forma de manejar situaciones inesperadas en un programa. Por ejemplo, si un programa intenta abrir un archivo que no existe, se producirá una excepción de tipo "FileNotFoundException". Si no se maneja adecuadamente, este tipo de excepciones pueden provocar que un programa se detenga inesperadamente.

### ¿Cómo funcionan las excepciones en Java?

En Java, las excepciones son representadas por objetos que pertenecen a una clase que hereda de la clase "Exception". Cuando se produce una excepción, se crea un objeto de la clase correspondiente y se "lanza" en el código. Después de que una excepción es lanzada, el control del programa se transfiere automáticamente a un bloque de código especial llamado "try-catch".

## Tipos de excepciones en Java

En Java, las excepciones son eventos que ocurren en tiempo de ejecución y que pueden interrumpir el flujo normal de un programa. Estas excepciones son capturadas y gestionadas por el sistema para evitar que el programa falle de forma abrupta.

Java proporciona dos tipos de excepciones: excepciones comprobadas (checked exceptions) y excepciones no comprobadas (unchecked exceptions).

### Excepciones Checked y Unchecked

Las excepciones comprobadas (checked exceptions) son aquellas que se requieren que sean gestionadas explícitamente por el programador mediante el uso de un bloque try-catch o la declaración throws.

Las excepciones no comprobadas (unchecked exceptions) son aquellas que no requieren que sean gestionadas explícitamente, ya que son consideradas como errores en tiempo de ejecución que no deben ser tratados normalmente.

### Excepciones de runtime (Unchecked exceptions)

Las excepciones de runtime (unchecked exceptions) en Java son excepciones que se lanzan en tiempo de ejecución y que no se comprueban durante la compilación. A diferencia de las excepciones comprobadas, no es obligatorio que los programadores las capturen o las declaren en su código.

Las excepciones de runtime se utilizan para indicar errores que no pueden ser recuperados de forma razonable por el programa en tiempo de ejecución. Esto puede incluir errores como una división por cero, una llamada a un método con un argumento no válido, una referencia nula, un desbordamiento de memoria, entre otros.

Un ejemplo de excepción de runtime en Java es la clase NullPointerException, que se lanza cuando un programa intenta acceder a un objeto o variable nula.

A continuación se muestra un ejemplo de código que lanza una excepción de runtime:

```java
public class Main {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());
    }
}
```

Este código intenta obtener la longitud de una cadena nula, lo que provocará una excepción de runtime en tiempo de ejecución.

Es importante tener en cuenta que, aunque no se requiere que los programadores capturen o declaren las excepciones de runtime, aún pueden hacerlo si desean manejar el error de manera específica.

### Excepciones comprobadas (Checked exceptions)

Una excepción comprobada (también conocida como excepción verificada o checked exception) es una excepción que el compilador obliga a ser capturada o declarada en la firma del método. Estas excepciones son comprobadas en tiempo de compilación y el compilador asegura que se tomen medidas para manejarlas, ya sea mediante la captura y el manejo de la excepción o la declaración de la excepción en la firma del método.

Las excepciones comprobadas se utilizan para indicar situaciones excepcionales que pueden ocurrir durante la ejecución del programa y que el programador debe manejar. Por ejemplo, si un método necesita leer un archivo y el archivo no existe, se puede lanzar una excepción FileNotFoundException. Si no se maneja, esto puede causar problemas graves en la ejecución del programa. Al declarar la excepción FileNotFoundException en la firma del método, el compilador obliga al programador a manejar la excepción de alguna manera, por ejemplo, mediante el uso de un bloque try-catch.

A continuación se muestra un ejemplo de código que lanza una excepción comprobada:

```java
public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

En este ejemplo, el método main() intenta crear un objeto FileReader para leer el archivo "test.txt". Sin embargo, como el archivo no existe, se lanzará una excepción FileNotFoundException. Para evitar que el programa falle, el programador debe capturar la excepción y manejarla de alguna manera.

### Diferencia entre excepciones Checked y Unchecked

Las excepciones comprobadas y las excepciones no comprobadas son dos tipos de excepciones en Java que se utilizan para manejar situaciones inesperadas en un programa. A continuación se muestra una tabla que resume las diferencias entre las excepciones comprobadas y las excepciones no comprobadas:

| Excepciones comprobadas (Checked exceptions) | Excepciones no comprobadas (Unchecked exceptions) |
| -------------------------------------------- | ----------------------------------------------- |
| Son excepciones que se requieren que sean gestionadas explícitamente por el programador mediante el uso de un bloque try-catch o la declaración throws. | Son excepciones que no requieren que sean gestionadas explícitamente, ya que son consideradas como errores en tiempo de ejecución que no deben ser tratados normalmente. |
| Son excepciones que se comprueban durante la compilación. | Son excepciones que no se comprueban durante la compilación. |
| Son excepciones que se utilizan para indicar situaciones excepcionales que pueden ocurrir durante la ejecución del programa y que el programador debe manejar. | Son excepciones que se utilizan para indicar errores que no pueden ser recuperados de forma razonable por el programa en tiempo de ejecución. |

La principal diferencia entre excepciones comprobadas y no comprobadas es que las primeras son verificadas en tiempo de compilación y deben ser manejadas o declaradas explícitamente, mientras que las segundas son lanzadas en tiempo de ejecución y no necesitan ser manejadas o declaradas explícitamente.

## Control de excepciones en Java

### ¿Cómo capturar una excepción en Java?

Las excepciones se capturan y manejan mediante bloques try-catch. Un bloque try-catch consta de dos partes: el bloque try, donde se coloca el código que puede generar una excepción, y uno o varios bloques catch, donde se manejan las excepciones que puedan ocurrir.

La sintaxis básica de un bloque try-catch es la siguiente:
    
```java

try {
    // Código que puede generar una excepción
} catch (ExcepcionTipo1 e1) {
    // Manejo de excepción de tipo ExcepcionTipo1
} catch (ExcepcionTipo2 e2) {
    // Manejo de excepción de tipo ExcepcionTipo2
} catch (Exception e) {
    // Manejo de cualquier otra excepción
} finally {
    // Código que se ejecuta siempre, haya o no excepción
}

```

En el bloque try se coloca el código que puede generar una excepción. Si se produce una excepción, se lanza una instancia de la clase correspondiente a la excepción. A continuación, el código salta al bloque catch que corresponde al tipo de excepción que se ha lanzado. Si no hay un bloque catch que maneje esa excepción, la excepción se propaga hacia arriba en la pila de llamadas hasta que se encuentra un bloque catch adecuado.

En el bloque catch, se proporciona el código que maneja la excepción. Cada bloque catch maneja un tipo específico de excepción. El bloque finally se utiliza para código que se ejecuta siempre, haya o no excepción. El bloque finally es opcional.

Dentro del bloque try se coloca el código que puede lanzar una excepción. Si se lanza una excepción, el control se transfiere al bloque catch correspondiente. El bloque catch recibe el objeto de excepción, que se puede usar para obtener información adicional sobre la excepción, como su mensaje y su causa.

Si hay varias excepciones que pueden ser lanzadas por el código en el bloque try, se pueden colocar varios bloques catch para manejar cada tipo de excepción. También es posible usar un bloque catch genérico que maneje cualquier tipo de excepción que no haya sido manejado por los bloques catch anteriores. El bloque catch genérico se coloca al final de la lista de bloques catch y se declara como Exception.

Es importante tener en cuenta que las cláusulas catch deben estar en el orden correcto, de lo contrario, podría producirse un error de compilación. Siempre debe comenzar con la excepción más específica y luego pasar a excepciones más generales. Por ejemplo, si se lanza una excepción NullPointerException, también se lanzará una excepción RuntimeException, por lo que el bloque catch para NullPointerException debe ir antes que el bloque catch para RuntimeException.

El bloque finally es opcional y se utiliza para código que se debe ejecutar siempre, independientemente de si se lanza o no una excepción en el bloque try. Por ejemplo, si se necesita cerrar un archivo abierto en el bloque try, se puede colocar el código de cierre en el bloque finally para asegurarse de que siempre se cierre el archivo, incluso si ocurre una excepción.

### ¿Qué hacer después de capturar una excepción?

Después de capturar una excepción en Java, se pueden realizar varias acciones dependiendo del caso específico. Algunas de las acciones que se pueden realizar son:

1. **Registrar la excepción:** Es recomendable registrar la excepción en algún archivo de registro (log) o en la consola para que se tenga un registro de lo que sucedió.

2. **Notificar al usuario:** En algunos casos es necesario notificar al usuario que ha ocurrido una excepción para que pueda tomar alguna acción, como intentarlo de nuevo o contactar al soporte técnico.

3. **Limpiar los recursos:** Si se estaban utilizando recursos como conexiones a bases de datos, archivos o sockets, es necesario cerrarlos para evitar fugas de memoria o problemas similares.

4. **Intentar recuperarse:** En algunos casos se puede intentar recuperarse de la excepción y continuar con el flujo normal del programa. Esto depende de la excepción y del contexto en el que se produjo.

En resumen, lo que se debe hacer después de capturar una excepción depende del caso específico y de las acciones necesarias para resolver el problema y mantener la estabilidad del sistema.

### Propagación de excepciones

La propagación de excepciones es un concepto importante en programación orientada a objetos y se refiere al manejo de excepciones que se producen en una parte de un programa y cómo se transmiten o propagan hacia otros métodos o partes del programa para su manejo.

En términos simples, cuando se produce una excepción en una sección de código, se puede manejar la excepción en el mismo método donde se produjo la excepción, o se puede propagar la excepción a otro método para que la maneje. La propagación de excepciones es una forma de enviar mensajes entre métodos.

La propagación de excepciones es una forma de controlar los errores y manejar las situaciones excepcionales de forma más eficiente y efectiva en una aplicación. Si se propagan las excepciones correctamente, se puede detectar y corregir los errores antes de que causen problemas más graves en el programa.

En Java, cuando una excepción se produce en un método, se puede propagar a otro método usando la palabra clave `"throws"`. Esto indica que el método que lanza la excepción no se hará cargo de su manejo y que el método que lo llama debe encargarse de manejar la excepción. Si el método que llama al método que lanza la excepción no maneja la excepción, la excepción se propagará hacia arriba en la pila de llamadas hasta que se encuentre un método que la maneje. Por ejemplo:

```java
public void metodo1() throws ExcepcionPersonalizada {
  // Código que puede lanzar la excepción personalizada
}

public void metodo2() {
  try {
    metodo1();
  } catch (ExcepcionPersonalizada e) {
    // Manejo de la excepción personalizada
  }
}
```
En este ejemplo, el método "metodo1" puede lanzar una excepción personalizada. El método "metodo2" llama a "metodo1" y lo coloca en un bloque try-catch para manejar la excepción personalizada que se pueda producir.

Otro aspecto importante de la propagación de excepciones es que, cuando se propagan excepciones, se debe tener cuidado de no perder información importante sobre el error original. Esto se puede hacer agregando información a la excepción antes de propagarla. Por ejemplo:

```java
public void metodo1() throws ExcepcionPersonalizada {
  try {
    // Código que puede lanzar una excepción personalizada
  } catch (ExcepcionPersonalizada e) {
    e.setMensaje("Error en el método 1");
    throw e;
  }
}

public void metodo2() {
  try {
    metodo1();
  } catch (ExcepcionPersonalizada e) {
    // Manejo de la excepción personalizada con el mensaje agregado
  }
}
```

En este ejemplo, se agrega un mensaje a la excepción personalizada antes de propagarla en el método "metodo1". Esto permite que el método "metodo2" tenga acceso a la información adicional sobre el error original y pueda manejar la excepción de manera más efectiva.

En resumen, la propagación de excepciones es un concepto importante en programación orientada a objetos que permite manejar las excepciones de manera efectiva y eficiente en una aplicación. Al propagar excepciones de manera adecuada, se puede detectar y corregir los errores antes de que causen problemas más graves en el programa.

### El bloque finally

El bloque `finally` en Java es un bloque de código que se utiliza para contener instrucciones que deben ejecutarse independientemente de si se ha lanzado una excepción o no en el bloque `try` correspondiente. Este bloque siempre se ejecuta después de que se ha completado la ejecución del bloque `try`, ya sea que se haya lanzado una excepción o no.

El bloque `finally` es útil cuando se necesita asegurarse de que se liberen ciertos recursos o que se realice alguna acción importante, independientemente de si ocurre algún error o excepción en el bloque `try`. Por ejemplo, si se abrió un archivo en el bloque `try`, se debe cerrar el archivo en el bloque finally para asegurarse de que se libere correctamente, incluso si se produjo una excepción en el bloque `try`.

La sintaxis básica del bloque finally es la siguiente:

```java
try {
    // Bloque de código que se intenta ejecutar
} catch (Exception e) {
    // Bloque de código que se ejecuta si se produce una excepción
} finally {
    // Bloque de código que siempre se ejecuta después de try-catch
}
```

Hay algunos puntos importantes a tener en cuenta sobre el bloque `finally`:

- El bloque `finally` siempre se ejecuta, independientemente de si se produce una excepción en el bloque `try` o no.
- Si hay una cláusula catch en el bloque `try`, el bloque `finally` se ejecuta después de la cláusula `catch`.
- Si no hay una cláusula `catch` en el bloque `try`, el bloque `finally` se ejecuta después de que se completa el bloque `try`.
- Si se lanza una excepción en el bloque `finally`, la excepción original se descarta y se lanza la excepción del bloque `finally`.
- Si se utiliza la sentencia `return` dentro del bloque `try` o `catch`, la sentencia `finally` se ejecuta antes de que se devuelva el valor.

Aquí hay un ejemplo práctico para ilustrar el uso del bloque `finally` en Java:

Supongamos que tienes un archivo que quieres leer y procesar en tu programa Java. Para leer el archivo, necesitas abrirlo, leer los datos y luego cerrarlo. Pero si se produce una excepción durante la lectura del archivo, aún necesitas cerrar el archivo para liberar recursos.

Aquí está el código que maneja la apertura, lectura y cierre del archivo usando un bloque `try-catch-finally`:

```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            File file = new File("file.txt");
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
```
En este ejemplo, el bloque `try` contiene el código para abrir y leer el archivo. Si se produce una excepción de lectura de archivos, el bloque `catch` maneja la excepción y muestra un mensaje de error.

El bloque `finally` se utiliza para cerrar el archivo. Si se produce una excepción durante la lectura del archivo, el bloque `finally` aún se ejecutará y cerrará el archivo para liberar recursos.

Es importante destacar que el bloque `finally` siempre se ejecuta, independientemente de si se produjo o no una excepción. Por lo tanto, es un lugar ideal para poner el código que libera los recursos que se utilizaron en el bloque `try`.

En resumen, el bloque `finally` se utiliza para asegurarse de que se ejecute un código importante, independientemente de si ocurre una excepción o no en el bloque `try`.

### El keyword throw

La palabra clave `throw` se utiliza para lanzar una excepción explícitamente. Permite al programador lanzar una excepción si encuentra algún error o situación inesperada en el código.

La sintaxis básica de la palabra clave throw es la siguiente:

```java
throw new Exception("Mensaje de error");
```

Aquí, exception es la instancia de la clase Exception (o de cualquier clase que herede de ella) que se desea lanzar.

El uso de la palabra clave throw implica que el programador es consciente de la posible excepción que se puede generar y, por lo tanto, toma medidas para manejarla. Si se lanza una excepción y no se maneja, el programa terminará abruptamente y se imprimirá un mensaje de error.

Veamos un ejemplo para entender mejor el uso de la palabra clave throw:

```java
public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException("El divisor no puede ser cero");
            }
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

En este ejemplo, el bloque `try` contiene el código para dividir dos números. Si el divisor es cero, se lanza una excepción de tipo `ArithmeticException` con un mensaje de error.

En el bloque `try`, si se encuentra una excepción, se lanza una excepción usando `throw`. El bloque `catch` captura la excepción y muestra el mensaje de error correspondiente.

Es importante recordar que el uso de `throw` puede ser muy útil, pero también puede ser peligroso si se usa incorrectamente. Por lo tanto, es importante entender las excepciones que se pueden generar y manejarlas adecuadamente en el código.

## Creación de excepciones personalizadas en Java

### Creación de excepciones personalizadas

Podemos crear nuestras propias excepciones personalizadas, que son excepciones específicas para un caso de uso determinado y que pueden ser lanzadas por nuestro propio código. Para crear una excepción personalizada, debemos seguir los siguientes pasos:

1. Crear una clase que extienda la clase Exception o alguna de sus subclases (por ejemplo, RuntimeException).

2. Definir un constructor que llame al constructor de la superclase y que tome como argumentos los datos necesarios para describir la excepción. Por ejemplo:

```java
public class MiExcepcion extends Exception {
    private int codigoError;
    
    public MiExcepcion(int codigoError, String mensaje) {
        super(mensaje);
        this.codigoError = codigoError;
    }
    
    public int getCodigoError() {
        return codigoError;
    }
}
```

En este ejemplo, hemos creado una excepción llamada MiExcepcion que tiene un campo adicional llamado codigoError y que toma dos argumentos en su constructor: el código de error y el mensaje que se quiere mostrar.

3. Lanzar la excepción personalizada en el código cuando se encuentre un error. Por ejemplo:

```java
public void miMetodo() throws MiExcepcion {
    if (condicionDeError) {
        throw new MiExcepcion(123, "Ocurrió un error.");
    }
}
```

En este ejemplo, hemos creado un método llamado miMetodo que puede lanzar una excepción MiExcepcion si se cumple la condición de error.

Al crear nuestras propias excepciones personalizadas, podemos hacer que nuestro código sea más legible y fácil de mantener, ya que podemos crear excepciones que describan con precisión los errores específicos que pueden ocurrir en nuestro sistema. Además, esto permite a otros programadores entender rápidamente qué tipo de excepción puede lanzar nuestro código y cómo manejarla de manera adecuada.

### ¿Por qué crear excepciones personalizadas?

Crear excepciones personalizadas es útil en situaciones en las que las excepciones predefinidas de Java no son suficientes para manejar un error específico en una aplicación. Las excepciones personalizadas permiten que los programadores definan y lancen excepciones específicas para situaciones particulares que puedan ocurrir en su código.

Por ejemplo, suponga que está creando un programa de contabilidad y desea lanzar una excepción personalizada cuando el usuario intenta dividir un número por cero. En lugar de lanzar una excepción predefinida como `ArithmeticException`, puede crear su propia excepción `DivisionPorCeroException` que capture el error específico que se está produciendo en el programa.

Al crear excepciones personalizadas, también puede proporcionar mensajes de error más útiles y descriptivos que faciliten la identificación y resolución de problemas en la aplicación. Esto ayuda a los desarrolladores a solucionar problemas de manera más efectiva, ahorrando tiempo y aumentando la eficiencia en el desarrollo.

### Extensiones de la clase Exception y su utilidad en la creación de excepciones personalizadas

Además de la clase `Exception`, en Java también existen otras clases que se pueden extender para crear excepciones personalizadas. Algunas de ellas son:

1. **RuntimeException:** esta clase es la superclase de todas las excepciones que pueden ser lanzadas durante la ejecución de un programa en Java. Se utiliza principalmente para errores que son causados ​​por programación incorrecta, como intentar acceder a un índice de matriz fuera de rango o llamar a un método en un objeto que es nulo. Las excepciones que se derivan de `RuntimeException` no están obligadas a ser capturadas o declaradas en el método que las lanza.

2. **IOException:** esta clase es la superclase de todas las excepciones de entrada / salida (E/S) en Java. Se utiliza principalmente para manejar errores relacionados con operaciones de E/S, como leer o escribir archivos, sockets, tuberías, etc.

3. **SQLException:** esta clase es la superclase de todas las excepciones que están relacionadas con la base de datos en Java. Se utiliza principalmente para manejar errores relacionados con operaciones de base de datos, como intentar insertar una fila duplicada en una tabla o intentar conectarse a una base de datos inexistente.

Estas clases y otras superclases de excepciones predefinidas en Java pueden ser útiles para manejar excepciones específicas que surgen en ciertas situaciones o áreas de un programa. Al crear una excepción personalizada, se puede derivar de la clase que sea más apropiada para el tipo de error que se está manejando.

## Uso de las excepciones en Java en programación orientada a objetos

### Las excepciones como una forma de enviar mensajes entre objetos

Las excepciones en Java no sólo se utilizan para manejar errores y situaciones inesperadas en el programa, sino también pueden ser utilizadas como una forma de enviar mensajes entre objetos.

En situaciones donde una operación no puede ser completada o debe ser interrumpida debido a algún problema, se puede lanzar una excepción. Esta excepción puede ser capturada por otro objeto, que puede tomar acciones basadas en la excepción recibida.

Por ejemplo, supongamos que tenemos un objeto que realiza una tarea que puede tardar mucho tiempo en completarse. En lugar de bloquear el programa y esperar a que la tarea se complete, podemos lanzar una excepción si la tarea no puede completarse debido a alguna razón. Otro objeto que esté esperando por la tarea, puede capturar la excepción y tomar acciones alternativas.

De esta manera, las excepciones se convierten en una forma de comunicación entre objetos. Al lanzar una excepción, un objeto puede notificar a otro objeto acerca de una situación que necesita atención. Por otro lado, un objeto que captura una excepción puede tomar decisiones basadas en la situación que ha sido notificada.

En resumen, las excepciones no sólo son una herramienta útil para manejar errores y situaciones inesperadas en el programa, sino también pueden ser utilizadas como una forma de enviar mensajes entre objetos en el programa.

### El uso de las excepciones en la programación orientada a objetos
### ¿Cómo usar las excepciones para hacer que un objeto informe a otro objeto de un problema?
### ¿Cómo las excepciones pueden ayudar a hacer que un programa sea más robusto?

## Mejores prácticas para manejar excepciones en Java

### ¿Cuáles son las mejores prácticas para manejar excepciones en Java?
### ¿Cómo evitar que una excepción detenga la ejecución de un programa?
### ¿Cómo lograr un código más legible al usar excepciones en Java?

## Preguntas de entrevista de trabajo {#preguntas-de-entrevista-de-trabajo}