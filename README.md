# MasterJava
Curso tomado para repasar y actualizar conceptos de Java. Aprende con el mejor curso Java de cero con las mejores prácticas POO, Java EE 9, CDI, JPA, EJB, JSF, Web Services, JAAS
## Historia de Java

![Logo Java](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Duke_%28Java_mascot%29_waving.svg/140px-Duke_%28Java_mascot%29_waving.svg.png)

Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems. Hay muchas aplicaciones y sitios web que no funcionarán, probablemente, a menos que tengan Java instalado, y cada día se crean más. Java es rápido, seguro y fiable. Desde ordenadores portátiles hasta centros de datos, desde consolas para juegos hasta computadoras avanzadas, desde teléfonos móviles hasta Internet, Java está en todas partes. Si es ejecutado en una plataforma no tiene que ser recompilado para correr en otra. Java es, a partir de 2012, uno de los lenguajes de programación más populares en uso, particularmente para aplicaciones de cliente-servidor de web, con unos diez millones de usuarios reportados.2​3​

El lenguaje de programación Java fue desarrollado originalmente por James Gosling, de Sun Microsystems (constituida en 1983 y posteriormente adquirida el 27 de enero de 2010 por la compañía Oracle),4​ y publicado en 1995 como un componente fundamental de la plataforma Java de Sun Microsystems. Su sintaxis deriva en gran medida de C y C++, pero tiene menos utilidades de bajo nivel que cualquiera de ellos. Las aplicaciones de Java son compiladas a bytecode (clase Java), que puede ejecutarse en cualquier máquina virtual Java (JVM) sin importar la arquitectura de la computadora subyacente.

La compañía Sun desarrolló la implementación de referencia original para los compiladores de Java, máquinas virtuales y librerías de clases en 1991, y las publicó por primera vez en 1995. A partir de mayo de 2007, en cumplimiento de las especificaciones del Proceso de la Comunidad Java, Sun volvió a licenciar la mayoría de sus tecnologías de Java bajo la Licencia Pública General de GNU. Otros han desarrollado también implementaciones alternas a estas tecnologías de Sun, tales como el Compilador de Java de GNU y el GNU Classpath.

## Identificadores, palabras reservadas y Camel Case en Java

### ¿Que son las palabras reservadas en Java?
En Java, existen un conjunto de palabras que como su propio nombre indican, están reservadas para el propio lenguaje de programación. Si pensamos en programar, hasta un programa sencillo necesitará crear una clase, definir un tipo de variable o crear un bucle. Todo esto lo hacemos con estás palabras reservadas. Por lo tanto, no se pueden usar como identificadores por el programador ya que dichas palabras están reservadas para identificar funciones dentro del lenguaje de programación.

Con identificadores, nos referimos a un nombre que identifique a cualquier objeto, variable o clase.

abstract	class	final	int	public	this
assert	continue	finally	interface	return	throw
boolean	default	float	long	short	throws
break	do	for	native	static	transient
byte	double	if	new	strictfp	try
case	else	implements	package	super	void
catch	enum	import	private	switch	volatile
char	extends	instanceof	protected	synchronized	while
null	true	false

Todos los identificadores ya sean variables, constantes, clases; necesitan cumplir ciertas reglas sintácticas para poder funcionar perfectamente:

1. __No utilizar ninguna palabra reservada__ por el lenguaje de programación (vistas en la parte de arriba).
2. __Empezar siempre por una letra__, símbolo de dolar ($) o barra baja (\_).
3. __Key Sensitive__: distingue entre mayúsculas y minúsculas. Por ejemplo si guardamos un archivo con estos 3 identificadores (nombres) ___hola___, ___Hola___ o ___hOla___, serán completamente diferentes para Java.
4. __Se desaconseja todo uso de espacios__: usar espacios es una mala práctica en Java debido a que en las clases funciona pero en las variables no. Por ello mejor no usarlos y así nos evitaremos futuros problemas.
5. __Los identificadores no tienen limite de longitud__: es decir, no tienen caracteres máximos.

### La notación Camel Case en Java

Camel Case, consiste en unir palabras sin dejar espacios y recibe dicho nombre por la similitud con las jorobas de los camellos.

-__Upper Camel Case__: Toda letra inicial de palabra en mayúsculas (Upper) y el resto de la palabra en minúsculas y las siguientes palabras, la letra inicial en mayúsculas (Upper) y el resto de palabra en minúscula. Usaremos Upper Camel Case para las clases.
-__Lower Camel Case__: Toda la palabra inicial en minúsculas (Lower) y la siguiente palabra comenzará con la primera letra inicial en mayúsculas y el resto de la palabra en minúsculas. Usaremos Lower Camel Case para los métodos y variables

## Variables

Una variable es el nombre dado a una ubicación de memoria. Es la unidad básica de almacenamiento en un programa. El valor almacenado en una variable se puede cambiar durante la ejecución del programa.

En Java, todas las variables deben declararse antes de que puedan ser utilizadas.

## Tipos de datos
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

___Nota:___ En los números tipo float y double se puede usar la letra e para notación científica, donde e va seguido de un número y es el número de espacios que se recorre el punto a la derecha, pro ejemplo 2.12e3f es igual a 2120.0, si se usa un número negativo después de la e, el punto se recorre a la izquierda, por ejemplo 1.5e-10f = 0.00000000015f

## Otros links
[Anotaciones](/documents/Anotaciones.md)
[Big O Notation](/documents/BigONotation.md)
[Entrada de datos. Lectura de datos por teclado en Java. Scanner y BufferedReader](/documents/EntradasDeDatos.md)
[Interfaces Funcionales](/documents/InterfacesFuncionales.md)