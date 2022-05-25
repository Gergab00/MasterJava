public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 2.12e3f; //La e significa que el punto se recorre 3 lugares a la derecha, este valor es igual a 2120f
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo Float corresponde en byte a: " + Float.BYTES);
        System.out.println("Tipo Float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor máximo de un Float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un Float: " + Float.MIN_VALUE);

        double realDouble = 3.402823e39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo Double corresponde en byte a: " + Double.BYTES);
        System.out.println("Tipo Double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor máximo de un Double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un Double: " + Double.MIN_VALUE);
    }

}
