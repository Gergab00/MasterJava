package org.masterjava.anotaciones;

import java.lang.annotation.*;

@Documented //Que se documentado en Javadoc
@Target(ElementType.FIELD) //El lugar donde se va a ejecutar
@Retention(RetentionPolicy.RUNTIME) //Cuando se va a ejecutar
public @interface JsonAtributo {
    String nombre() default "";
}
