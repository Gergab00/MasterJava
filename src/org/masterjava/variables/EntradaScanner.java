package org.masterjava.variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        String numeroString = in.nextLine();//Con este método se obtiene un String, pero esta el método nextInt() que regresa un Integer
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e){
            System.out.println("¡Error debes ingresar un número entero!" + e);
            main(args);
            System.exit(0);
        }

        String mensaje = "";
        mensaje += "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n";
        mensaje += "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\n";
        mensaje += "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n";

        System.out.println(mensaje);

        try {
            System.out.println("Ingresa un número entero: ");
            numeroDecimal = in.nextInt();//Con este método se obtiene un Integer
        } catch (InputMismatchException e){
            System.out.println("¡Error debes ingresar un número entero!" + e);
            main(args);
            System.exit(0);
        }

        mensaje += "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\n";
        mensaje += "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\n";
        mensaje += "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) + "\n";

        System.out.println(mensaje);
    }
}
