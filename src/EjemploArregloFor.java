public class EjemploArregloFor {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";


        for (int i = 0; i < total; i++){
            System.out.println("Para inidice " + i + " : " + productos[i]);
        }
        System.out.println("=== Usando foreach ===");
        for (String proud: productos){
            System.out.println("proud = " +  proud);
        }

        System.out.println("=== Usando while ===");
        int i = 0;
        while (i < total){
            System.out.println("para indice = " +  productos[i]);
            i++;
        }

        System.out.println("=== Do while ===");
        int j = 0;
        do {
            System.out.println("para indice = " +  productos[i]);
            j++;
        }while (j < total);

        int[] numeros = new int[10];

        int totalNumeros = numeros.length;

        for (int k = 0; k < totalNumeros; k++ ){
            numeros[k] = k*3;

        }

        for (int k = 0; k < totalNumeros; k++ ){
            System.out.println("numeros = " + numeros[k]);

        }
    }
}
