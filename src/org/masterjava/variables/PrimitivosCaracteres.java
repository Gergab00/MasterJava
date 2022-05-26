package org.masterjava.variables;

public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char caracter = 'a';
        System.out.println("caracter = " + caracter);
        caracter = '\u0040';
        System.out.println("caracter = " + caracter);
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter" + (decimal == caracter));

        System.out.println("Tipo Character corresponde en byte a: " + Character.BYTES);
        System.out.println("Tipo Character corresponde en bites a: " + Character.SIZE);
        System.out.println("Valor máximo de un Character: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un Character: " + Character.MIN_VALUE);



    }
}
