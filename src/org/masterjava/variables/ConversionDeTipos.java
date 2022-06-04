package org.masterjava.variables;

public class ConversionDeTipos {

    public static void main(String[] args) {
        String numeroString = "50";

        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("numeroInt = " + numeroInt);

        String realString = "98765.43";
        double realDouble = Double.parseDouble(realString);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TrUe"; //Aqui puede tener mayusculas y minusculas y lo va a interpretar
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }
}
