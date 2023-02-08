## Historia de Java

![Logo Java](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Duke_%28Java_mascot%29_waving.svg/140px-Duke_%28Java_mascot%29_waving.svg.png)

Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems. Hay muchas aplicaciones y sitios web que no funcionarán, probablemente, a menos que tengan Java instalado, y cada día se crean más. Java es rápido, seguro y fiable. Desde ordenadores portátiles hasta centros de datos, desde consolas para juegos hasta computadoras avanzadas, desde teléfonos móviles hasta Internet, Java está en todas partes. Si es ejecutado en una plataforma no tiene que ser recompilado para correr en otra. Java es, a partir de 2012, uno de los lenguajes de programación más populares en uso, particularmente para aplicaciones de cliente-servidor de web, con unos diez millones de usuarios reportados.2​3​

El lenguaje de programación Java fue desarrollado originalmente por James Gosling, de Sun Microsystems (constituida en 1983 y posteriormente adquirida el 27 de enero de 2010 por la compañía Oracle),4​ y publicado en 1995 como un componente fundamental de la plataforma Java de Sun Microsystems. Su sintaxis deriva en gran medida de C y C++, pero tiene menos utilidades de bajo nivel que cualquiera de ellos. Las aplicaciones de Java son compiladas a bytecode (clase Java), que puede ejecutarse en cualquier máquina virtual Java (JVM) sin importar la arquitectura de la computadora subyacente.

La compañía Sun desarrolló la implementación de referencia original para los compiladores de Java, máquinas virtuales y librerías de clases en 1991, y las publicó por primera vez en 1995. A partir de mayo de 2007, en cumplimiento de las especificaciones del Proceso de la Comunidad Java, Sun volvió a licenciar la mayoría de sus tecnologías de Java bajo la Licencia Pública General de GNU. Otros han desarrollado también implementaciones alternas a estas tecnologías de Sun, tales como el Compilador de Java de GNU y el GNU Classpath.

## Hello World en Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
}
```

## Sintaxis Básica de Java (Variables, Tipos de Datos, Operadores, etc) {#sintaxis-basica}

### ¿Que son las palabras reservadas en Java? {#palabras-reservadas}
En Java, existen un conjunto de palabras que como su propio nombre indican, están reservadas para el propio lenguaje de programación. Si pensamos en programar, hasta un programa sencillo necesitará crear una clase, definir un tipo de variable o crear un bucle. Todo esto lo hacemos con estás palabras reservadas. Por lo tanto, no se pueden usar como identificadores por el programador ya que dichas palabras están reservadas para identificar funciones dentro del lenguaje de programación.

Con identificadores, nos referimos a un nombre que identifique a cualquier objeto, variable o clase.


| abstract |	class |	final |	int |	public |	this |
| :---: | :---: | :---: | :---: | :---: | :---: |
| assert |	continue |	finally |	interface |	return |	throw |
| boolean |	default |	float |	long |	short |	throws |
| break |	do |	for |	native |	static |	transient |
| byte |	double |	if |	new |	strictfp |	try |
| case |	else |	implements |	package |	super |	void |
| catch |	enum |	import |	private |	switch |	volatile |
| char |	extends |	instanceof |	protected |	synchronized |	while |
| null |	true |	false |

Todos los identificadores ya sean variables, constantes, clases; necesitan cumplir ciertas reglas sintácticas para poder funcionar perfectamente:

1. __No utilizar ninguna palabra reservada__ por el lenguaje de programación (vistas en la parte de arriba).
2. __Empezar siempre por una letra__, símbolo de dolar ($) o barra baja (\_).
3. __Key Sensitive__: distingue entre mayúsculas y minúsculas. Por ejemplo si guardamos un archivo con estos 3 identificadores (nombres) ___hola___, ___Hola___ o ___hOla___, serán completamente diferentes para Java.
4. __Se desaconseja todo uso de espacios__: usar espacios es una mala práctica en Java debido a que en las clases funciona pero en las variables no. Por ello mejor no usarlos y así nos evitaremos futuros problemas.
5. __Los identificadores no tienen limite de longitud__: es decir, no tienen caracteres máximos.

### La notación Camel Case en Java {#camel-case}

Camel Case, consiste en unir palabras sin dejar espacios y recibe dicho nombre por la similitud con las jorobas de los camellos.

-__Upper Camel Case__: Toda letra inicial de palabra en mayúsculas (Upper) y el resto de la palabra en minúsculas y las siguientes palabras, la letra inicial en mayúsculas (Upper) y el resto de palabra en minúscula. Usaremos Upper Camel Case para las clases.
-__Lower Camel Case__: Toda la palabra inicial en minúsculas (Lower) y la siguiente palabra comenzará con la primera letra inicial en mayúsculas y el resto de la palabra en minúsculas. Usaremos Lower Camel Case para los métodos y variables

## Variables en Java {#variables}

Una variable es el nombre dado a una ubicación de memoria. Es la unidad básica de almacenamiento en un programa. El valor almacenado en una variable se puede cambiar durante la ejecución del programa.

En Java, todas las variables deben declararse antes de que puedan ser utilizadas.

### Tipos de variables

- __Variables locales__: Son las variables que se declaran dentro de un método, constructor o bloque de código. No pueden ser declaradas como _static_. Su ámbito es limitado al bloque en el que se declaran. No se inicializan por defecto, por lo que es necesario asignarles un valor antes de su uso. Por ejemplo:

```java
public class Variables {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println(numero);
    }
}
```

- __Variables de instancia__: Son las variables que se declaran dentro de una clase, pero fuera de un método, constructor o bloque de código. No pueden ser declaradas como _static_. Su ámbito es limitado a la clase en la que se declaran. Por ejemplo:

```java
public class Variables {
    int numero = 10;
    public static void main(String[] args) {
        System.out.println(numero);
    }
}
```

- __Variables de clase__: Son las variables que se declaran dentro de una clase, pero fuera de un método, constructor o bloque de código. Se declaran con la palabra reservada _static_. Su ámbito es limitado a la clase en la que se declaran. Por ejemplo:

```java
public class Variables {
    static int numero = 10;
    public static void main(String[] args) {
        System.out.println(numero);
    }
}
```

- __Variables de bloque__: Son las variables que se declaran dentro de un bloque de código. Su ámbito es limitado al bloque en el que se declaran. No es necesario asignarles un valor antes de su uso. Por ejemplo:

```java
public class Variables {
    public static void main(String[] args) {
        int numero;
        System.out.println(numero);
    }
}
```

- __Variables de parámetros__: Son las variables que se declaran dentro de un método. Su ámbito es limitado al método en el que se declaran. No es necesario asignarles un valor antes de su uso. Por ejemplo:

```java
public class Variables {
    public static void main(String[] args) {
        System.out.println(args);
    }
}
```

### Consideraciones y buenas prácticas de programación en el uso de variables

1. _Nombres claros y significativos:_ Es importante que los nombres de las variables sean claros y significativos para facilitar la comprensión y mantenimiento del código.

2. _Uso de nombres estándar:_ Es recomendable seguir las convenciones de nombramiento estándar en Java, como usar nombres en CamelCase para variables y métodos, y nombres en mayúsculas para constantes.

3. _Inicialización de variables:_ Las variables deben inicializarse antes de su uso para evitar errores de tiempo de ejecución.

4. _Tipos de datos adecuados:_ Es importante elegir el tipo de datos adecuado para cada variable para asegurar la precisión y el rendimiento.

5. _Evite el uso de variables globales:_ El uso de variables globales puede ser una fuente de errores y dificultades en la mantenibilidad del código. En su lugar, es mejor usar variables locales o miembros de clase con modificadores de acceso adecuados.

6. _Evite el uso de variables magicas:_ Las variables mágicas son aquellas que tienen valores duros codificados en el código y que no tienen una descripción clara de su significado o uso. Estas variables deben evitarse y reemplazarse por constantes o variables con nombres claros y significativos.

7. _Evite el acoplamiento entre clases:_ Evite hacer referencia directa a variables de otras clases, ya que esto crea un acoplamiento entre las clases y dificulta la reutilización y mantenibilidad del código. En su lugar, es mejor usar métodos para acceder y manipular variables.

8. _Evite la asignación múltiple de variables:_ Evite asignar el mismo valor a la misma variable más de una vez, ya que puede ser confuso y difícil de mantener. En su lugar, es mejor crear nuevas variables con nombres claros y significativos.

## Tipos de datos en Java {#tipos-de-datos}
### Primitivos

Java es un lenguaje de tipado estático. Es decir, se define el tipo de dato de la variable a la hora de definir esta. Es por ello que todas las variables tendrán un tipo de dato asignado.

- _byte_ Representa un tipo de dato de 8 bits con signo. De tal manera que puede almacenar los valores numéricos de -128 a 127
- _short_ Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.
- _int_ Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. Cuyo valor mínimo es -231 y el valor máximo 231-1.
- _long_ Es un tipo de dato de 64 bits con signo que almacena valores numéricos entre -263 a 263-1
- _float_ Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.
- _double_ Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.
- _boolean_ Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.
- _char_ Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits. ![Ver mapa de caractéres Unico](https://unicode-table.com/es/)
- _var_ Se introdujo en Java 10. La inferencia de tipos se utiliza en la palabra clave var en la que detecta automáticamente el tipo de datos de una variable en función del contexto circundante.

> **Nota:** En los números tipo float y double se puede usar la letra e para notación científica, donde e va seguido de un número y es el número de espacios que se recorre el punto a la derecha, pro ejemplo 2.12e3f es igual a 2120.0, si se usa un número negativo después de la e, el punto se recorre a la izquierda, por ejemplo 1.5e-10f = 0.00000000015f

### No primitivos

- _Object_ Es un tipo de dato que representa un objeto. Es decir, una instancia de una clase. Es un tipo de dato no primitivo.
- _String_ Es un tipo de dato que representa una secuencia de caracteres. Es decir, una cadena de texto. Es un tipo de dato no primitivo.
- _Arrays_ Es un tipo de dato que representa una secuencia de elementos del mismo tipo. Es decir, un conjunto de datos del mismo tipo. Es un tipo de dato no primitivo.
- _Clases_ Es un tipo de dato que representa un conjunto de datos de diferentes tipos. Es un tipo de dato no primitivo.
- _Interfaces_ Es un tipo de dato que representa un conjunto de métodos que deben ser implementados por una clase. Es un tipo de dato no primitivo.
- _Enum_ Es un tipo de dato que representa un conjunto de constantes. Es un tipo de dato no primitivo.

### Modificadores de acceso y no acceso

Los modificadores de acceso son palabras clave que se utilizan para controlar el acceso a los elementos de una clase. Estos modificadores se aplican a las clases, atributos, métodos y constructores. Hay cuatro tipos de modificadores de acceso en Java:

- _public_: El elemento es accesible desde cualquier lugar.
- _protected_: El elemento es accesible desde la misma clase, subclases y paquetes.
- _default_: El elemento es accesible desde la misma clase y paquetes.
- _private_: El elemento es accesible solo desde la misma clase.

Además de los modificadores de acceso, también hay modificadores de no acceso. Estos modificadores se aplican a los atributos y métodos, pero no a las clases y constructores. Hay tres tipos de modificadores de no acceso en Java:

- _static_: El elemento pertenece a la clase en lugar de a un objeto.
- _final_: El elemento no puede ser modificado.
- _abstract_: El elemento no tiene una implementación.
- _synchronized_: El elemento se puede usar para controlar el acceso concurrente.
- _volatile_: El elemento se puede usar para indicar que un atributo puede cambiar de forma inesperada.
- _transient_: El elemento se puede usar para indicar que un atributo no es serializable.

> **Nota:** Los modificadores de acceso y no acceso se pueden combinar. Por ejemplo, public final indica que el elemento es público y no puede ser modificado.

> **Tip:** Una pregunta muy frecuente durante las entrevistas de trabajo es "¿Que diferencia hay entre una clase static y una clase normal?". La respuesta que una clase estática es una clase que se puede utilizar sin tener que crear una instancia de la clase. Por otro lado, una clase normal se crea mediante la instanciación de un objeto a partir de ella. Cada instancia de una clase normal tiene su propia copia de los métodos y variables de la clase.

#### Consideraciones y buenas prácticas de programación con modificadores de acceso

Algunas consideraciones y buenas prácticas de programación con modificadores de acceso incluyen:

1. Minimizar el acceso público: Es recomendable minimizar el número de elementos con acceso público en una clase o módulo. Esto es porque los elementos públicos son accesibles desde cualquier parte del código y pueden ser modificados o manipulados fácilmente.

2. Utilizar la privacidad por defecto: Por defecto, los elementos de una clase o módulo deben ser privados. Esto es porque los elementos privados sólo son accesibles desde el interior de la clase o módulo y protegen la integridad de los datos.

3. Utilizar modificadores de acceso apropiados: Es importante elegir el modificador de acceso adecuado para cada elemento de una clase o módulo. Por ejemplo, los métodos y atributos que deben ser accesibles desde otras clases o módulos deben ser públicos o protegidos.

4. Documentación: Es importante documentar cualquier cambio en los modificadores de acceso. Esto ayuda a otros programadores a comprender la intención detrás de los cambios y a seguir utilizando la clase o módulo de manera adecuada.

5. Evitar la exposición innecesaria: Es importante evitar exponer elementos que no necesitan ser accesibles desde otras partes del código. Esto reduce la superficie de ataque del código y mejora la seguridad del sistema.

Estas son solo algunas de las consideraciones y buenas prácticas de programación con modificadores de acceso. El uso correcto de los modificadores de acceso es esencial para la construcción de sistemas seguros, fiables y mantenibles
