import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres2 = new String[6];
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco",
                "Lalo", "Bea", "Pato", "Pepa"};
    int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("pepa")) {
                continue;
            }
            System.out.println(nombres[i]);
        }
        /*if (nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                nombres[i].toLowerCase().contains("pePa".toLowerCase())){
            continue;
        }*/

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\"");
        System.out.println("Buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no fue encontrado");

        }

    }
}
