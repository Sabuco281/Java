import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void main(String[] args) {
        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";
        int total = productos.length;

        for (int i = 0; i < total; i++){
            for (int j = 0; j < total; j++){
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            }
        }


    }
}
