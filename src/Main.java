//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        String saludar = "Hola mundo desde Java";
        System.out.printf(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());
        
        Integer numero = 10;

        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("Numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        //Es para indicar un tipo flexible de forma dinamica puede ser integer o string
        var numero3 = "15";

        String nombre;
                nombre = "Pepito";
        if(numero > 10){
            nombre = "Juan";
        }
        /*System.out.println("nombre = " + nombre);*/

       // int e5dad1 = 5;
    }
}