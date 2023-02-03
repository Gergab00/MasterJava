# Entrada de datos. Lectura de datos por teclado en Java. Scanner y BufferedReader

La entrada o lectura de datos en Java es uno de los conceptos más importantes y fundamentales al momento de interactuar con el usuario de nuestro programa. La entrada de datos en Java, a diferencia de otros lenguajes es un poco complicada (no demasiado) y existen diferentes formas de hacerlo, unas más complejas que otras. En esta sección veremos dos maneras sencillas de leer datos para nuestro programa en Java, veremos entonces dos formas de leer datos del usuario por teclado. La primera usando las clases __BufferedReader__ y __InputStreamReader__ ambas de la librería _java.io_ y la segunda con la clase __Scanner__ de la librería _java.util_.

## Lectura de entrada por teclado usando la clase Scanner

La clase Scanner de la librería java.util es también muy sencilla para obtener datos de entrada del usuario, a diferencia de BufferedReader, Scanner si posee un método para la lectura de números y para la lectura de texto que nos ayudarán a facilitar un poco las cosas

## Lectura de datos por teclado con BufferedReader y InputStreamReader

La entrada de datos con estas dos clases se puede hacer un menos de tres líneas según lo que necesitemos hacer, veremos cómo leer números y texto y las particularidades de ambos casos al usar estas clases.

~~~java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaJava
{
    public static void main(String[] args) throws IOException
    {
        //Notar que readLine() nos obliga a declarar IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato

        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario

        String entrada = br.readLine(); //Se guarda la entrada (edad) en una variable

        //Nótese que readLine siempre retorna String y la clase BufferedReader...
        //no tiene un método para leer enteros, así que debemos convertirlo.

        int edad = Integer.parseInt(entrada);//Se transforma la entrada anterior en un entero
        //Si el usuario ingresó solo números funcionará bien, de lo contrario generará una excepción

        System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años."); //Operacion numerica con la edad
    }
}
~~~

## Conversiones de Tipos

En Java es posible transformar el tipo de una variable u objeto en otro diferente al original con el que fue declarado. Este proceso se denomina __"conversión"__, __"moldeado"__ o __"tipado"__ y es algo que debemos manejar con cuidado pues un mal uso de la conversión de tipos es frecuente que dé lugar a errores.

Una forma de realizar conversiones consiste en colocar el tipo destino entre paréntesis, a la izquierda del valor que queremos convertir de la forma siguiente: Tipo VariableNueva = (NuevoTipo) VariableAntigua;

Por ejemplo: _int miNumero = (int) ObjetoInteger;      char c = (char)System.in.read();_

En el primer ejemplo, extraemos como tipo primitivo int el valor entero contenido en un campo del objeto Integer. En el segundo caso, la función read devuelve un valor int, que se convierte en un char debido a la conversión (char), y el valor resultante se almacena en la variable de tipo carácter c.

El tamaño de los tipos que queremos convertir es muy importante. No todos los tipos se convertirán de forma segura. Por ejemplo, al convertir un long en un int, el compilador corta los 32 bits superiores del long (de 64 bits), de forma que encajen en los 32 bits del int, con lo que si contienen información útil, ésta se perderá. Este tipo de conversiones que suponen pérdida de información se denominan “conversiones no seguras” y en general se tratan de evitar, aunque de forma controlada pueden usarse puntualmente.

De forma general trataremos de atenernos a la norma de que "en las conversiones debe evitarse la pérdida de información". En la siguiente tabla vemos conversiones que son seguras por no suponer pérdida de información.

__TIPO ORIGEN__     __TIPO DESTINO__
byte            double, float, long, int, char, short
short           double, float, long, int
char            double, float, long, int
int             double, float, long
long            double, float
float           Double

No todos los tipos se pueden convertir de esta manera. Como alternativa, existen otras formas para realizar conversiones.

### MÉTODO VALUEOF PARA CONVERSIÓN DE TIPOS

El método valueOf es un método sobrecargado aplicable a numerosas clases de Java y que permite realizar conversiones de tipos. Veamos algunos ejemplos de uso.

__EXPRESIÓN__                                       __INTERPRETACIÓN__
miInteger = miInteger.valueOf (i)               Con i entero primitivo que se transforma en Integer
miInteger = miInteger.valueOf (miString)        El valor del String se transforma en Integer
miString = miString.valueOf (miBooleano)        El booleano se transforma en String “true” o “false”
miString = miString.valueOf (miChar)            El carácter (char) se transforma en String
miString = miString.valueOf (miDouble)          El double se transforma en String. Igualmente aplicable a float, int, long.

No todas las conversiones son posibles. Muchas veces por despiste los programadores escriben instrucciones de conversión incoherentes como miInteger = (int) miString;. El resultado en este caso es un error de tipo “Inconvertible types”. Un uso típico de valueOf es para convertir tipos primitivos en objetos.
