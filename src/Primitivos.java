public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a" + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a" + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);
        
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);

        System.out.println("tipo Short corresponde en byte a" + Short.BYTES);
        System.out.println("tipo Short corresponde en bites a" + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 214748364;
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("tipo Short corresponde en byte a" + Integer.BYTES);
        System.out.println("tipo Short corresponde en bites a" + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("tipo Long corresponde en byte a" + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a" + Long.SIZE);
        System.out.println("Valor máximo de un Long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un Long: " + Long.MIN_VALUE);

        //Tipo flexible, sera el valor que le pongas y se adaptara
        var numeroVar = 127;

    }
}
