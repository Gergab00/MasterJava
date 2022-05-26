package org.masterjava.anotaciones.ejemplo;

import org.masterjava.anotaciones.JsonAtributo;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {

    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre(("Mesa centro roble"));
        p.setPrecio(1000L);

        //Se obtienen los campos declarados con la anotacion
        Field[] atributos = p.getClass().getDeclaredFields();

        String json = Arrays.stream(atributos)//Se pasa el array obtenido arriba a un objeto por medio de stream
                    .filter(f -> f.isAnnotationPresent(JsonAtributo.class))//Se filtran los resultados que sean de la clase JsonAtributo que es donde estan las anotaciones
                    .map(f -> { //El filtrado obtenido se mapea
                        f.setAccessible(true); //Los campos privados del objeto Producto se hace accesibles
                        String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")//Si el campo nombre esta vacio
                                        ? p.getNombre() // Se asigna el nombre de la clase dado anteriormente
                                        : f.getAnnotation(JsonAtributo.class).nombre(); // Si no se obtiene de los campos por defecto de las anotaciones
                        try {
                            return "\"" + nombre + "\":\"" + f.get(p) + "\""; //Se devuelve el objeto Json
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException("Error al serializar el Json: " + e);
                        }
                    })
                    .reduce("{", (a,b) -> {
                        if ("{".equals(a)){ // Con esta función se revisa si el objeto empieza con llave, si empieza con coma lo elimina
                            return a + b;
                        }
                        return a + ", " + b;
                    }).concat("}");
        System.out.println("json = " + json);
    }
}
