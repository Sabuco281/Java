public class PrimitivosBoolean {

    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);
        
        float f = 12345e2f; //123.45
        System.out.println("f = " + f);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);

        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);
    }
}
