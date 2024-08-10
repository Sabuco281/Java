public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";
        
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        //si encuentra una cadena a la izquierda lo tomara
        // todo como  una cadena para evitar eso se utiza parentesis, para aclarar la prioridad
        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
