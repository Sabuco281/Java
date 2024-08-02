public class CaracteresCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println((decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == simbolo));

        char espacio = '\u0020'; //hacer un espacio en unicode
        char retroceso = '\b'; //hacer un retroceso
        char tabulador = '\t';// para hacer un tabulador
        char nuevaLinea = '\n';
        char retornoCarro = '\r'; //baja una linea tanto el retorno como la nueva linea

        System.out.println("char corresponde en byte = "+ System.getProperty("line.separator") + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("character.MAX_VALUE = " + Character.MAX_VALUE);



    }
}
