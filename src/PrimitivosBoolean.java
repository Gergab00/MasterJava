public class PrimitivosBoolean {

    public static void main(String[] args) {

        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);
        datoLogico = Boolean.FALSE; //En este caso se retorna una instancia. Solo para usos de ejemplo, en la practica no se usa.<s
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; //98.76543
        float f = 12345e2f; //123.45

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
