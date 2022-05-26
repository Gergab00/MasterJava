import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        int numeroDecimal = 500;

        //System.out.println("Número binario de numeroDecimal " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) );

        int numeroBinario = 0b111110100;//Con el 0b al inicio JAva interpreta este número como binario.
        System.out.println("numeroBinario = " + numeroBinario);// Al imprimirse en consola se obtiene el 500

        System.out.println("Número octal de numeroDecimal " + numeroDecimal + " = " + Integer.toOctalString(numeroBinario) );

        int numeroOctal = 0764; // al antepone run cero a cualquier número int, JAva lo interpreta como Octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("Número hexadecimal de numeroDecimal " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) );

        int numeroHex = 0x1f4; //Se antepone 0x para indicar a Java que es hexadecimal.
        System.out.println("numeroHex = " + numeroHex);

        int nDecimal = Integer.parseInt( JOptionPane.showInputDialog(null, "Ingrese un número entero:") );
        System.out.println("Número binario de " + nDecimal + " = " + Integer.toBinaryString(nDecimal) );
        System.out.println("Número octal de " + nDecimal + " = " + Integer.toOctalString(nDecimal) );
        System.out.println("Número hexadecimal de " + nDecimal + " = " + Integer.toHexString(nDecimal) );

        JOptionPane.showMessageDialog(null, "Número binario de " + nDecimal + " = " + Integer.toBinaryString(nDecimal) );
        JOptionPane.showMessageDialog(null, "Número octal de " + nDecimal + " = " + Integer.toOctalString(nDecimal) );
        JOptionPane.showMessageDialog(null, "Número hexadecimal de " + nDecimal + " = " + Integer.toHexString(nDecimal) );
    }
}
