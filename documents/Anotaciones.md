# Anotaciones

## ¿Qué son las Anotaciones en Java?

Las anotaciones en Java son una especie de etiquetas en el código que describen los metadatos de una función/clase/paquete. Por ejemplo, la conocida anotación @Override, que indica que vamos a anular un método de una clase padre. Por un lado podemos hacerlo sin ella, pero si el padre no tiene este método, es posible que hayamos escrito el código en vano, porque este método en particular puede no ser llamado nunca, mientras que con la anotación @Override el compilador nos lo dirá: “No he encontrado un método así en los padres… algo falla aquí“.

Pero las anotaciones no sólo pueden tener el sentido de “por seguridad”: se pueden almacenar algunos datos que se utilizarán más adelante.

La anotación más simple aplicada a una clase se ve así:
~~~java
@MiAnotacion
public class Foo {}
~~~

## Anotaciones Simples

En primer lugar, veamos las anotaciones simples que proporciona la biblioteca estándar.

La anotación viene dada por una descripción de la interfaz correspondiente. Por ejemplo, así:
~~~java
import java.lang.annotation.*;
@Target(value=ElementType.FIELD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Nombre {
String name();
String type() default "string";
}
~~~
Como puedes ver en el ejemplo anterior, la anotación está definida por una descripción con la palabra clave interface y puede incluir varios campos, que se pueden establecer como obligatorios o no obligatorios. En este último caso, se inserta el valor por defecto del campo.
También puedes ver en el ejemplo que la propia anotación puede ser etiquetada con varias anotaciones.

Entonces, hablemos de lo que son las anotaciones. Cada uno de ellos tiene 2 parámetros principales obligatorios:

Tipo de retención (__Retention__). Nos permite especificar el ciclo de vida de la anotación: estará presente sólo en el código fuente, en el archivo compilado, o también será visible en tiempo de ejecución. La elección del tipo adecuado depende de cómo se quiera utilizar la anotación, como por ejemplo generando algo al margen del código fuente, o en tiempo de ejecución llamando a una clase mediante reflexión.
Objetivo (__Target__). Especifica qué podemos marcar exactamente con esta anotación, puede ser un campo, un método, un tipo, etc.