public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo tres triste tigres tragan trigo en un trigal trigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        System.out.println("palabra: " + maxPalabra);
        int maxFrase = frase.length() - maxPalabra;
        System.out.println("frase: " + maxFrase);
        System.out.println("frase2: " + frase.length());


        int cantidad = 0;
        char letra = 'g';
        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i;
            System.out.println("k = " + k);
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;

        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase ");
    }
}
