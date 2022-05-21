public class HelloWorld {
    public static void main(String[] args){

        System.out.println("HelloWorld from Java");
        System.out.println("Mi nombre es Gerardo");

        String saludar = "Helloworld from Java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            numero2 = 20;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15"; //Nueva variable que no es tipada.
    }
}
