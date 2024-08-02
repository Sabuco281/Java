import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr =  JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroBinario);
        System.out.println(resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0X1F4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;

        mensaje += resultadoOctal;
        mensaje += resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
}
