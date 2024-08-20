import java.sql.Array;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];


        System.out.println("Productos[0] = " + productos[0]);
        System.out.println("Productos[1] = " + productos[1]);

        System.out.println("Productos[2] = " + productos[2]);
        System.out.println("Productos[3] = " + productos[3]);
        System.out.println("Productos[4] = " + productos[4]);
        System.out.println("Productos[3] = " + productos[5]);
        System.out.println("Productos[6] = " + productos[6]);


        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 1;
        numeros[3] = 1;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("l = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
